package com.example.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import com.example.password.entity.User;
import com.example.password.repository.UserRepository;

@Controller
@RequestMapping("/")
@CrossOrigin
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public String createUser(User user) {
        userRepository.save(user);
        return "redirect:/create";
    }
    @GetMapping("/create")
    public String getCreateForm() {
        // Return the HTML form
        return "createUserForm";
    }
}
