package triangle;

public abstract class Triangle {

	protected double sideA, sideB, sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		if (!Triangle.hasValidSize(sideA, sideB, sideC)) {
			throw new IllegalArgumentException("Triangle sides not valid.");
		}

		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	private static boolean hasValidSize(double sideA, double sideB, double sideC) {

		if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
			return true;
		} else {
			return false;
		}

	}

	public double getPerimeter() {

		double n = sideA + sideB + sideC;
		return n;
	}

	public abstract double getArea();

}