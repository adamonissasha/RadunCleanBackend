package com.example.demo.Services;

import com.example.demo.Models.Cart;
import com.example.demo.Repositories.CartRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class CartService {
    @Autowired
    CartRepository cartRepository;
    public List<Cart> getCart() {
        return cartRepository.findAll();
    }

    public void addElementToCart(Cart cart) {
        cartRepository.save(cart);
    }

    public void deleteCartElement(Long id) {
        cartRepository.deleteById(id);
    }

    public Long getCartSum(Long userId) {
        final long[] sum = {0};
        cartRepository.findByUserId(userId).forEach((el) -> sum[0] += el.getPrice() * el.getCount());

        return sum[0]; }
}