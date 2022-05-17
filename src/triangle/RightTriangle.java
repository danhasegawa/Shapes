package triangle;

public class RightTriangle extends Triangle {

	public RightTriangle(double sideA, double sideB) {

		super(sideA, sideB, Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
	}

	@Override
	public double getArea() {

		return sideA * sideB / 2;
	}

	public double getHypotenuse(double sideA, double sideB) {

		return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
	}
}