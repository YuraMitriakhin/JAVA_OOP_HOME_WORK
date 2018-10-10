package com.gmail.yuramitryahin2;

public class Main {

	public static void main(String[] args) {

		Triangle one = new Triangle(2, 3, 3);
		System.out.println(one.area());

		Triangle two = one;
		two.setB(2);
		System.out.println(two.area());

	}

}
