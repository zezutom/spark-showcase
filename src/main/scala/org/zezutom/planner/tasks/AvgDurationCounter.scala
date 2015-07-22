package org.zezutom.planner.tasks

class AvgDurationCounter extends DataTask[Double] {

  override def query(repo: Repository): Double =
    repo.sqlContext
      .sql("SELECT avg(daysBetween(PUBLICCONSULTATIONSTARTDATE, PUBLICCONSULTATIONENDDATE)) FROM cases")
      .first()
      .getDouble(0)

  override def asString(outcome: Double): String = "%3.2f".format(outcome)
}
