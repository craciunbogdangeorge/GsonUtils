package com.apecs.util;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class GsonUtils {

	private static Gson gson = new Gson();

	private static JsonParser jsonParser = new JsonParser();

	/**
	 * Just making default constructor private for noninstantiability.
	 */
	private GsonUtils() {
		throw new AssertionError();
	}

	/**
	 * Returns the JSON String representation of an object.
	 * 
	 * @param object
	 *            an arbitrary object.
	 * @return a JSON String representation of the object.
	 */
	public static String toJsonString(Object object) {
		return gson.toJson(object);
	}

	/**
	 * Returns the JSON String representation of an object.
	 * 
	 * @param object
	 *            an arbitrary object.
	 * @param typeOfT
	 *            the type of the desired arbitrary object.
	 * @return a JSON String representation of the object.
	 */
	public static String toJsonString(Object object, Type typeOfT) {
		return gson.toJson(object, typeOfT);
	}

	/**
	 * Returns the JSON object as a plain java object.
	 * 
	 * @param json
	 *            a JSON String representation of a JSON object.
	 * @return a simple POJO.
	 */
	public static Object fromJsonString(String json) {
		return gson.fromJson(json, Object.class);
	}

	/**
	 * Returns the JSON object as a plain java object by the specified type.
	 * 
	 * @param json
	 *            a JSON String representation of a JSON object.
	 * @param typeOfT
	 *            the type of the desired object.
	 * @return a plain java object by the specified type.
	 */
	public static <T> T fromJsonString(String json, Type typeOfT) {
		return gson.fromJson(json, typeOfT);
	}

	/**
	 * Returns a JsonObject object from a String representation of a JSON
	 * object.
	 * 
	 * @param jsonStringObject
	 *            a String representation of a JSON object.
	 * @return a JsonObject object from the specified String.
	 * @throws JsonSyntaxException
	 *             if JSON is not a valid representation for an object of type.
	 * @throws IllegalStateException
	 *             if the element is of another type.
	 */
	public static JsonObject toJsonObject(String jsonStringObject)
			throws JsonSyntaxException, IllegalStateException {
		return jsonParser.parse(jsonStringObject).getAsJsonObject();
	}

	/**
	 * Returns a JsonArray object from a String representation of a JSON array
	 * object.
	 * 
	 * @param jsonStringArray
	 *            a String representation of a JSON array object.
	 * @return a JsonArray object from the specified String.
	 * @throws JsonSyntaxException
	 *             if JSON is not a valid representation for an object of type.
	 * @throws IllegalStateException
	 *             if the element is of another type.
	 */
	public static JsonArray toJsonArray(String jsonStringArray)
			throws JsonSyntaxException, IllegalStateException {
		return jsonParser.parse(jsonStringArray).getAsJsonArray();
	}

	/**
	 * 
	 * @param jsonStringObject
	 * @return
	 */
	public static boolean isJsonObject(String jsonStringObject) {
		try {
			return toJsonObject(jsonStringObject).isJsonObject();
		} catch (IllegalStateException e) {
			return false;
		}
	}

	/**
	 * 
	 * @param jsonStringArray
	 * @return
	 */
	public static boolean isJsonArray(String jsonStringArray) {

		try {
			return toJsonArray(jsonStringArray).isJsonArray();
		} catch (IllegalStateException e) {
			return false;
		}
	}

	/**
	 * Returns a jsonElement from a String representation of a JSON object.
	 * 
	 * @param jsonString
	 *            a String representation of a JSON object.
	 * @return a jsonElement from the specified String.
	 */
	public static JsonElement jsonElementFrom(String jsonString) {

		return jsonParser.parse(jsonString);
	}
}
