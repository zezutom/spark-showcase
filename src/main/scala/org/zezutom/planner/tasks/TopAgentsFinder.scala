package org.zezutom.planner.tasks

class TopAgentsFinder(val limit: Integer = 10) extends DataTask[Array[(String, Long)]] {

  override def query(repo: Repository): Array[(String, Long)] =
    repo.sqlContext.sql("SELECT AGENT, COUNT(*) AS cnt FROM cases " +
      "WHERE AGENT <> '' " +
      "GROUP BY AGENT " +
      "ORDER BY cnt DESC, AGENT ")
      .limit(limit)
      .map(row => (row.getAs[String](0), row.getAs[Long](1)))
      .collect()

  override def asString(outcome: Array[(String, Long)]): String = outcome.mkString("\n")
}
