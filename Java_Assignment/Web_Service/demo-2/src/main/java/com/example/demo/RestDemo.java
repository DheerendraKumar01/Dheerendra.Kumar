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

ObjectService objectService = new ObjectService();

 // Get callusing spring based web service

 @GetMapping("/myurl")
public String sayHello() {

 return "hi how are you";
}

// retrive person info USing @GET MEthod
@GetMapping("/personinfo")
public Object getDummyObject() {

 Object o = new Object();// creating java object
o.setName("Dheeru");
o.setEmail("Dheeru@gmail.com");
o.setAddress("Bareilly");
o.setId(10);
return o;
}

 // retrive the person information by id

 @GetMapping("/personinforid/{id}")
public Object getDummyStudentById(@PathVariable("id") Integer id) {

 Object p = new Object();// creating java object

 p.setId(id);
p.setName("Ram");
p.setEmail("Ram@gmail.com");
p.setAddress("delhi");
return p;
}


 // add the person information POst

 @PostMapping(value = "/insertpersondetails")
public Object insertDummyObject(@RequestBody Object object) {
return objectService.addObject(object); //calling the service
}

//update person info
@PutMapping("/update")
public Object updateInfo(@RequestBody Object object) {
return objectService.updateObject(object);

 }

//get list
@GetMapping("/getlist")
public List<Object> getDummyObjectList() {
List<Object> listOfObject = objectService.getAllObjectlist();
return listOfObject;
}

//delete list
@DeleteMapping("/delete/{id}")
public List<Object> deleteObjectById(@PathVariable Integer id) {
new ObjectService().deleteObject(id);
return new ObjectService().getAllObjectlist();
}

}