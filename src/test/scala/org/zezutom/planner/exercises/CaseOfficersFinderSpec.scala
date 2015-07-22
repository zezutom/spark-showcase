package org.zezutom.planner.exercises

import org.junit.runner.RunWith
import org.scalatest.Matchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CaseOfficersFinderSpec extends AppSpec with Matchers {
  "All case officers" should "be listed in an alphabetical order" in {
    When("I ask for all case officers")
    val officers = new CaseOfficersFinder().execute(repo)
    
    Then("The resulting list should be complete and sorted in alphabetical order")
    officers should equal(
      Array("Mr Joe Nugent", "Mrs Judith Murphy", "Mrs Sarah Seabury")
    )
  }
}
