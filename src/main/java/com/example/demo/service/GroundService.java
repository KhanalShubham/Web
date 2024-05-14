package com.example.demox.service;


import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface GroundService {
    Ground saveData(GroundPojo groundPojo);
    List<Ground> getData();
    void deleteDataById(int id);
    Optional<Ground> findById(int id);
    List<GroundPojo> searchData(String keyword);




}
