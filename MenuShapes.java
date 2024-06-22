package myshapes;

import java.util.Scanner;

public class MenuShapes {

	public static void main(String[] args) {
		Scanner option = new Scanner(System.in);
		PrintMenu();


		String options = option.nextLine();
		Righttriangle right = new Righttriangle("Not selected", 0, 0);
		Circle circle = new Circle("Not selected ", 0);
		Rectangle rectangle = new Rectangle("Not selected", 0, 0);
		Square squre = new Square("Not selected", 0);
		double radius = 0;
		double width = 0;
		double height = 0;
		String color = " ";

		while (!options.toLowerCase().contains("exit")) {
			options.toLowerCase();

			if (options.toLowerCase().contains("add new shape") || options.contains("1")) {
				System.out.println("please select shape from this options:");
				System.out.println("square");
				System.out.println("rectangle");
				System.out.println("circle");
				System.out.println("right triangle");
				System.out.println();
				options = option.nextLine();

				if (options.toLowerCase().contains("square")) {
					System.out.println("please select a color and width to this Square");
					Scanner color1 = new Scanner(System.in);
					Scanner width1 = new Scanner(System.in);
					color = color1.nextLine();
					width = width1.nextDouble();
					squre = new Square(color, width);

					System.out.println(" The color you chose is " + squre.getColor());
					System.out.println(" The width you chose is " + squre.getWidth());
					System.out.println();

				}

				if (options.toLowerCase().contains("rectangle")) {
					System.out.println("please select a color ,width and  height to this Rectangle");
					Scanner color1 = new Scanner(System.in);
					Scanner width1 = new Scanner(System.in);
					Scanner height1 = new Scanner(System.in);
					color = color1.nextLine();
					width = width1.nextDouble();
					height = height1.nextDouble();
					rectangle = new Rectangle(color, width, height);

					System.out.println(" The color you chose is " + rectangle.getColor());
					System.out.println(" The width you chose is " + rectangle.getWidth());
					System.out.println(" The height you chose is " + rectangle.getHeight());
					System.out.println();

				}

				if (options.toLowerCase().contains("circle")) {
					System.out.println("please select a color and radius to this Circle");
					Scanner color1 = new Scanner(System.in);
					Scanner radius1 = new Scanner(System.in);
					color = color1.nextLine();
					radius = radius1.nextDouble();

					circle = new Circle(color, radius);

					System.out.println(" The color you chose is " + circle.getColor());
					System.out.println(" The radius you chose is " + circle.getRadius());
					System.out.println();

				}

				if (options.toLowerCase().contains("right triangle")) {
					System.out.println("please select a color ,width and  height to this Right triangle");
					Scanner color1 = new Scanner(System.in);
					Scanner width1 = new Scanner(System.in);
					Scanner height1 = new Scanner(System.in);
					color = color1.nextLine();
					width = width1.nextDouble();
					height = height1.nextDouble();
					right = new Righttriangle(color, width, height);

					System.out.println(" The color you chose is " + right.getColor());
					System.out.println(" The width you chose is " + right.getWidth());
					System.out.println(" The height you chose is " + right.getHeight());
					System.out.println();

				}

			}
			if (options.toLowerCase().contains("list all shapes") || options.contains("2")) {

				System.out.println(right.toString());
				System.out.println(circle.toString());
				System.out.println(rectangle.toString());
				System.out.println(squre.toString());
				System.out.println();

			}

			if (options.toLowerCase().contains("sum all circumferences") || options.contains("3")) {
				double circshapes = circle.CalcCircum(radius) + right.CalcCircum(width, height)
						+ rectangle.CalcCircum(width, height) + squre.CalcCircum(width);
				System.out.println("The sum of all your shapes circumferences is " + circshapes);
				System.out.println();

			}

			if (options.toLowerCase().contains("sum all areas") || options.contains("4")) {

				double areashapes = +squre.CalcArea(width) + rectangle.CalcArea(width, height) + circle.CalcArea(radius)
						+ right.CalcArea(width, height);

				System.out.println("The sum of all your shapes circumferences is " + areashapes);
				System.out.println();
			}

			if (options.toLowerCase().contains("find biggest circumference") || options.contains("5")) {
				double Maxc = 0;
				String[] shapes = { circle.toString(), right.toString(), rectangle.toString(), squre.toString() };
				double[] bc = { circle.CalcCircum(radius), right.CalcCircum(width, height),
						rectangle.CalcCircum(width, height), squre.CalcCircum(width) };
				int j = 0;
				for (int i = 0; i < bc.length; i++) {

					Maxc = bc[0];
					if (bc[i] > Maxc) {
						Maxc = bc[i];
						j = i;

					}

				}
				System.out.println("The shape with the biggest circumference is " + shapes[j]
						+ " and the circumference is " + Maxc);
				System.out.println();

			}

			if (options.toLowerCase().contains("find biggest area") || options.contains("6")) {
				double Maxa = 0;
				String[] shapes = { circle.toString(), right.toString(), rectangle.toString(), squre.toString() };
				double[] ba = new double[4];
				ba[0] = circle.CalcArea(radius);
				ba[1] = right.CalcArea(width, height);
				ba[2] = rectangle.CalcArea(width, height);
				ba[3] = squre.CalcArea(width);
				int j = 0;
				for (int i = 0; i < ba.length; i++) {

					Maxa = ba[0];
					if (ba[i] > Maxa) {
						Maxa = ba[i];
						j = i;

					}

				}
				System.out.println("The shape with the biggest area is " + shapes[j] + " and the area is " + Maxa);
				System.out.println();

			}

			PrintMenu();

			options = option.nextLine();

		}
		System.out.println("The end");

	}
	
	public static void PrintMenu() {
		System.out.println("Please choose from the following options:");
		System.out.println("1.Add new shape");
		System.out.println("2.List all shapes");
		System.out.println("3.Sum all circumferences");
		System.out.println("4.Sum all areas");
		System.out.println("5.Find biggest circumference");
		System.out.println("6.Find biggest area");
		System.out.println("7.Exit");
		
		
	}

}
