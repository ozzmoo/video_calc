import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
	double[] testValues1 = {1280, 1024, 24, 25, 52, 16, 44100};
	double[] testValues2 = {1920, 1080, 24, 25, 52, 16, 44100};
	double[] testValues3 = {1920, 1080, 24, 50, 52, 16, 44100};
	
	@Test
	public void testToCalculate1() {
		assertTrue(Calculate.toCalculate(testValues1) == 410.05611419677734);
	}
	@Test
	public void testToCalculate2() {
		assertTrue(Calculate.toCalculate(testValues2) == 648.7215869128704);
	}
	@Test
	public void testToCalculate3() {
		assertTrue(Calculate.toCalculate(testValues3) == 1297.4431738257408);
	}
}
