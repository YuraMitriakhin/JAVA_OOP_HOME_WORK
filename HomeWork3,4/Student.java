package com.gmail.yuramitryahin;

public class Student extends People implements Comparable {
	private int numberRecord;
	private double gradeRating;

	

	public Student(String name, String surname, String sex, int age,
			int numberRecord, double gradeRating) {
		super(name, surname, sex, age);
		this.numberRecord = numberRecord;
		this.gradeRating = gradeRating;
	}

	
	
	public Student(String name, String surname, String sex, int age) {
		super(name, surname, sex, age);
	}



	public Student() {
		super();
	}

	public int getNumberRecord() {
		return numberRecord;
	}

	public void setNumberRecord(int numberRecord) {
		this.numberRecord = numberRecord;
	}

	public double getGradeAverage() {
		return gradeRating;
	}

	public void setGradeAverage(double gradeRating) {
		this.gradeRating = gradeRating;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", record number: "
				+ numberRecord + ", average rating: " + gradeRating;
	}
	
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		if (this.gradeRating > other.gradeRating) {
			return 1;
		}
		if (this.gradeRating < other.gradeRating) {
			return -1;
		}
		return 0;
	}

}
