package Task1;

public class Main {

	public static void main(String[] args) {
		Point pointOne = new Point(0, 0);
		Point pointTwo = new Point(2, 2);
		Point pointThree = new Point(0, 4);
		Circle circleOne = new Circle(pointOne, pointTwo);
		System.out.println(circleOne.getArea());
		System.out.println(circleOne.getPerimetr());

		Triangle triangleOne = new Triangle(pointOne, pointTwo, pointThree);
		System.out.println(triangleOne.getPerimetr());
		System.out.println(triangleOne.getArea());

		Board boardOne = new Board();
		boardOne.setPartOne(circleOne);
		boardOne.setPartFour(triangleOne);
		boardOne.Info();
		boardOne.clearPartOne();
		boardOne.Info();

	}

}
