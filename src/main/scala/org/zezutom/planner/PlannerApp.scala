package org.zezutom.planner

import java.nio.file.Paths

import org.apache.spark.{SparkConf, SparkContext}
import org.zezutom.planner.tasks._

object PlannerApp {

  val conf: SparkConf = new SparkConf()
    .setMaster("local[4]").set("spark.driver.host", "localhost")
    .setAppName(getClass.getSimpleName)

  val sc = new SparkContext(conf)

  val jsonDS = Paths.get("src", "main", "resources", "dataset.json").toString

  val repo:tasks.Repository = new tasks.Repository(sc, jsonDS)

  def main(args:Array[String]): Unit = {
    save(new SchemaDiscoverer(), "q1-schema.txt")
    save(new RecordCounter(), "q2-total-records.txt")
    save(new CaseOfficersFinder(), "q3-case-officers.txt")
    save(new TopAgentsFinder(), "q4-top-agents.txt")
    save(new WordCounter(), "q5-word-count.txt")
    save(new AvgDurationCounter(), "q6-avg-consultation-days.txt")
  }

  private def save(task:DataTask[_], fileName:String) = task.execute(repo).save(fileName)
}
