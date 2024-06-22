package myshapes;

public class Righttriangle extends shape {
	private double width;
	private double height;

	public Righttriangle(String color, double width, double height) {
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
		double area = (height * width) / 2;

		return area;
	}

	public double CalcCircum(double width, double height) {
		width = getWidth();
		height = getHeight();

		double Circum = width + height + Math.sqrt(width * width + height * height);
		return Circum;

	}

	@Override
	public String toString() {

		return "Righttriangle [width=" + width + ", height=" + height + "]" + super.toString();
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
