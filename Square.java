package myshapes;

public class Square extends shape {
	private double width;

	public Square(String color, double width) {
		super(color);
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double CalcArea(double width) {
		width = getWidth();
		double area = width * width;

		return area;

	}

	public double CalcCircum(double width) {
		width = getWidth();

		double Circum = width * 4;
		return Circum;

	}

	@Override
	public String toString() {
		return "Square [width=" + width + "]" + super.toString();
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
