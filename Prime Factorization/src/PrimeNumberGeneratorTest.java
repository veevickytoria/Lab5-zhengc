import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeNumberGeneratorTest {
	@Test
	public void testNegative(){
		assertEquals(new ArrayList<Integer>(),PrimeNumberGenerator.generatePrimes(-4));
	}
}
