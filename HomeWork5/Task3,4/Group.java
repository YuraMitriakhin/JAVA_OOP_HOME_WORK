package com.gmail.yuramitryahin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements Military {
	private String name;
	private int course;
	private Student[] student = new Student[10];

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
			for (int i = 0; i < this.student.length; i++) {
				if (this.student[i] == null) {
					this.student[i] = student;
					break;
				}
				if (i == this.student.length - 1) {
					throw new ArrayOverrunException();
				}

			}
		} catch (ArrayOverrunException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteStudent(int NumberRecord) {
		try {
			for (int i = 0; i < student.length; i++) {
				if (student[i] != null) {
					if (student[i].getNumberRecord() == NumberRecord) {
						student[i] = null;
						break;
					}
				}
				if (i == student.length - 1) {
					throw new ElemenåNotFoundException();
				}
			}
		} catch (ElemenåNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void findStudent(String surname) {
		try {
			for (int i = 0; i < student.length; i++) {
				if (student[i] != null) {
					if (surname.equals(student[i].getSurname()) == true) {
						System.out.println(student[i]);
						break;
					}
					if (i == student.length - 1) {
						throw new ElemenåNotFoundException();
					}
				}
			}
		} catch (ElemenåNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void sortAlfabet() {
		for (int j = 0; j < student.length; j++) {
			for (int i = j + 1; i < student.length; i++) {
				if (student[i] != null && student[j] != null) {
					if (student[i].getSurname().compareTo(
							student[j].getSurname()) < 0) {
						Student k = student[j];
						student[j] = student[i];
						student[i] = k;
					}
				}
			}
		}
	}

	@Override
	public String toString() {

		String st = "Group [name=" + name + ", course=" + course + "]"
				+ System.lineSeparator();
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				st += student[i].toString() + ";" + System.lineSeparator();
			}
		}
		return st;
	}

	public void addSudent() {
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) {
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
				student[i] = studentOne;
				break;
			}
		}
	}

	public void sortRating() {
		int k = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				k++;
			}
		}
		Student[] arr = new Student[k];
		int j = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				arr[j] = student[i];
				j++;
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			student[i] = arr[i];
		}
	}

	public Student[] draftees() {
		Student[] draft = new Student[10];
		int n = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].getSex() == "male"
					&& student[i].getAge() >= 18) {
				draft[n] = student[i];
				n++;
			}
		}
		return draft;
	}

	public String toString(Student[] student) {

		String st = "Group draftees [name=" + name + ", course=" + course
				+ "]:" + System.lineSeparator();
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				st += student[i].toString() + ";" + System.lineSeparator();
			}
		}
		return st;
	}

	public void writeFile() {
		try (PrintWriter pr = new PrintWriter("group.csv")) {
			pr.println(name + ";" + course);
			// pr.println("Name;Surname;Age;Number of record;Average rating");
			for (int i = 0; i < student.length; i++) {
				if (student[i] != null) {
					pr.println(student[i].getName() + ";"
							+ student[i].getSurname() + ";"
							+ student[i].getAge() + ";"
							+ student[i].getNumberRecord() + "; "
							+ student[i].getGradeAverage() + " ;");
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void readFile() {
		String[] line = new String[10];
		try (BufferedReader buf = new BufferedReader(
				new FileReader("group.csv"))) {
			String text = "";
			int k = 0;
			for (; (text = buf.readLine()) != null;) {
				line[k] = text;
				k++;
			}
			for (int i = 0; i < line.length; i++) {
				if (line[i] != null) {
					String[] std = line[i].split(";");
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
						addStudent(st);
					}
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
