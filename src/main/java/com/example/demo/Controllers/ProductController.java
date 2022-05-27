package com.example.demo.Controllers;

import com.example.demo.Models.Product;
import com.example.demo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product")
    public List<Product> getAllProduct () {
        return productService.getAllProducts();
    }

    @PostMapping("create")
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "Product successfully added";
    }

    @DeleteMapping("delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProductById(id);
        return "Product successfully deleted";
    }
}
