import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MaxTest extends FunSuite {

  import Math.max

  test("max(List(1, 2, 3, 4, 5)) == 5") {
    assert(max(List(1, 2, 3, 4, 5)) == 5)
  }
  test("max(List(5, 4, 3, 2, 1)) == 5") {
    assert(max(List(5, 4, 3, 2, 1)) == 5)
  }
  test("max(List(1, 5, 2, 4, 3)) == 5") {
    assert(max(List(1, 5, 2, 4, 3)) == 5)
  }
  test("max(List(1, 5, 7, 4, 3)) == 7") {
    assert(max(List(1, 5, 7, 4, 3)) == 7)
  }
}
