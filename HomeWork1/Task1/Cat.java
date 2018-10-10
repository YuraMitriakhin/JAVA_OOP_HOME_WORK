package com.gmail.yuramitryahin;

public class Cat {
	private String name;
	private String type;
	private String color;
	private int age;
	private double weight;

	public Cat(String name, String type, String color, int age, double weight) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + ", color=" + color
				+ ", age=" + age + ", weight=" + weight + "kg" + "]";
	}

	
	

}
