package com.gmail.yuramitryahin;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Group implements Military, Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int course;
	//private Student[] student = new Student[10];
	private List<Student> student = new ArrayList<>();

	public Group(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

	public Group() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public void addStudent(Student student) {
		try {
				if (this.student.size()>10) {
					throw new ArrayOverrunException();
				}else{
					this.student.add(student);
				}
				
		} catch (ArrayOverrunException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteStudent(int NumberRecord) {
		try {
			for (int i = 0; i < student.size(); i++) {
				if (student.get(i).getNumberRecord() == NumberRecord) {
					student.remove(i);
				}
				if (i == student.size() - 1) {
					throw new ElemenåNotFoundException();
				}
			}
		} catch (ElemenåNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public Student findStudent(String surname) {
		try {
			for (int i = 0; i < student.size(); i++) {
					if (surname.equals(student.get(i).getSurname())) {
						return student.get(i);
					}
					if (i == student.size() - 1) {
						throw new ElemenåNotFoundException();
					}
			}
		} catch (ElemenåNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void sortAlfabet() {
		for (int j = 0; j < student.size(); j++) {
			for (int i = j + 1; i < student.size(); i++) {
					if (student.get(i).getSurname().compareTo(
							student.get(j).getSurname()) < 0) {
						Student k = student.get(j);
						student.add(j, student.get(i));
						student.add(i, k);
					}
			}
		}
	}

	@Override
	public String toString() {

		String st = "Group [name=" + name + ", course=" + course + "]"
				+ System.lineSeparator();
		for (int i = 0; i < student.size(); i++) {
				st += student.get(i).toString() + ";" + System.lineSeparator();
		}
		return st;
	}

	public void addSudent() {
				Student studentOne = new Student();
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter name: ");
				studentOne.setName(sc.nextLine());
				System.out.print("Enter surname: ");
				studentOne.setSurname(sc.nextLine());
				System.out.print("Enter sex(male or female): ");
				studentOne.setSex(sc.nextLine());
				System.out.print("Enter age: ");
				studentOne.setAge(sc.nextInt());
				System.out.print("Enter record number: ");
				studentOne.setNumberRecord(sc.nextInt());
				System.out.print("Enter grade rating: ");
				studentOne.setGradeAverage(sc.nextDouble());
				student.add(studentOne);
	}

	public List<Student> draftees() {
		List<Student> draft = new ArrayList<>();
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getSex() == "male"
					&& student.get(i).getAge() >= 18) {
				draft.add( student.get(i));
			}
		}
		return draft;
	}

	public String toString(Student[] student) {

		String st = "Group draftees [name=" + name + ", course=" + course
				+ "]:" + System.lineSeparator();
		for (int i = 0; i < student.length; i++) {
				st += student[i].toString() + ";" + System.lineSeparator();
		}
		return st;
	}

	public void writeFile() {
		try (PrintWriter pr = new PrintWriter("group.csv")) {
			pr.println(name + ";" + course);
			for (int i = 0; i < student.size(); i++) {
					pr.println(student.get(i).getName() + ";"
							+ student.get(i).getSurname() + ";"
							+ student.get(i).getAge() + ";"
							+ student.get(i).getNumberRecord() + "; "
							+ student.get(i).getGradeAverage() + " ;");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void readFile() {
		List<String> line = new ArrayList<String>();
		try (BufferedReader buf = new BufferedReader(
			new FileReader("group.csv"))) {
			String text = "";
			for (; (text = buf.readLine()) != null;) {
				line.add(text);
			}
			for (int i = 0; i < line.size(); i++) {
					String[] std = line.get(i).split(";");
					if (i == 0) {
						name = std[0];
						course = Integer.parseInt(std[1]);
					} else {
						Student st = new Student();
						st.setName(std[0]);
						st.setSurname(std[1]);
						st.setAge(Integer.parseInt(std[2]));
						st.setNumberRecord(Integer.parseInt(std[3]));
						st.setGradeAverage(Double.parseDouble(std[4]));
						student.add(st);
					}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
