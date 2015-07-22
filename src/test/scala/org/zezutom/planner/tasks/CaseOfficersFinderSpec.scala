package org.zezutom.planner.tasks

import org.junit.runner.RunWith
import org.scalatest.Matchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CaseOfficersFinderSpec extends AppSpec with Matchers {
  "All case officers" should "be listed in an alphabetical order" in {
    Given("I execute CaseOfficersFinder task")
    val task = new CaseOfficersFinder().execute(repo)

    When("I ask for all case officers")
    val officers = task.outcome
    
    Then("The resulting list should be complete and sorted in alphabetical order")
    officers should equal(
      Array(
        "Central Registry Team",
        "Miss Joanne Wood",
        "Mr Craig Ross",
        "Mr Joe Nugent",
        "Mr John Dowsett",
        "Mr Tony Carter",
        "Mrs Alison Wilkinson",
        "Mrs Anna Hilditch",
        "Mrs Catherine Winsett",
        "Mrs Esther Ross",
        "Mrs Judith Murphy",
        "Mrs Sarah Seabury",
        "Mrs Vivienne Cartmell"
      )
    )
  }
}
