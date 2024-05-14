package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.pojo.UserPojo;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.example.demox.service.UserService ;

import java.util.List;
import java.util.Optional;

@Service

public class UserServiceImpl implements  UserService {
    private UserRepository userRepository;


    public User saveUser(UserPojo userPojo) {
        User user = new User() ;
        user.setName(userPojo.getName()) ;
        user.setId(userPojo.getId()) ;

        userRepository.save(user) ;

        return user;
    }


    @Override
    public User saveData(UserPojo userPojo) {
        return null;
    }

    @Override
    public List<User> getAllData() {
        return List.of();
    }

    @Override
    public Optional<UserPojo> getDataById(String id) {
        return Optional.empty();
    }

    @Override
    public void deleteDataById(String id) {

    }
}

