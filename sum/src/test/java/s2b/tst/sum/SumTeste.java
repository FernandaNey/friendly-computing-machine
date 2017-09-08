package s2b.tst.sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTeste {
	
	
	@Test(expected=IllegalArgumentException.class)// Especifica uma Expected que o Testador está esperando;
	public void testFirstNumberIsNegativeGiveException() {
		Sum.sum(-10,0);
	}
	
	
	@Test(expected=IllegalArgumentException.class)// Especifica uma Expected que o Testador está esperando;
		public void testSecondNumberIsNegativeGiveException() {
			Sum.sum(0,-10);
	}
	
	@Test
	public void testThatOnePlusZeroIsOne() {
		double expected = 1;
		double actual = Sum.sum(1,0);
		
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void testThatHalfPlusHalfIsOne() {
		double expected = 1;
		double actual = Sum.sum(0.5,0.5);
		
		assertEquals(expected, actual, 0.1);
	}
}
