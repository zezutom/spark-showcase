package org.zezutom.planner.exercises

class CaseOfficersFinder extends DataTask[Array[String]] {

  val fieldName = "CASEOFFICER"

  override def execute(repo: Repository) = {
    val col = repo.dataFrame(fieldName)
    repo.dataFrame.select(col)
      .distinct
      .filter(col.isNotNull.and(col.notEqual("")))
      .orderBy(col)
      .map(row => row.getAs[String](fieldName))
      .collect()
  }
}
