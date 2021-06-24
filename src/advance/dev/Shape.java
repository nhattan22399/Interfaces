package advance.dev;

public abstract class Shape {
	protected String name;

	public Shape(String name) {
		this.name = name;
	}
	abstract double chuVi();
	abstract double dienTich();
}
