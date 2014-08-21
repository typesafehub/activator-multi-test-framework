import org.scalacheck.Properties
import org.scalacheck.Prop.forAll	

class ScalaCheckTest extends Properties("String") {
  property("startsWith") = forAll { (a: String, b: String) =>
    (a+b).startsWith(a)
  }

  property("concatenate") = forAll { (a: String, b: String) =>
    (a+b).length > (a+b).length + 1
  }
}