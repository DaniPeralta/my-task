package exercises.types.kakuro
import org.scalatest._

import exercises.types.kakuro


class KakuroSpec extends FlatSpec with Matchers {

  "Space" should "be able to find the list of combinations" in {

    val space1 = new Kakuro
    val space2 = new Kakuro
    val space3 = new Kakuro
    val space4 = new Kakuro

    space1.combinations(10, 3) shouldBe List(
      List(1, 2, 7),
      List(1, 3, 6),
      List(1, 4, 5),
      List(2, 3, 5))

    space2.combinations(24, 4) shouldBe List(
      List(1, 6, 8, 9),
      List(2, 5, 8, 9),
      List(2, 6, 7, 9),
      List(3, 4, 8, 9),
      List(3, 5, 7, 9),
      List(3, 6, 7, 8),
      List(4, 5, 6, 9),
      List(4, 5, 7, 8))

    space3.combinations(11, 4) shouldBe List(List(1, 2, 3, 5))

    space4.combinations(15, 3) shouldBe List(
      List(1, 5, 9),
      List(1, 6, 8),
      List(2, 4, 9),
      List(2, 5, 8),
      List(2, 6, 7),
      List(3, 4, 8),
      List(3, 5, 7),
      List(4, 5, 6))

  }

  "Approach2" should "be able to find the list of combinations" in {



    val approach1 = new Kakuro
    val approach2 = new Kakuro
    val approach3 = new Kakuro
    val approach4 = new Kakuro

    approach1.combinationsA(10, 3, Set(2)) shouldBe List(
      List(1, 2, 7),
      List(2, 3, 5))

    approach2.combinationsA(24, 4, Set(3, 8)) shouldBe List(
      List(3, 4, 8, 9),
      List(3, 6, 7, 8))

    approach3.combinationsA(11,4) shouldBe List(List(1, 2, 3, 5))

    approach4.combinationsA(15, 3, Set(7, 2)) shouldBe List(List(2, 6, 7))

  }
}