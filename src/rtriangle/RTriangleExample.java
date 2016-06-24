package rtriangle;

public class RTriangleExample implements Rtriangle {

	int apexX1;		
	int apexX2;		
	int apexX3;		
	int apexY1;		
	int apexY2;		
	int apexY3;		
	
	public RTriangleExample(int x1, int x2, int x3, int y1, int y2, int y3) {
		this.apexX1 = x1;
		this.apexX2 = x2;
		this.apexX3 = x3;
		this.apexY1 = y1;
		this.apexY2 = y2;
		this.apexY3 = y3;
	}
	
	public int getApexX1() {
		return this.apexX1;
	}

	public int getApexX2() {
		return this.apexX2;
	}

	public int getApexX3() {
		return this.apexX3;
	}
	
	public int getApexY1() {
		return this.apexY1;
	}

	public int getApexY2() {
		return this.apexY2;
	}

	public int getApexY3() {
		return this.apexY3;
	}

}
