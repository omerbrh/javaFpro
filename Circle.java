package myshapes;

public class Circle extends shape {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double CalcArea(double radius) {
		radius = getRadius();
		double area = radius * radius * Math.PI;

		return area;

	}

	public double CalcCircum(double radius) {
		radius = getRadius();

		double Circum = radius * 2 * Math.PI;
		return Circum;

	}

	@Override
	public String toString() {

		return "Circle [radius=" + radius + "]" + super.toString();
	}

	@Override
	public double CalcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double CalcCircum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
