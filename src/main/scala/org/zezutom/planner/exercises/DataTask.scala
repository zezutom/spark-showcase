package org.zezutom.planner.exercises

trait DataTask[T] extends Serializable {

  def execute(repo:Repository): T
}
