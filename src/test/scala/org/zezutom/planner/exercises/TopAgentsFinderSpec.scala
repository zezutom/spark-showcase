package org.zezutom.planner.exercises

import org.scalatest.Matchers

class TopAgentsFinderSpec extends AppSpec with Matchers {
  "The top performers" should "be found" in {
    When("I ask for top performers without providing a limit")
    val agents = new TopAgentsFinder().execute(repo)

    Then("Top ten agents should be returned, sorted by performance")
    agents should equal(
      Array("Mr Patrick Dunne", "Mr Peter Wood")
    )
  }
}
