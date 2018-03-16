package com.work;

class A {
	void m1() {
		System.out.println("In m1 A");
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "ZZZZZZZZZZ";
	}
}

class B extends A {

	void m1() {
		System.out.println("In m1 B");
		System.out.println('a'+ "C");
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	void m2() {
		System.out.println("In m2 B");

	}
}

public class ClassA {

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.toString());
		a.m1();
	}

}