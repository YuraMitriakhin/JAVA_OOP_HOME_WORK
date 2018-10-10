package task3;

public class Main {

	public static void main(String[] args) {
		Vector3d vectorOne = new Vector3d(2, 3, 5);
		System.out.println(vectorOne);
		vectorOne.sum(1, 1, 1);

		Vector3d vectorTwo = new Vector3d(4, 0, 1);

		System.out.println("Scalar=" + vectorOne.scalar(4, 1, 5, 1));
		System.out.println("Vector=" + vectorTwo.vector(2, 5, 3, 0.2));

	}

}
