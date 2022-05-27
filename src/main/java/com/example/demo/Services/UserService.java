package com.example.demo.Services;

import com.example.demo.Models.User;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.request.SignInRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        user.setActive(true);
        user.setRoles("user");
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void changeUserActivity(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setActive(!user.isActive());
        }
        userRepository.save(user);
    }

    public User signIn(SignInRequest signInRequest) {
        String email = signInRequest.getEmail();
        System.out.println(userRepository.findByEmail(email));
        User user = userRepository.findByEmail(email);
        if(user.getEmail().equals(signInRequest.getEmail())){
           return user.getPassword().equals(signInRequest.getPassword()) ? user : null;
        }
        return  user;
    }
}