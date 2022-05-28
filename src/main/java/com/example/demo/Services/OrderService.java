package com.example.demo.Services;

import com.example.demo.Models.Order;
import com.example.demo.Repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getOrder(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    public void addOrder(Order order) {
        orderRepository.save(order);
    }

}