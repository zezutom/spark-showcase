package org.zezutom.planner.tasks

import java.nio.file.Paths

import org.scalatest.{GivenWhenThen, BeforeAndAfterEach, FlatSpec}

trait AppSpec extends FlatSpec with BeforeAndAfterEach with GivenWhenThen with SparkSpec {

  val jsonDS = Paths.get("src", "test", "resources", "dataset.json").toString

  private var _repo: Repository = _

  def repo = _repo

  override def beforeEach() {
    super.beforeEach()
    _repo = new Repository(sc, jsonDS)
  }

  override def afterEach() {
    _repo = null
    super.afterEach()
  }
}
