package org.zezutom.planner.exercises

object RecordCounter extends DataTask[Long] {

  override def execute(repo: Repository): Long = repo.dataFrame.count()
}
