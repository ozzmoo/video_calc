import static org.junit.Assert.*;

import org.junit.Test;

public class calcTestGabitov {
	double[] testValues1 = {1920, 1080, 24, 50, 52, 16, 44100};
	double[] testValues2 = {1280, 1024, 24, 25, 160, 16, 44100};
	
	@Test
	public void testToCalculate1() {
		assertTrue(Calculate.toCalculate(testValues1) == 1297.4431738257408);
	}
	
	@Test
	public void testToCalculate2() {
		assertTrue(Calculate.toCalculate(testValues2) == 1261.7111206054688);
	}
}
