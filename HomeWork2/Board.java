package Task1;

public class Board {
	private double[] partArea = new double[4];
	private double[] partPerimetr = new double[4];
	private String[] partFigure = new String[4];

	public Board() {
		super();
	}

	public void clearPartOne() {
		this.partFigure[0] = null;
		this.partPerimetr[0] = 0;
		this.partArea[0] = 0;
	}

	public void setPartOne(Circle circleOne) {
		this.partFigure[0] = "Circle";
		this.partArea[0] = circleOne.getArea();
		this.partPerimetr[0] = circleOne.getPerimetr();

	}

	public void setPartOne(Triangle triangleOne) {
		this.partFigure[0] = "Triangle";
		this.partArea[0] = triangleOne.getArea();
		this.partPerimetr[0] = triangleOne.getPerimetr();
	}

	public void clearPartTwo() {
		this.partFigure[1] = null;
		this.partArea[1] = 0;
		this.partPerimetr[1] = 0;
	}

	public void setPartTwo(Circle circleTwo) {
		this.partFigure[1] = "Circle";
		this.partArea[1] = circleTwo.getArea();
		this.partPerimetr[1] = circleTwo.getPerimetr();
	}

	public void setPartTwo(Triangle triangleTwo) {
		this.partFigure[1] = "Triangle";
		this.partArea[1] = triangleTwo.getArea();
		this.partPerimetr[1] = triangleTwo.getPerimetr();
	}

	public void clearPartThree() {
		this.partFigure[2] = null;
		this.partArea[2] = 0;
		this.partPerimetr[2] = 0;
	}

	public void setPartThree(Circle circleThree) {
		this.partFigure[2] = "Circle";
		this.partArea[2] = circleThree.getArea();
		this.partPerimetr[2] = circleThree.getPerimetr();
	}

	public void setPartThree(Triangle triangleThree) {
		this.partFigure[2] = "Triangle";
		this.partArea[2] = triangleThree.getArea();
		this.partPerimetr[2] = triangleThree.getPerimetr();
	}

	public void clearPartFour() {
		this.partFigure[3] = null;
		this.partArea[3] = 0;
		this.partPerimetr[3] = 0;
	}

	public void setPartFour(Circle circleFour) {
		this.partFigure[3] = "Circle";
		this.partArea[3] = circleFour.getArea();
		this.partPerimetr[3] = circleFour.getPerimetr();
	}

	public void setPartFour(Triangle triangleFour) {
		this.partFigure[3] = "Triangle";
		this.partArea[3] = triangleFour.getArea();
		this.partPerimetr[3] = triangleFour.getPerimetr();
	}

	public void Info() {
		double totalArea=0;
		for (int i = 0; i < partArea.length; i++) {
			if (partArea[i] != 0) {
				System.out.println("In part " + (i+1) + ": " + partFigure[i]
						+ " (P=" + partPerimetr[i] + ", S=" + partArea[i]
						+ ");");
				totalArea+=partArea[i];
			}
		}
		System.out.println("Total area = " + totalArea);
	}

}
