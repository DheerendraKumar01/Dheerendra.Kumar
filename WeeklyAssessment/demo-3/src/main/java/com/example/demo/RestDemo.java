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

ProductService productService = new ProductService();

 // Get callusing spring based web service

 @GetMapping("/myurl")
public String sayHello() {

 return "hi how are you";
}

// retrive person info USing @GET MEthod
@GetMapping("/personinfo")
public Product getDummyProduct() {

 Product p = new Product();// creating java object
p.setName("Patanjali");
p.setEmail("Patabjali@gmail.com");
p.setAddress("Haridwar");
p.setId(10);
return p;
}

 // retrive the product information by id

 @GetMapping("/personinforid/{id}")
public Product getDummyProductById(@PathVariable("id") Integer id) {

 Product p = new Product();// creating java object

 p.setId(id);
p.setName("Dabar");
p.setEmail("Dabar@gmail.com");
p.setAddress("Delhi");
return p;
}


 // add the product information POst

 @PostMapping(value = "/insertpersondetails")
public Product insertDummyProduct(@RequestBody Product product) {
return productService.addProduct(product); //calling the service
}

//update product info
@PutMapping("/update")
public Product updateInfo(@RequestBody Product product) {
return productService.updateProduct(product);

 }

//get list
@GetMapping("/getlist")
public List<Product> getDummyProductList() {
List<Product> listOfProduct = productService.getAllProductlist();
return listOfProduct;
}

//delete list
@DeleteMapping("/delete/{id}")
public List<Product> deleteProductById(@PathVariable Integer id) {
new ProductService().deleteProduct(id);
return new ProductService().getAllProductlist();
}

}