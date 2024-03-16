package com.scaler.productservice.controller;

import com.scaler.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    //to get all the products
    @GetMapping()
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }

    //to single product
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        return new Product();
    }

    //to add new product
    @PostMapping("/")
    public Product addNewProduct(@RequestBody Product product){
        Product p = new Product();
        p.setTitle("A new product");
        return p;
    }

    //to update the product
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id ,@RequestBody Product product){
        return new Product();
    }

    //to replace the product
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable ("id") Long id, @RequestBody Product product){
        return new Product();
    }

    //to delete the product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){

    }
}
