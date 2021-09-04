package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class ProductService {

 static HashMap<Integer, Product> productIdMap = getProductIdMap(); //map list

 public ProductService() {
super();

 if (productIdMap == null) {
productIdMap = new HashMap<Integer, Product>();
// Creating some objects of Object while initializing
Product indiaStudent = new Product(1, "Patanjali", "Patanjali@gmail.com", "Haridwar");
Product chinaStudent = new Product(2, "Dabur", "Dabur@gmail.com", "Dehli");
Product nepalStudent = new Product(3, "GSK", "gsk@gmail.com", "Sitapur");
Product bhutanStudent = new Product(4, "Brabo", "Brabo@gmail.com", "Banaras");

 //adding map list of collections in java
productIdMap.put(1, indiaStudent);
productIdMap.put(4, chinaStudent);
productIdMap.put(3, nepalStudent);
productIdMap.put(2, bhutanStudent);
}
}

 

public List<Product> getAllProductlist() {
List<Product> productlist = new ArrayList<Product>(productIdMap.values());
return productlist;
}

 public Product getProduct(int id) {
Product Product = productIdMap.get(id);
return Product;
}
// add product
public Product addProduct(Product Product) {
Product.setId(getMaxId()+ 1);
// key , value
productIdMap.put(Product.getId(), Product); ///logic class
return Product;
}
//update
public Product updateProduct(Product product) {
if (product.getId() <= 0)
return null;
productIdMap.put(product.getId(), product);
return product;

 }
//delete

 public void deleteProduct(int id) {
productIdMap.remove(id);
}

 public static HashMap<Integer, Product> getProductIdMap() {
return productIdMap;
}

 // Utility method to get max id
public static int getMaxId() {
int max = 0;
for (int id : productIdMap.keySet()) {
if (max <= id)
max = id;

 }
return max;
}
}