package org.gradle;

import org.junit.Test;

import com.apecs.util.Person;

import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void canConstructAPersonWithAName() {
		Person person = new Person("Larry", "Page");
		assertEquals("Larry", person.getName());
	}
}
