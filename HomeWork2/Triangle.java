package Task1;

public class Triangle extends Shape {
	private Point pointOne = new Point();
	private Point pointTwo = new Point();
	private Point pointThree = new Point();

	public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
		super();
		this.pointOne = pointOne;
		this.pointTwo = pointTwo;
		this.pointThree = pointThree;
	}

	public Triangle() {
		super();
	}

	double getPerimetr() {
		double a = length(pointOne, pointTwo);
		double b = length(pointTwo, pointThree);
		double c = length(pointThree, pointOne);
		return a+b+c;
	}

	double getArea() {
		double a = length(pointOne, pointTwo);
		double b = length(pointTwo, pointThree);
		double c = length(pointThree, pointOne);
		double p = getPerimetr()/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	public double length(Point pOne, Point pTwo) {
		return Math.sqrt(Math.pow(pOne.getX() - pTwo.getX(), 2)
				+ Math.pow(pOne.getY() - pTwo.getY(), 2));
	}

}
