package org.zezutom.planner.exercises

import org.junit.runner.RunWith
import org.scalatest.Matchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RecordCounterSpec extends AppSpec with Matchers {
  "Records of the provided JSON data set" should "be counted" in {
    When("I count records")
    val count = RecordCounter.execute(repo)
    
    Then("The count should be as expected")
    count should equal(3)
  }
}
