package entities;

public class Area {

	public double calcArea(double x, double b, double c) {

		double p = (x + b + c) / 2;

		double area = Math.sqrt(p * (p - x) * (p - b) * (p - c));

		return area;
	}

}
