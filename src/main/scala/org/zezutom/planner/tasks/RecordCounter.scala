package org.zezutom.planner.tasks

class RecordCounter extends DataTask[Long] {

  override def query(repo: Repository): Long = repo.dataFrame.count()

  override def asString(outcome: Long): String = String.valueOf(outcome)
}
