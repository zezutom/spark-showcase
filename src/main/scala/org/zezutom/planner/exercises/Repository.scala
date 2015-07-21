package org.zezutom.planner.exercises

import org.apache.spark.SparkContext
import org.apache.spark.sql.{DataFrame, SQLContext}

class Repository(sparkContext: SparkContext, jsonPath: String) {

  val sqlContext: SQLContext = new SQLContext(sparkContext)

  val dataFrame: DataFrame = sqlContext.read
    .format("org.apache.spark.sql.json")
    .options(Map("path" -> jsonPath)).load()

}
