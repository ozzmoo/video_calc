import static org.junit.Assert.*;

import org.junit.Test;

public class calcTestSubbotin {
	double[] testValues1 = {800, 600, 24, 25, 3600, 16, 44100};
	double[] testValues2 = {800, 600, 24, 50, 3600, 16, 44100};
	
	@Test
	public void testToCalculate1() {
		assertTrue(Calculate.toCalculate(testValues1) == 10396.179277449846);
	}
	
	@Test
	public void testToCalculate2() {
		assertTrue(Calculate.toCalculate(testValues2) == 20792.358554899693);
		
	}
}
