package com.gmail.yuramitryahin;

public class People {
	private String name;
	private String surname;
	private int age;
	private enum sex {male,female};
	private sex s;

	public People(String name, String surname, String sex, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		setSex(sex);
	}

	public People() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
    public void setSex(String sexOf){
        s = sex.valueOf(sexOf);
    }
    
    public String getSex(){
    	String st = s.name();
    	return st;
    }

	@Override
	public String toString() {
		return surname +  " " + name + ", " + age+" years";
	}
	
	

}
