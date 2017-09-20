import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PowerTest extends FunSuite {

  import Math.power

  test("power(3, 4) == 81") {
    assert(power(3, 4) == 81)
  }

  test("power(2, 10) == 1024") {
    assert(power(2, 10) == 1024)
  }

  test("power(10, 2) == 100") {
    assert(power(10, 2) == 100)
  }

  test("power(7, 0) == 1") {
    assert(power(7, 0) == 1)
  }

  test("power(7, 1) == 7") {
    assert(power(7, 1) == 7)
  }

  test("power(7, 2) == 49") {
    assert(power(7, 2) == 49)
  }
}
