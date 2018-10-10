package Task1;

public class Circle extends Shape {
	private Point pointOne = new Point();
	private Point pointTwo = new Point();

	public Circle(Point pointOne, Point pointTwo) {
		super();
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
	}
	

	public Circle() {
		super();
	}


	public double getPerimetr() {
		return 2 * r() * Math.PI;
	}

	public double getArea() {
		return r() * r() * Math.PI;
	}

	public double r() {
		return Math.sqrt(Math.pow(pointOne.getX() - pointTwo.getX(), 2)
				+ Math.pow(pointOne.getY() - pointTwo.getY(), 2));
	}
}
