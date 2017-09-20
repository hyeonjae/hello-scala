import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FibonacciTest extends FunSuite {

  import Math.fibonacci

  test("fibonacci(1) is 1") {
    assert(fibonacci(1) == 1)
  }

  test("fibonacci(2) is 1") {
    assert(fibonacci(2) == 1)
  }

  test("fibonacci(3) is 2") {
    assert(fibonacci(3) == 2)
  }

  test("fibonacci(5) is 5") {
    assert(fibonacci(5) == fibonacci(3) + fibonacci(4))
  }

  test("fibonacci(10) is 55") {
    assert(fibonacci(10) == 55)
  }

  test("fibonacci(20) is 6765") {
    assert(fibonacci(20) == 6765)
  }

  test("fibonacci(0) is 0") {
    assert(fibonacci(0) == 0)
  }

  test("fibonacci(-1) is 0") {
    assert(fibonacci(-1) == 0)
  }
}
