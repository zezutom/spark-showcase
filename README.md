# Planning App

## Overview
 
This demo analyses planning records from the following dataset:  
* [Dataset Overview](http://data.gov.uk/dataset/planning-applications-northumberland)
* [The Actual Dataset](http://opendata.northumberland.gov.uk/static/datasets/planning-applications-weekly-list/planning-applications-weekly-list.json)

The dataset is a set of building planning application records 
(i.e. applications submitted to request approval to construct / modify building structures) in JSON format. 
This data has been selected based on its small size in order to take the emphasis of the challenge away from 
data manipulation with big data. The dataset is small enough to be processed locally on a single machine 
without the need for a distributed computing cluster.

## Developer Notes
* The code is written using the [Scala 2.11.5](http://www.scala-lang.org/news/2.11.5) and [Apache Spark 1.4.0](http://spark.apache.org/releases/spark-release-1-4-0.html) 
* The code for each task is contained within its own class
* All tasks can be run at once using [Planner App](https://github.com/zezutom/spark-showcase/blob/master/src/main/scala/org/zezutom/planner/PlannerApp.scala)
* Task outcomes can be found [here](https://github.com/zezutom/spark-showcase/tree/master/src/main/resources/outcome)
* Integration tests using [ScalaTest](http://scalatest.org) and [JUnit](http://junit.org)
* The project is powered by [Gradle](http://gradle.org), `gradle test` runs the integrations tests
 
## Exercises & Questions
1. Discover the schema of the input dataset.
2. What is the total number of planning application records in the dataset?
3. Identify the set of case officers (CASEOFFICER field).
4. Who are the top N agents (AGENT field) submitting the most number of applications? Allow N to be configurable.
5. Count the occurrence of each word within the case text (CASETEXT field) across all planning application records.
6. Measure the average public consultation duration in days (i.e. the difference between PUBLICCONSULTATIONENDDATE and PUBLICCONSULTATIONSTARTDATE fields).

## Resources
The following resources proved invaluable, big thanks to:
* [Spark SQL and DataFrame Guide](http://spark.apache.org/docs/latest/sql-programming-guide.html)
* [Spark Programming Guide: RDD Operations](http://spark.apache.org/docs/latest/programming-guide.html#rdd-operations)
* [Spark Streaming Unit Testing](http://mkuthan.github.io/blog/2015/03/01/spark-unit-testing)
* [Introduction to Spark Data Source API](http://blog.madhukaraphatak.com/introduction-to-spark-data-source-api-part-1)
