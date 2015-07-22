package org.zezutom.planner.exercises

class RecordCounter extends DataTask[Long] {

  override def execute(repo: Repository): Long = repo.dataFrame.count()
}
