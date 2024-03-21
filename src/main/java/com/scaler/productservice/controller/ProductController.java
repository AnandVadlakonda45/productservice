package com.scaler.productservice.controller;

import com.scaler.productservice.exceptions.ProductNotExistsException;
import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private RestTemplate restTemplate;
    public ProductController(ProductService productService , RestTemplate restTemplate){
        this.productService = productService;
        this.restTemplate = restTemplate;
    }

    //to get all the products
    @GetMapping()
    public List<Product> getAllProducts(){

        ResponseEntity<List<Product>> response = new ResponseEntity<>(productService.getAllProducts(),
                HttpStatus.FORBIDDEN);

        return productService.getAllProducts();
    }

    //to single product
    @GetMapping("/{id}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("id") Long id) throws ProductNotExistsException {

        return new ResponseEntity<>(
                productService.getSingleProduct(id),
                HttpStatus.OK
        );

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
