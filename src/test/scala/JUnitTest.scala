import org.junit.Assert._
import org.junit.Test

class JUnitTest {
  @Test
  def testUpIsDown(): Unit = {
    assertEquals("up", "down")
  }

  @Test
  def testSkyIsBlue(): Unit = {
    def colorOfSky = "blue"
    assertEquals("blue", colorOfSky)
  }
}
