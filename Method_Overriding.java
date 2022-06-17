package com.polymorphism;

public class Method_Overriding extends Method_Overloading {
	public void student_name(String name) {
		super.student_name(name);
	}

	public static void main(String[] args) {
		Method_Overloading mr = new Method_Overriding();
		mr.student_name("shyam");
		mr.student_name(20);

	}

}
