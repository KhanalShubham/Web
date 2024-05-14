package com.example.demox.service;

import com.example.demo.entity.User;
import com.example.demo.pojo.UserPojo;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserService {
   User saveData(UserPojo userPojo) ;
   List<User> getAllData();
   Optional<UserPojo> getDataById(String id);
   void deleteDataById(String id);
}