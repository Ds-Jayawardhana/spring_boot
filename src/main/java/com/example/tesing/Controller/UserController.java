package com.example.tesing.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "Hello World";
    }
    @PostMapping("/saveUser")
    public String SaveUser(){
        return "User Saved";
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
