package com;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Student {

// Get call using spring based web services
@GetMapping("/myurl")
public String sayHello()
{
System.out.println("sayHello....");
return "Hi User";
}
//retrieve the person info using @GET Method
@GetMapping("/studentinfo")
public StudentInfo getStudentInfo() {
StudentInfo student =new StudentInfo();
//creating java object
student.setId(1);
student.setStudentName("Naveen");
student.setRollNumber("23");
student.setMobile("8759847984");
student.setBranch("Information Technology");
student.setEmail("naveen@gmail.com");
student.setAddress("Delhi");
student.setPincode(222105);
return student;
}
// retrieve the person information by id
@GetMapping("/studentinfo/{id}")
public StudentInfo getStudentById(@PathVariable("id") Integer id) {

StudentInfo student =new StudentInfo();
//creating java object
student.setId(id);
student.setStudentName("Naveen");
student.setRollNumber("23");
student.setMobile("8759847984");
student.setBranch("Information Technology");
student.setEmail("naveen@gmail.com");
student.setAddress("Delhi");
student.setPincode(222105);
return student;

}
// add the person information POst
@PostMapping(value = "/insertpersondetails")
public StudentInfo insertDummyPerson(@RequestBody StudentInfo student) {
return new StudentService().addStudent(student); //calling the service
}
//update person info
@PutMapping("/update")
public StudentInfo updateStudentInfo(@RequestBody StudentInfo student) {
return new StudentService().updateStudent(student);
}
//get list
@GetMapping("/getlist")
public List<StudentInfo> getDummyList() {
List<StudentInfo> listOfStudent = new StudentService().getAllStudentlist();
return listOfStudent;
}
//delete list
@DeleteMapping("/delete/{id}")
public List<StudentInfo> deleteStudentById(@PathVariable Integer id) {
new StudentService().deleteStudent(id);
return new StudentService().getAllStudentlist();
}
}