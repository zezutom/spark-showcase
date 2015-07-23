package org.zezutom.planner.tasks

class CaseOfficersFinder extends DataTask[Array[String]] {

  val fieldName = "CASEOFFICER"

  override def query(repo: Repository) =
    repo.sqlContext.sql(s"select distinct $fieldName from cases order by $fieldName")
      .map(row => row.getAs[String](fieldName))
      .collect()

  override def asString(outcome: Array[String]): String = outcome.mkString("\n")
}
