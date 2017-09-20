object Math {
  //  def sigma(n: Int): Int = n match {
  //    case zero if zero < 1 => 0
  //    case 1 => 1
  //    case _ => sigma(n - 1) + n
  //  }

  def sigma(n: Int): Int = {
    @annotation.tailrec
    def rec(n: Int, acc: Int): Int = {
      if (n < 1) acc
      else rec(n - 1, n + acc)
    }

    rec(n, 0)
  }

  //  def sum(xs: List[Int]): Int = xs match {
  //    case head :: tail => head + sum(tail)
  //    case _ => 0
  //  }

  def sum(xs: List[Int]): Int = {
    @annotation.tailrec
    def rec(xs: List[Int], acc: Int): Int = xs match {
      case head :: tail => rec(tail, acc + head)
      case _ => acc
    }

    rec(xs, 0)
  }

  def fibonacci(n: Int): Long = n match {
    case x if x < 1 => 0
    case 1 => 1
    case 2 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def power(base: Int, exp: Int): Int = exp match {
    case 0 => 1
    case 1 => base
    case _ => base * power(base, exp - 1)
  }

  def foldLeft(xs: List[Int], map: (Int, Int) => Int): Int = xs match {
    case head :: Nil => head
    case head :: tail => map(head, foldLeft(tail, map))
  }

  def max(xs: List[Int]): Int = xs match {
    case head :: Nil => head
    case head :: tail => {
      val right = max(tail)
      if (head > right) head else right
    }
  }

  def pascal(row: Int, col: Int): Int = row match {
    case 1 => 1
    case _ => col match {
      case 1 => 1
      case _ if (row + 1) < 2 * col => pascal(row, row - col + 1)
      case _ => pascal(row - 1, col - 1) + pascal(row - 1, col)
    }
  }

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = {
    (b: B) => f(a, b)
  }

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }

  def uncurry[A, B, C](f: A => (B => C)): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }

  def map[A, B](xs: List[A], f: (A => B)): List[B] = {
    var acc = List[B]()
    for (x <- xs) {
      acc = f(x) :: acc
    }

    acc.reverse
  }

  def filter[A, B](xs: List[A], f: (A => Boolean)): List[A] = {
    var acc = List[A]()
    for (x <- xs) {
      if (f(x)) {
        acc = x :: acc
      }
    }

    acc.reverse
  }

  val doubleFunc = new ((Int) => Int) {
    def apply(n: Int): Int = n * 2
  }

  val squareFunc = new ((Int) => Int) {
    def apply(n: Int): Int = n * n
  }
}
