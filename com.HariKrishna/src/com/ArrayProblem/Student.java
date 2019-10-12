package com.ArrayProblem;

public class Student extends Person {
	private int id;
	private String name;

	/*
	 * 
	 * ^shift x upper case
	 *  ^shift y lower case 
	 *  ^shift f formating
	 *   ^shift o import
	 * contron + spacebar default constructor command l go to line command o gives
	 * you all the methods and constructors
	 * 
	 * ^shift up arrow and down arrow helps to navigation
	 * 
	 */

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {

		System.out.println("HEEL IN THE CELL");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
