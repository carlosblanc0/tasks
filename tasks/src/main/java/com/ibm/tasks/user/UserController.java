package com.ibm.tasks.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @PostMapping("/")
    public void createUser(@RequestBody UserModel userModel) {
        System.out.println("Username: " + userModel.username);
    }
}
