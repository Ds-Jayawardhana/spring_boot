package com.example.tesing.Controller;


import com.example.tesing.dto.UserDTO;
import com.example.tesing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/getUser")
    public String getUser(){
        return "Hello World";
    }
    @PostMapping("/saveUser")
    public UserDTO SaveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "userUpdated";
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "User Deleted";
    }
}
