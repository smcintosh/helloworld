import java.lang.Math; 
import org.junit.*; 
import java.util.*; 
import static org.junit.Assert.*;
public class MathTest {
public double a = - 4.5; 
public double b = Double.NaN; 
public double c = Double.POSITIVE_INFINITY; 
public Double d = 57.0; 
public Double e = 25.3; 
public Double f = 157.0; 
private static final double DELTA = 0.0499999999999999;
// @Before
// publiv void setup(String args[]){
// a = Double.parseDouble(args[0]); 
// }
@Test
public void TestforNaNValue(){
MathClass tester0 = new MathClass();
assertEquals( Double.NaN, tester0.squareRoot(b), DELTA);
} 
@Test 
public void TestforNegativeValue()
{
MathClass tester1 = new MathClass();
assertEquals( Double.NaN, tester1.squareRoot(a), DELTA);
}
@Test
public void TestforInfinity()
{
MathClass tester2 = new MathClass();
assertEquals( Double.POSITIVE_INFINITY, tester2.squareRoot(c), DELTA);
} 
@Test 
public void TestforValidNumbers1()
{
MathClass tester3 = new MathClass();
assertEquals(7.5, tester3.squareRoot(d), DELTA);
}
@Test 
public void TestforValidNumbers2()
{
MathClass tester4 = new MathClass();
assertEquals(5.0, tester4.squareRoot(e), DELTA);
}
@Test 
public void TestforValidNumbers3()
{
MathClass tester5 = new MathClass();
assertEquals(12.5, tester5.squareRoot(f), DELTA);
}

   // class to be tested
    class MathClass {
        public double squareRoot(double i) {
            return Math.sqrt(i); 
        }
    }

}

