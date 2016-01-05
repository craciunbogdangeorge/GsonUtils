package com.apecs.util;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Person p = new Person("Ion", "Barack");
		IndexMeter i = new IndexMeter(1, "ionBarack", GsonUtils.toJsonString(p));
		Map.Entry<String, Integer> entry = new AbstractMap.SimpleEntry<String, Integer>("sampleKey", 1729);
		
		List<String> list = new ArrayList<String>();
		list.add(GsonUtils.toJsonString(p));
		list.add(GsonUtils.toJsonString(i));
		list.add(GsonUtils.toJsonString(entry));

		System.out.println("String representation test");
		System.out.println(GsonUtils.toJsonString(p));
		System.out.println(GsonUtils.toJsonString(i));
		System.out.println(GsonUtils.toJsonString(entry, AbstractMap.SimpleEntry.class));
		System.out.println(GsonUtils.toJsonString(list));
		System.out.print("\n");
		
//		String representation test
//		{"name":"Ion","surname":"Barack"}
//		{"id":1,"nameValueEntry":"{\"name\":\"Ion\",\"surname\":\"Barack\"}","providerUserId":"ionBarack"}
//		{"key":"sampleKey","value":1729}
		
//		["{\"name\":\"Ion\",\"surname\":\"Barack\"}",
//		"{\"id\":1,\"nameValueEntry\":\"{\\\"name\\\":\\\"Ion\\\",\\\"surname\\\":\\\"Barack\\\"}\",\"providerUserId\":\"ionBarack\"}",
//		"{\"key\":\"sampleKey\",\"value\":1729}"]
		
		System.out.println("String representation of objects test");
		Object o = (Object) GsonUtils.fromJsonString(GsonUtils.toJsonString(p));
		System.out.println(o);
		
		i = GsonUtils.fromJsonString(GsonUtils.toJsonString(i), IndexMeter.class);
		System.out.println(i);
		
		System.out.print("\n");
		
//		{name=Ion, surname=Barack}
//		Id: 1
//		providerUserId :ionBarack
//		nameValueEntry: {"name":"Ion","surname":"Barack"}

		System.out.println("JSON object element from string test");
		System.out
				.println("toJsonObject: " + GsonUtils.toJsonObject(GsonUtils.toJsonString(p)));
		System.out
				.println("jsonElementFrom: " + GsonUtils.jsonElementFrom(GsonUtils.toJsonString(i)));
		System.out.print("\n");
		
//		toJsonObject: {"name":"Ion","surname":"Barack"}
//		jsonElementFrom: {"id":1,"nameValueEntry":"{\"name\":\"Ion\",\"surname\":\"Barack\"}","providerUserId":"ionBarack"}
		
		System.out
		.println("jsonElementFrom: " + GsonUtils.jsonElementFrom(GsonUtils.toJsonString(p)));
		System.out
				.println("toJsonObject: " + GsonUtils.toJsonObject(GsonUtils.toJsonString(i)));
		System.out.print("\n");
		
//		toJsonObject: {"id":1,"nameValueEntry":"{\"name\":\"Ion\",\"surname\":\"Barack\"}","providerUserId":"ionBarack"}
		
		System.out.println("To JSON array from string test");
		System.out
				.println(GsonUtils.toJsonArray(GsonUtils.toJsonString(list)));

		System.out.print("\n");
		
//		["{\"name\":\"Ion\",\"surname\":\"Barack\"}",
//		"{\"id\":1,\"nameValueEntry\":\"{\\\"name\\\":\\\"Ion\\\",\\\"surname\\\":\\\"Barack\\\"}\",\"providerUserId\":\"ionBarack\"}",
//		"{\"key\":\"sampleKey\",\"value\":1729}"]
	}
}
