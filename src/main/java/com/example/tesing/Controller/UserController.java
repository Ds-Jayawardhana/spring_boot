package com.example.tesing.Controller;

import com.example.tesing.dto.UserDTO;
import com.example.tesing.entity.User;
import com.example.tesing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/getUsers")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }
    @PostMapping("/saveUser")
    public UserDTO SaveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }
    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }
    @GetMapping("/getUserById/{userID}")
    public UserDTO getUserByID(@PathVariable String userID){
        return userService.getUserByID(userID);
    }
    @GetMapping("/getUserByIdAndName/{userID}/{name}")
    public UserDTO getUserByIdAndName(@PathVariable String userID,@PathVariable String name){
        return userService.getUserByIDAndName(userID,name);
    }Done

}




