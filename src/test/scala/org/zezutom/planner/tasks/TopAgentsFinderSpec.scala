package org.zezutom.planner.tasks

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TopAgentsFinderSpec extends AppSpec {
  "The top performers" should "be found" in {
    Given("I execute TopAgentsFinder task")
    val task = new TopAgentsFinder().execute(repo)

    When("I ask for top performers without providing a limit")
    val agents = task.outcome

    Then("Top ten agents should be returned, sorted by performance")
    agents should equal(
      Array(
        ("Mr Paul Draper",2),
        ("Jennifer Bland",1),
        ("Michael Rathbone",1),
        ("Mr Chris Barr",1),
        ("Mr G Kidd",1),
        ("Mr Patrick Dunne",1),
        ("Mr Peter Wood",1),
        ("P+HS Architects",1))
      )
  }
}
