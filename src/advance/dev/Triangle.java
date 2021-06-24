package advance.dev;

public class Triangle extends Shape {
	double canhA, canhB, canhC;
	
	
	
	public Triangle(String name, double canhA, double canhB, double canhC) {
		super(name);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}

	@Override
	double chuVi() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double dienTich() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Triangle "+name+" [canhA=" + canhA + ", canhB=" + canhB + ", canhC=" + canhC + "]";
	}
	
}
