import org.scalatest._

class HelloSpec extends FreeSpec with Matchers {
  "test" - {
    "this" in {
      true == true
    }
  }
}
