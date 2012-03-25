import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeNumberGeneratorTest {
	@Test
	public void testNegative(){
		assertEquals(new ArrayList<Integer>(),PrimeNumberGenerator.generatePrimes(-4));
	}
	
	@Test
	public void testZero(){
		assertEquals(new ArrayList<Integer>(),PrimeNumberGenerator.generatePrimes(0));
	}
	
	@Test
	public void testOne(){
		assertEquals(new ArrayList<Integer>(),PrimeNumberGenerator.generatePrimes(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(new ArrayList<Integer>(),PrimeNumberGenerator.generatePrimes(2));
	}
	
	@Test
	public void testThree(){
		assertEquals(list(2),PrimeNumberGenerator.generatePrimes(3));
	}
	
	@Test
	public void testFour(){
		assertEquals(list(2, 3),PrimeNumberGenerator.generatePrimes(4));
	}
	
	@Test
	public void testFive(){
		assertEquals(list(2, 3),PrimeNumberGenerator.generatePrimes(5));
	}
	
	@Test
	public void testSix(){
		assertEquals(list(2, 3, 5),PrimeNumberGenerator.generatePrimes(6));
	}
	
	@Test
	public void testSeven(){
		assertEquals(list(2, 3, 5),PrimeNumberGenerator.generatePrimes(7));
	}
	
	@Test
	public void testEight(){
		assertEquals(list(2, 3, 5, 7),PrimeNumberGenerator.generatePrimes(8));
	}
	
	
	private ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
