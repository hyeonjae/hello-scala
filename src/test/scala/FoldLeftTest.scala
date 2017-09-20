import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FoldLeftTest extends FunSuite {

  import Math.power, Math.foldLeft

  test("foldLeft(List(3, 2, 2), power) == 81") {
    assert(foldLeft(List(3, 2, 2), power) == 81)
  }
  test("foldLeft(List(1, 2, 3), power) == 1") {
    assert(foldLeft(List(1, 2, 3), power) == 1)
  }
  test("foldLeft(List(3, 2, 1), power) == 9") {
    assert(foldLeft(List(3, 2, 1), power) == 9)
  }

}
