import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SumTest extends FunSuite {

  import Math.sum

  test("sum(List(1)) is 1") {
    assert(sum(List(1)) == 1)
  }

  test("sum(List(5)) is 5") {
    assert(sum(List(5)) == 5)
  }

  test("sum(List(1, 2)) is 3") {
    assert(sum(List(1, 2)) == 1 + 2)
  }

  test("sum(List(3, 6, 9)) is 18") {
    assert(sum(List(3, 6, 9)) == 3 + 6 + 9)
  }

  test("sum(List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)) is 55") {
    assert(sum(List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)) == 55)
  }

  test("sum(List()) is 0") {
    assert(sum(List()) == 0)
  }

}
