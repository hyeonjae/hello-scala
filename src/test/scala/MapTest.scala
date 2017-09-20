import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MapTest extends FunSuite {

  import Math.map

  test("map(List(1, 2, 3), (n: Int) => n * 2) == List(2, 4, 6)") {
    assert(map(List(1, 2, 3), (n: Int) => n * 2) == List(2, 4, 6))
  }

  test("map(List(1, 2, 3), (n: Int) => n * 2) != List(6, 4, 2)") {
    assert(map(List(1, 2, 3), (n: Int) => n * 2) != List(6, 4, 2))
  }
}
