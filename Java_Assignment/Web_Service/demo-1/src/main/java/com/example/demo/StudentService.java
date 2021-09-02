package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class StudentService {

 static HashMap<Integer, Student> studentIdMap = getStudentIdMap(); //map list

 public StudentService() {
super();

 if (studentIdMap == null) {
studentIdMap = new HashMap<Integer, Student>();
// Creating some objects of Student while initializing
Student indiaStudent = new Student(1, "ram1", "ram@gmail.com", "delhi");
Student chinaStudent = new Student(2, "ram2", "ram@gmail.com", "delhi");
Student nepalStudent = new Student(3, "ram3", "ram@gmail.com", "delhi");
Student bhutanStudent = new Student(4, "ram4", "ram@gmail.com", "delhi");

 //adding map list of collections in java
studentIdMap.put(1, indiaStudent);
studentIdMap.put(4, chinaStudent);
studentIdMap.put(3, nepalStudent);
studentIdMap.put(2, bhutanStudent);
}
}

 public List<Student> getAllStudentlist() {
List<Student> studentlist = new ArrayList<Student>(studentIdMap.values());
return studentlist;
}

 public Student getStudent(int id) {
Student Student = studentIdMap.get(id);
return Student;
}
// add Student
public Student addStudent(Student Student) {
Student.setId(getMaxId()+ 1);
// key , value
studentIdMap.put(Student.getId(), Student); ///logic class
return Student;
}
//update
public Student updateStudent(Student student) {
if (student.getId() <= 0)
return null;
studentIdMap.put(student.getId(), student);
return student;

 }
//delete

 public void deleteStudent(int id) {
studentIdMap.remove(id);
}

 public static HashMap<Integer, Student> getStudentIdMap() {
return studentIdMap;
}

 // Utility method to get max id
public static int getMaxId() {
int max = 0;
for (int id : studentIdMap.keySet()) {
if (max <= id)
max = id;

 }
return max;
}
}