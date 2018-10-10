package task3;

public class Vector3d {
	private double x;
	private double y;
	private double z;

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3d() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public void sum(double xTwo, double yTwo, double zTwo) {
		double xSum = x + xTwo;
		double ySum = y + yTwo;
		double zSum = z + zTwo;
		System.out.println("Sum of vectors [x=" + xSum + ", y=" + ySum + ", z="
				+ zSum + "]");
	}

	public double scalar(double xTwo, double yTwo, double zTwo, double cos) {
		return modul() * modul(xTwo, yTwo, zTwo) * Math.cos(cos);
	}

	public double vector(double xTwo, double yTwo, double zTwo, double sin) {
		return modul() * modul(xTwo, yTwo, zTwo) * Math.sin(sin);
	}

	public double modul() {
		return Math.sqrt(x * x + y * y + z * z);
	}

	public double modul(double xTwo, double yTwo, double zTwo) {
		return Math.sqrt(xTwo * xTwo + yTwo * yTwo + zTwo * zTwo);
	}

	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
