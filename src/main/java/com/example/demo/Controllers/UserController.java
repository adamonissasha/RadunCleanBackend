package com.example.demo.Controllers;

import com.example.demo.Models.User;
import com.example.demo.Repositories.UserRepository;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getAllUsers () {
        return userService.getAllUsers();
    }

    @PostMapping("addUser")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "User successfully added";
    }

    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "User successfully deleted";
    }

    @PutMapping("changeUserActivity/{id}")
    public String changeUserActivity(@PathVariable Long id) {
        userService.changeUserActivity(id);
        return "User activity successfully changed";
    }
}

