package com.gmail.yuramitryahin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("Jack", "Egles", "male", 17, 457, 4.2);

		Group group = new Group("TK-57", 2);
		Group groupTwo = new Group();

		// group.addStudent(student);
		group.addStudent(new Student("Peter", "Parcker", "male", 20, 123, 4.0));
		group.addStudent(new Student("Anna", "Alantovich", "female", 21, 143,
				3.5));
		group.addStudent(new Student("Kate", "Baranova", "female", 19, 222, 4.9));

		// group.addSudent();

		// group.deleteStudent(123);
		// group.findStudent("Baranova");
		// group.sortRating();
		// group.writeFile();
		serializableWrite(group, "groupOne");
		groupTwo = serializableRead("groupOne");

		System.out.println(groupTwo);

	}

	public static void serializableWrite(Group group, String name) {
		try (ObjectOutputStream OOS = new ObjectOutputStream(
				new FileOutputStream(name))) {
			OOS.writeObject(group);
		} catch (IOException e) {
			System.out.println("ERROR");
		}
	}

	public static Group serializableRead(String name) {
		Group group = null;
		try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(
				name))) {
			group = (Group) OIS.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return group;
	}

}
