import org.scalatest._
import com.example.DiamondShape;
import com.example.ButterflyShape;

class SuperExamASpec extends FlatSpec with Matchers {
  "Diamond" should "Create diamond shape follow by \"n\". (n is odd value only)" in {
    val d = new DiamondShape()
    d.printDiamond(3) 
    d.printDiamond(5)
  }
  
  "Butterfly" should "Create butterfly shape follow by \"n\". (n is even value only)" in {
    val b = new ButterflyShape()
    b.printButterfly(2) 
    b.printButterfly(4)
  }
  
}
