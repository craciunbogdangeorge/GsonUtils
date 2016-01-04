package com.apecs.util;

public class Main {

	public static void main(String[] args) {

		Person p = new Person("Ion", "Barack");
		IndexMeter i = new IndexMeter(1, "id", "water - 5");

		System.out.println("String representation test");
		System.out.println(GsonUtils.toJsonString(p));
		System.out.println(GsonUtils.toJsonString(i));
		System.out.print("\n");

		System.out.println("JSON element from string test");
		System.out
				.println(GsonUtils.jsonElementFrom(GsonUtils.toJsonString(p)));
		System.out
				.println(GsonUtils.jsonElementFrom(GsonUtils.toJsonString(i)));
		System.out.print("\n");

		System.out.print("\n");
	}
}
