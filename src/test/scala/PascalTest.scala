import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PascalTest extends FunSuite {

  import Math.pascal

  test("pascal 1") {
    assert(pascal(1, 1) == 1)
  }

  test("pascal 2") {
    assert(pascal(2, 1) == 1)
    assert(pascal(2, 2) == 1)
  }

  test("pascal 3") {
    assert(pascal(3, 1) == 1)
    assert(pascal(3, 2) == 2)
    assert(pascal(3, 3) == 1)
  }

  test("pascal 4") {
    assert(pascal(4, 1) == 1)
    assert(pascal(4, 2) == 3)
    assert(pascal(4, 3) == 3)
    assert(pascal(4, 4) == 1)
  }

  test("pascal 5") {
    assert(pascal(5, 1) == 1)
    assert(pascal(5, 2) == 4)
    assert(pascal(5, 3) == 6)
    assert(pascal(5, 4) == 4)
    assert(pascal(5, 5) == 1)
  }

  test("pascal 6") {
    assert(pascal(6, 1) == 1)
    assert(pascal(6, 2) == pascal(5, 1) + pascal(5, 2))
    assert(pascal(6, 3) == pascal(5, 2) + pascal(5, 3))
    assert(pascal(6, 4) == pascal(6, 3))
    assert(pascal(6, 5) == pascal(6, 2))
    assert(pascal(6, 6) == 1)
  }
}
