package myshapes;

public abstract class shape {

	private String color;

	public shape(String color) {

		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double CalcArea();

	public abstract double CalcCircum();

	@Override
	public String toString() {
		return "shape [color=" + color + "]";
	}

}
