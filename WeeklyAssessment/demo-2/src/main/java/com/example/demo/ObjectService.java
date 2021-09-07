package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class ObjectService {

 static HashMap<Integer, Object> objectIdMap = getObjectIdMap(); //map list

 public ObjectService() {
super();

 if (objectIdMap == null) {
objectIdMap = new HashMap<Integer, Object>();
// Creating some objects of Object while initializing
Object indiaStudent = new Object(1, "Dheeru", "dheeru@gmail.com", "Delhi");
Object chinaStudent = new Object(2, "Dheerendra", "dheerendra@gmail.com", "Bareilly");
Object nepalStudent = new Object(3, "Rohit", "rohit@gmail.com", "Sitapur");
Object bhutanStudent = new Object(4, "Ashu", "Ashu@gmail.com", "Banaras");

 //adding map list of collections in java
objectIdMap.put(1, indiaStudent);
objectIdMap.put(4, chinaStudent);
objectIdMap.put(3, nepalStudent);
objectIdMap.put(2, bhutanStudent);
}
}

 

public List<Object> getAllObjectlist() {
List<Object> objectlist = new ArrayList<Object>(objectIdMap.values());
return objectlist;
}

 public Object getObject(int id) {
Object Object = objectIdMap.get(id);
return Object;
}
// add Object
public Object addObject(Object Object) {
Object.setId(getMaxId()+ 1);
// key , value
objectIdMap.put(Object.getId(), Object); ///logic class
return Object;
}
//update
public Object updateObject(Object object) {
if (object.getId() <= 0)
return null;
objectIdMap.put(object.getId(), object);
return object;

 }
//delete

 public void deleteObject(int id) {
objectIdMap.remove(id);
}

 public static HashMap<Integer, Object> getObjectIdMap() {
return objectIdMap;
}

 // Utility method to get max id
public static int getMaxId() {
int max = 0;
for (int id : objectIdMap.keySet()) {
if (max <= id)
max = id;

 }
return max;
}
}