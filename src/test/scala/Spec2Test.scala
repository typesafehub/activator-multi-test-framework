import org.specs2.mutable._

class Spec2Test extends Specification {
  "The 'Hello world' string" should {
    "contain 11 characters" in {
     "Hello world" must have size(11)
    }
    "start with 'Hello'" in {
     "Hello world" must startWith("world")
    }
  }	
}