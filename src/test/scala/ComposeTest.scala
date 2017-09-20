import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ComposeTest extends FunSuite {

  import Math.{doubleFunc, squareFunc}
  import Math.{curry, uncurry, compose}

  import language.higherKinds

  test("1") {
    println(doubleFunc(5))
    println(squareFunc(5))
  }

  test("compose") {
    println(compose(doubleFunc, squareFunc)(3))
    println(compose(doubleFunc, squareFunc)(4))
  }

  test("compose2") {
    println(compose[Int, Int, Int](a => a * 2, a => a * a)(3))
    println(compose[Int, Int, Int](a => a * 2, a => a * a)(4))

    def f(n: Int): Int = n * 2
    def g(n: Int): Int = n * n


//    val c = f Function.compose g
//    println(c(3))
//    println(c(4))
  }
}
