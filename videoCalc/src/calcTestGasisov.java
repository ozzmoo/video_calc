import static org.junit.Assert.*;

import org.junit.Test;

public class calcTestGasisov {
	double[] testValues1 = {1920, 1080, 24, 25, 160, 16, 44100};
	double[] testValues2 = {1920, 1080, 24, 50, 160, 16, 44100};
	
	@Test
	public void testToCalculate1() {
		assertTrue(Calculate.toCalculate(testValues1) == 1996.0664212703705);
	}
	
	@Test
	public void testToCalculate2() {
		assertTrue(Calculate.toCalculate(testValues2) == 3992.132842540741);
	}
}
