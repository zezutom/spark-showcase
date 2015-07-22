package org.zezutom.planner.exercises

class TopAgentsFinder(val limit: Integer = 10) extends DataTask[Array[String]] {

  override def execute(repo: Repository): Array[String] =
    repo.sqlContext.sql("SELECT AGENT, COUNT(*) AS cnt FROM cases " +
      "WHERE AGENT <> '' " +
      "GROUP BY AGENT " +
      "ORDER BY cnt DESC, AGENT ")
      .limit(limit)
      .map(row => row.getAs[String](1))
      .collect()
}
