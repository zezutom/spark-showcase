package org.zezutom.planner.exercises

import org.junit.runner.RunWith
import org.scalatest.Matchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class WordCounterSpec extends AppSpec with Matchers {
  "Words of the provided JSON data set" should "be counted" in {
    When("I count records")
    val count = new WordCounter().execute(repo)
    
    Then("The count should be as expected")
    count should equal(
        Array(
          ("6",1),
          ("60.7m",1),
          ("7",1),
          ("a",1),
          ("a1",2),
          ("access",1),
          ("ancillary",1),
          ("and",3),
          ("application",1),
          ("both",1),
          ("c/08/00005/ccm",1),
          ("car",1),
          ("conditions",1),
          ("convert",1),
          ("discharge",1),
          ("east",1),
          ("erection",1),
          ("existing",1),
          ("fronts",1),
          ("installation",1),
          ("of",4),
          ("one",1),
          ("park",1),
          ("planning",1),
          ("public",1),
          ("relating",1),
          ("relocation",1),
          ("security",1),
          ("shop",1),
          ("shutters",1),
          ("single",1),
          ("the",2),
          ("to",4),
          ("turbine",1),
          ("two",1),
          ("unit",2),
          ("use",2),
          ("west",1),
          ("wind",1),
          ("with",2),
          ("workshop",1)
        )
    )
  }
}
