package com.gmail.yuramitryahin;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat("Tomas", "Featured Breed", "orsnge", 4, 5);
		System.out.println(catOne);

		Cat catTwo = catOne;
		catTwo.setName("Jack");
		catTwo.setColor("black");
		catTwo.setWeight(7);
		System.out.println(catTwo);

		Cat catThree = catTwo;
		System.out.println("Name - " + catThree.getName() + "\nAge -"
				+ catThree.getAge());

	}

}
