package com.gmail.yuramitryahin;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Jack", "Egles", "male", 17, 457, 4.2);

		Group group = new Group("TK-57", 2);

		group.addStudent(student);
		group.addStudent(new Student("Peter", "Parcker", "male", 20, 123, 4.0));
		group.addStudent(new Student("Anna", "Alantovich", "female", 21, 143,
				3.5));
		group.addStudent(new Student("Kate", "Baranova", "female", 19, 222, 4.9));

		group.addSudent();

		// group.deleteStudent(123);
		// group.findStudent("Baranova");
		// group.sortRating();
		System.out.println(group);
		System.out.println(group.toString(group.draftees()));
	}

}
