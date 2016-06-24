package unitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import rtriangle.Rtriangle;
import rtriangle.RtriangleProvider;

public class RtriangleProviderTest {

	@Test
	public void test() {
		Rtriangle rtriangle = RtriangleProvider.getRtriangle();
		int x1 = rtriangle.getApexX1();
		int x2 = rtriangle.getApexX2();
		int x3 = rtriangle.getApexX3();
		int y1 = rtriangle.getApexY1();
		int y2 = rtriangle.getApexY2();
		int y3 = rtriangle.getApexY3();
		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		if (side1 > side2 && side1 > side3) {
			double tempCalculation = Math.sqrt(Math.pow(side2, 2) + Math.pow(side3, 2));
			assertTrue(side1 == tempCalculation);
		}
		else if (side2 > side1 && side2 > side3) {
			double tempCalculation = Math.sqrt(Math.pow(side1, 2) + Math.pow(side3, 2));
			assertTrue(side2 == tempCalculation);			
		}
		else if (side3 > side1 && side3 > side2) {
			double tempCalculation = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
			assertTrue(side3 == tempCalculation);			
		}
		else {
			fail("This triangle is not right.");			
		}
	}

}
