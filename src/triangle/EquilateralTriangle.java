package triangle;

public class EquilateralTriangle extends Triangle {

	public EquilateralTriangle(double sideLength) {

		super(sideLength, sideLength, sideLength);

	}

	@Override
	public double getArea() {

		return (Math.sqrt(3) / 4) * (sideA * sideA);
	}
}