package org.zezutom.planner.tasks

import org.junit.runner.RunWith
import org.scalatest.Matchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AvgDurationCounterSpec extends AppSpec with Matchers {
  "Average consultation duration" should "be calculated" in {
    Given("I execute AvgDurationCounter task")
    val task = new AvgDurationCounter().execute(repo)

    When("I fetch the average duration")
    val avgDuration = task.outcome

    Then("The resulting value should be as expected")
    task.asString(avgDuration) should equal("53.13")
  }
}
