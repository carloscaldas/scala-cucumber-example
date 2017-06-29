
import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.runner.RunWith
import org.scalatest.{FunSuite, MustMatchers}

import scala.collection.mutable.{Map => MutableMap}

/**
  * Created by ccaldas on 6/27/2017.
  */

@RunWith(classOf[Cucumber])
@CucumberOptions(plugin = Array("pretty", "html:target/cucumber"))
class MultiplicationSteps extends ScalaDsl with EN with MustMatchers {

  val vars = MutableMap[String, Int]()
  var result = 0

  Given("""^a variable ([a-z]+) with value (\d+)$""") { (varName: String, value: Int) =>
    vars += varName -> value
  }

  When("""^I multiply ([a-z]+) \* ([a-z]+)$""") { (var1: String, var2: String) =>
    result = vars(var1) * vars(var2)
  }

  Then("""^I get (\d+)$""") { (expectedResult: Int) =>
    assert(result === expectedResult)
  }

}