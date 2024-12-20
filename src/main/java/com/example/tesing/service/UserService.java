package com.example.tesing.service;


import com.example.tesing.dto.UserDTO;
import com.example.tesing.entity.User;
import com.example.tesing.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.lang.model.element.ModuleElement;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
    public List<UserDTO> getAllUsers(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }
    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }
    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }

    //user id >user details
    // select * from user where id=2

    public UserDTO getUserByID(String userId){
        User user=userRepo.getUserByID(userId);
        return modelMapper.map(user,UserDTO.class);
    }

    //user id , address > user details
    //select * from user where id =2 and address ="kandy"
    public UserDTO getUserByIDAndName(String userId,String name){
        User user =userRepo.getUserByIdAndName(userId,name);
        return modelMapper.map(user, UserDTO.class);
    }
}
