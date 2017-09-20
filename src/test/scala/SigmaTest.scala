import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SigmaTest extends FunSuite {

  import Math.sigma

  test("sigma(1) is 1") {
    assert(sigma(1) == 1)
  }

  test("sigma(2) is 3") {
    assert(sigma(2) == 1 + 2)
  }

  test("sigma(3) is 6") {
    assert(sigma(3) == 1 + 2 + 3)
  }

  test("sigma(5) is 15") {
    assert(sigma(5) == sigma(4) + 5)
  }

  test("sigma(10) is 55") {
    assert(sigma(10) == sigma(9) + 10)
  }

  test("sigma(100) is 5050") {
    assert(sigma(100) == 5050)
  }

  test("sigma(0) is 0") {
    assert(sigma(0) == 0)
  }

  test("sigma(-1) is 0") {
    assert(sigma(-1) == 0)
  }
}
