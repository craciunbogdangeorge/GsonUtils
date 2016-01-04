package com.apecs.util;

import org.apache.commons.collections.list.GrowthList;

public class Person {
	private final String name;
	private final String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
		new GrowthList();
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
}
