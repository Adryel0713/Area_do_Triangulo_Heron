package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Area;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		Area area = new Area();

		double[] x = new double[3];

		System.out.print("Enter the measures of triangle X: ");
		for (int i = 0; i < x.length; i++) {

			x[i] = s.nextDouble();

		}
		
		double x_total = area.calcArea(x[0], x[1], x[2]);

		System.out.print("Enter the measures of triangle Y: ");

		double[] y = new double[3];

		for (int i = 0; i < x.length; i++) {

			y[i] = s.nextDouble();

		}

		double y_total = area.calcArea(y[0], y[1], y[2]);

		System.out.println();
		System.out.printf("Triangle X area: %.2f\n", x_total);
		System.out.printf("Triangle Y area: %.2f\n", y_total);
		System.out.println();
		if (x_total > y_total)
			System.out.printf("Larger area: %.2f\n", x_total);
		else if (x_total == y_total)
			System.out.println("both are equal!");
		else
			System.out.printf("Larger area: %.2f\n", y_total);
		s.close();
	}

}
