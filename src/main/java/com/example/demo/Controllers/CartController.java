package com.example.demo.Controllers;

import com.example.demo.Models.Cart;
import com.example.demo.Services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping("/cart")
    public List<Cart> getCart () {
        return cartService.getCart();
    }

    @PostMapping("addElementToCart")
    public String addElementToCart(@RequestBody Cart cart){
        cartService.addElementToCart(cart);
        return "Cart element successfully added";
    }
    @DeleteMapping("deleteCartElement/{id}")
    public String deleteCartElement(@PathVariable Long id){
        cartService.deleteCartElement(id);
        return "Cart element successfully deleted";
    }

    @GetMapping("/cartSum/{userId}")
    public Long getCartSum (@PathVariable Long userId) {
        return cartService.getCartSum(userId);
    }
}

