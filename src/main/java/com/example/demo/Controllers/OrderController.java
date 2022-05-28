package com.example.demo.Controllers;

import com.example.demo.Models.Order;
import com.example.demo.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/order/{userId}")
    public List<Order> getOrder(@PathVariable Long userId) {
        return orderService.getOrder(userId);
    }

    @PostMapping("addOrder")
    public String addOrder(@RequestBody Order order) {
        orderService.addOrder(order);
        return "Order successfully added";
    }

//    @DeleteMapping("deleteCartElement/{id}")
//    public String deleteCartElement(@PathVariable Long id) {
//        cartService.deleteCartElement(id);
//        return "Cart element successfully deleted";
//    }

//    @GetMapping("/cartSum/{userId}")
//    public Long getCartSum(@PathVariable Long userId) {
//        return cartService.getCartSum(userId);
//    }
}

