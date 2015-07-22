package org.zezutom.planner.tasks

class CaseOfficersFinder extends DataTask[Array[String]] {

  val fieldName = "CASEOFFICER"

  override def query(repo: Repository) = {
    val col = repo.dataFrame(fieldName)
    repo.dataFrame.select(col)
      .distinct
      .filter(col.isNotNull.and(col.notEqual("")))
      .orderBy(col)
      .map(row => row.getAs[String](fieldName))
      .collect()
  }

  override def asString(outcome: Array[String]): String = outcome.mkString("\n")
}
