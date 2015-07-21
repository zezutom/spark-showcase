package org.zezutom.planner.exercises

import java.nio.file.Paths

import org.scalatest.{BeforeAndAfterEach, GivenWhenThen, FlatSpec}

trait AppSpec extends FlatSpec with BeforeAndAfterEach with SparkSpec with GivenWhenThen {

  val jsonDS = Paths.get("src", "test", "resources", "dataset.json").toString

  private var _repo: Repository = _

  def repo = _repo

  override def beforeEach {
    super.beforeEach
    Given("I load a JSON data set")
    _repo = new Repository(sc, jsonDS)
  }

  override def afterEach {
    _repo = null
    super.afterEach
  }
}
