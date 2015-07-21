package org.zezutom.planner.exercises

trait DataTask[T] {

  protected var verbose = true

  def execute(repo:Repository): T

  def debug(verbose: Boolean): this.type = {
    this.verbose = verbose
    this
  }
}
