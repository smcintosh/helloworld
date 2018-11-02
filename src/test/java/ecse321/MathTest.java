package ecse321;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.Random;


/** 
 * Unit test for math root
 */
public class MathTest
{
	@Test
	public void shouldCalculateRoot ()
	{
		Random rand = new Random();
		double  n = rand.nextDouble() + 1;
		Double m = n*n;
		m=Math.sqrt(m);
		m=Math.abs(m-n);

		assertTrue(m<=0.00000000001);
	}


}

