package triangle;

public class TestTriangle {

	public static void main(String[] args) {

		EquilateralTriangle et = new EquilateralTriangle(2);
		System.out.println("Equilateral Triangle's side are: " + et.sideA + ", " + et.sideB + ", " + et.sideC);
		System.out.println("Equilateral Triangle's area is " + et.getArea());
		System.out.println("Equilateral Triangle's perimeter is " + et.getPerimeter());
		System.out.println("\n");

		RightTriangle rt = new RightTriangle(5, 9);
		System.out.println("Right Triangle's side are: " + rt.sideA + ", " + rt.sideB + ", " + rt.sideC);
		System.out.println("Right Triangle's area is " + rt.getArea());
		System.out.println("Right Triangle'sperimeter is " + rt.getPerimeter());
		System.out.println("Right Triangle's hypotenuse is: " + rt.getHypotenuse(5, 9));

	}
}
