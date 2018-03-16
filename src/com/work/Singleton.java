package com.work;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private int i = 0;

	private Singleton() {
	}

	public static Singleton returnSingleton() {

		return singleton;
	}

	private void increment() {
		i++;
		System.out.println("Value iz :" + i);
	}

	private int getInt() {
		return i;
	}

	public static void main(String[] args) {
		System.out.println("Test");

		Singleton sin1 = Singleton.returnSingleton();
		sin1.increment();
		System.out.println(sin1.getInt());
		Singleton sin2 = Singleton.returnSingleton();
		System.out.println("Test");
		sin1.increment();
		System.out.println(sin1.getInt());
	}
}