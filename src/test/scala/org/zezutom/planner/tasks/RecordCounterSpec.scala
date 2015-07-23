package org.zezutom.planner.tasks

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RecordCounterSpec extends AppSpec {
  "Records of the provided JSON data set" should "be counted" in {
    Given("I execute RecordCounter task")
    val task = new RecordCounter().execute(repo)

    When("I count records")
    val count = task.outcome
    
    Then("The count should be as expected")
    count should equal(15)
  }
}
