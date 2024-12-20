package com.example.tesing.repo;

import com.example.tesing.entity.User;
import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository <User, Integer>{

    @Query(value = "SELECT * FROM USER WHERE ID =?1",nativeQuery = true)
    User getUserByID(String userId);

    @Query(value = "SELECT * FROM USER WHERE ID = ?1 AND NAME =?2",nativeQuery = true)
    User getUserByIdAndName(String userId,String name);
}
