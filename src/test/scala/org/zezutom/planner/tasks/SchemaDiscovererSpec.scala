package org.zezutom.planner.tasks

import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SchemaDiscovererSpec  extends AppSpec {
  "Schema of the provided JSON data set" should "be discovered" in {
    Given("I execute SchemaDiscoverer task")
    val task = new SchemaDiscoverer().execute(repo)

    When("I ask for a schema")
    val schema = task.outcome

    Then("The schema should be discovered as expected")
    schema should equal(
      StructType.apply(
        Array(
          StructField("AGENT",StringType, nullable = true),
          StructField("AGENTADDRESS", StringType, nullable = true),
          StructField("APPLICANTADDRESS", StringType, nullable = true),
          StructField("APPLICANTNAME", StringType, nullable = true),
          StructField("CASEDATE", StringType, nullable = true),
          StructField("CASEOFFICER", StringType, nullable = true),
          StructField("CASEREFERENCE", StringType, nullable = true),
          StructField("CASETEXT", StringType, nullable = true),
          StructField("CASEURL" ,StringType,nullable = true),
          StructField("COMMITTEEAREA", StringType, nullable = true),
          StructField("DECISION", StringType, nullable = true),
          StructField("DECISIONTARGETDATE", StringType, nullable = true),
          StructField("DECISIONTYPE", StringType, nullable = true),
          StructField("DECISION_ISSUED", StringType, nullable = true),
          StructField("EXPECTEDDECISION", StringType, nullable = true),
          StructField("EXTRACTDATE", StringType, nullable = true),
          StructField("LOCATIONTEXT", StringType, nullable = true),
          StructField("ORGANISATIONLABEL", StringType, nullable = true),
          StructField("ORGANISATIONURI", StringType, nullable = true),
          StructField("PARISH", StringType, nullable = true),
          StructField("PUBLICCONSULTATIONENDDATE", StringType, nullable = true),
          StructField("PUBLICCONSULTATIONSTARTDATE", StringType, nullable = true),
          StructField("PUBLISHERLABEL", StringType, nullable = true),
          StructField("PUBLISHERURI", StringType, nullable = true),
          StructField("RESPONSESAGAINST", StringType, nullable = true),
          StructField("RESPONSESFOR", StringType, nullable = true),
          StructField("WARD", StringType, nullable = true))
      )
    )
  }
}
