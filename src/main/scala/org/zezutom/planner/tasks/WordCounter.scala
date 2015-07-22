package org.zezutom.planner.tasks

class WordCounter extends DataTask[Array[(String, Int)]] {

  override def query(repo: Repository): Array[(String, Int)] =
    repo.dataFrame.select("CASETEXT")
      .flatMap(line => line.getString(0).split("\\s"))        // Split on any white character
      .filter(!_.isEmpty)                                     // Only count words as non-empty strings
      .map(_.stripSuffix(",").stripSuffix(".").toLowerCase)   // Remove punctuation and make all words lowercase
      .map(word => (word, 1))
      .reduceByKey(_ + _)
      .sortByKey()
      .collect()

  override def asString(outcome: Array[(String, Int)]): String = outcome.mkString("\n")
}
