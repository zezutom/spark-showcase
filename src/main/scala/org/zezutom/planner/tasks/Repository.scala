package org.zezutom.planner.tasks

import java.text.{ParseException, SimpleDateFormat, DateFormat}
import java.util.concurrent.TimeUnit

import org.apache.spark.SparkContext
import org.apache.spark.sql.{DataFrame, SQLContext}

class Repository(sparkContext: SparkContext, jsonPath: String) extends Serializable {

  val sqlContext: SQLContext = new SQLContext(sparkContext)
  sqlContext.udf.register("daysBetween", (s1: String, s2: String) => daysBetween(s1, s2))

  val dataFrame: DataFrame = sqlContext.read
    .format("org.apache.spark.sql.json")
    .options(Map("path" -> jsonPath)).load()
  dataFrame.registerTempTable("cases")

  private def daysBetween(start: String, end: String): Long = {
    val df: DateFormat = new SimpleDateFormat("dd/MM/yyyy")
    try {
      val diff = df.parse(end).getTime - df.parse(start).getTime
      TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)
    } catch {
      case e: ParseException => 0
    }
  }

}
