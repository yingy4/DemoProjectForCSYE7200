import org.scalatest.{FlatSpec, Matchers}

class testSpec extends FlatSpec with Matchers{

  "hello" should "match HELLO" in {
    test.hello shouldBe "HELLO"
  }

}
