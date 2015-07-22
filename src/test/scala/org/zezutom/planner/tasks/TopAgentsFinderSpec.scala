package org.zezutom.planner.tasks

import org.scalatest.Matchers

class TopAgentsFinderSpec extends AppSpec with Matchers {
  "The top performers" should "be found" in {
    Given("I execute TopAgentsFinder task")
    val task = new TopAgentsFinder().execute(repo)

    When("I ask for top performers without providing a limit")
    val agents = task.outcome

    Then("Top ten agents should be returned, sorted by performance")
    agents should equal(
      Array("Mr Patrick Dunne", "Mr Peter Wood")
    )
  }
}
