import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FilterTest extends FunSuite {

  import Math.filter

  test("filter(List(1, 2, 3, 4), (n: Int) => n % 2 == 0) == List(2, 4)") {
    assert(filter(List(1, 2, 3, 4), (n: Int) => n % 2 == 0) == List(2, 4))
  }

  test("filter(List(1, 2, 3, 4), (n: Int) => n < 3) == List(1, 2)") {
    assert(filter(List(1, 2, 3, 4), (n: Int) => n < 3) == List(1, 2))
  }
}
