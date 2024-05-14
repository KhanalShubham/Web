package com.example.demox.service.impl;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;
import com.example.demo.repository.GroundRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.demox.service.GroundService ;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Service




public class GroundServiceImpl implements GroundService {

    private final GroundRepository groundRepository;

    public Ground saveData(GroundPojo groundPojo){
        Ground ground = new Ground();
        ground.setId(groundPojo.getId());
        ground.setGroundName(groundPojo.getGroundName());
        groundRepository.save(ground);
        return ground;
    }

    @Override
    public List<Ground> getData() {
        return List.of();
    }

    @Override
    public void deleteDataById(int id) {

    }

    @Override
    public Optional<Ground> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<GroundPojo> searchData(String keyword) {
        return List.of();
    }


}