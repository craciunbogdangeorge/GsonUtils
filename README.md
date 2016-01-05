# GsonUtils
Util class for converting raw objects to their JSON String representation, using Google's Gson and JsonParser, so they can be used for storage on Google Datastore and/or Android SharedPreferences.

Static methods:
- String toJsonString(Object object), 
  
example: 

Person p = new Person("Ion", "Barack");

GsonUtils.toJsonString(p);

System.out.println(GsonUtils.toJsonString(p)); 

// Output: {"name":"Ion","surname":"Barack"}


- String toJsonString(Object object, Type typeOfT),

  example:

  Map.Entry<String, Integer> entry = new AbstractMap.SimpleEntry<String, Integer>("sampleKey", 1729);
  
  System.out.println(GsonUtils.toJsonString(entry, AbstractMap.SimpleEntry.class)); 
  
  // Output: {"key":"sampleKey","value":1729}
  

- Object fromJsonString(String json),

  example:
  
  Object o = (Object) GsonUtils.fromJsonString(GsonUtils.toJsonString(p));
  
  System.out.println(o); 
	
  // Output: {name=Ion, surname=Barack}
  

- <T> T fromJsonString(String json, Type typeOfT),

  example:
  
  IndexMeter i = new IndexMeter(1, "ionBarack", GsonUtils.toJsonString(p));
  
  i = GsonUtils.fromJsonString(GsonUtils.toJsonString(i), IndexMeter.class);
  
  System.out.println(i);  
  
  // Output: 
  
  // Id: 1
  
  // providerUserId :ionBarack
  
  // nameValueEntry: {"name":"Ion","surname":"Barack"}
  

- JsonObject toJsonObject(String jsonStringObject),

  example:

  System.out.println("toJsonObject: " + GsonUtils.toJsonObject(GsonUtils.toJsonString(p)));
  
  // Output: toJsonObject: {"name":"Ion","surname":"Barack"}
  

- JsonArray toJsonArray(String jsonStringArray),

  example:

  List<String> list = new ArrayList<String>();
  
  list.add(GsonUtils.toJsonString(p));
  
  list.add(GsonUtils.toJsonString(i));
  
  list.add(GsonUtils.toJsonString(entry));
	
  System.out.println(GsonUtils.toJsonArray(GsonUtils.toJsonString(list)));
  
  // Output:
  
  // ["{\"name\":\"Ion\",\"surname\":\"Barack\"}",
  
  // "{\"id\":1,\"nameValueEntry\":\"{\\\"name\\\":\\\"Ion\\\",\\\"surname\\\":\\\"Barack\\\"}\",\"providerUserId\":\"ionBarack\"}",
  
  // "{\"key\":\"sampleKey\",\"value\":1729}"]
  
