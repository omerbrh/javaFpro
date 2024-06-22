package myshapes;

public class Rectangle extends shape {

	private double width;
	private double height;

	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double CalcArea(double width, double height) {
		width = getWidth();
		height = getHeight();
		double area = height * width;

		return area;

	}

	public double CalcCircum(double width, double height) {
		width = getWidth();
		height = getHeight();

		double Circum = width * 2 + height * 2;
		return Circum;

	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]" + super.toString();
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
