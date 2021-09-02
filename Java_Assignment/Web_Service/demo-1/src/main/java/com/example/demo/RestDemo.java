package com.example.demo;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

StudentService studentService = new StudentService();

 // Get callusing spring based web service

 @GetMapping("/myurl")
public String sayHello() {

 return "hi how are you";
}

// retrive person info USing @GET MEthod
@GetMapping("/personinfo")
public Student getDummyStudent() {

 Student s = new Student();// creating java object
s.setName("Dheeru");
s.setEmail("Dheeru@gmail.com");
s.setAddress("Bareilly");
s.setId(10);
return s;
}

 // retrive the person information by id

 @GetMapping("/personinforid/{id}")
public Student getDummyStudentById(@PathVariable("id") Integer id) {

 Student p = new Student();// creating java object

 p.setId(id);
p.setName("Ram");
p.setEmail("Ram@gmail.com");
p.setAddress("delhi");
return p;
}


 // add the person information POst

 @PostMapping(value = "/insertpersondetails")
public Student insertDummyStudent(@RequestBody Student student) {
return studentService.addStudent(student); //calling the service
}

//update person info
@PutMapping("/update")
public Student updatestudentInfo(@RequestBody Student student) {
return studentService.updateStudent(student);

 }

//get list
@GetMapping("/getlist")
public List<Student> getDummyStudentList() {
List<Student> listOfStudent = studentService.getAllStudentlist();
return listOfStudent;
}

//delete list
@DeleteMapping("/delete/{id}")
public List<Student> deleteStudentById(@PathVariable Integer id) {
new StudentService().deleteStudent(id);
return new StudentService().getAllStudentlist();
}

}