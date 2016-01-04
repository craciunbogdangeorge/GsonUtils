package com.apecs.util;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Person p = new Person("Ion", "Barack");
		IndexMeter i = new IndexMeter(1, "id", "water - 5");
		Map.Entry<String, Integer> entry = new AbstractMap.SimpleEntry<String, Integer>("sampleKey", 1729);
		
		List<String> list = new ArrayList<String>();
		list.add(GsonUtils.toJsonString(p));
		list.add(GsonUtils.toJsonString(i));
		list.add(GsonUtils.toJsonString(entry));

		System.out.println("String representation test");
		System.out.println(GsonUtils.toJsonString(p));
		System.out.println(GsonUtils.toJsonString(i));
		System.out.println(GsonUtils.toJsonString(entry));
		System.out.println(GsonUtils.toJsonString(list));
		System.out.print("\n");

		System.out.println("JSON object element from string test");
		System.out
				.println("toJsonObject: " + GsonUtils.toJsonObject(GsonUtils.toJsonString(p)));
		System.out
				.println("jsonElementFrom: " + GsonUtils.jsonElementFrom(GsonUtils.toJsonString(i)));
		System.out.print("\n");
		
		System.out
		.println("jsonElementFrom: " + GsonUtils.jsonElementFrom(GsonUtils.toJsonString(p)));
		System.out
				.println("toJsonObject: " + GsonUtils.toJsonObject(GsonUtils.toJsonString(i)));
		System.out.print("\n");
		
		System.out.println("To JSON array from string test");
		System.out
				.println(GsonUtils.toJsonArray(GsonUtils.toJsonString(list)));



		System.out.print("\n");
	}
}
