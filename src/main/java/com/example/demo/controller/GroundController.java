package com.example.demo.controller;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;

import com.example.demo.shared.Pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demox.service.GroundService;

import java.util.List;

@RestController
@RequestMapping("/ground")
@RequiredArgsConstructor

public class GroundController {

    private GroundService groundService;

    @GetMapping
    public GlobalApiResponse<List<Ground>> getData() {
        return GlobalApiResponse.
                <List<Ground>>builder()
                .data(this.groundService.getData())
                .statusCode(200)
                .message("data retreived successfully")
                .build();
    }

    @PostMapping
    public GlobalApiResponse<String> save(@RequestBody GroundPojo groundPojo) {
        this.groundService.saveData(groundPojo);
        return GlobalApiResponse.
                <String>builder()
                .data("saved")
                .statusCode(200)
                .message("data saved successfully")
                .build();
    }
//    private final GroundService groundService;





//    @PostMapping("/save")
//
//    public void save(@RequestBody GroundPojo groundPojo){
//
//        this.groundService.saveData(groundPojo);
//    }

//    @DeleteMapping("/delete/(id)")
//    public ResponseEntity<String> deleteData(@PathVariable Integer id){
//        boolean deleted= this.groundService.deletedById(id);
//        if(deleted){
//            return ResponseEntity.ok("Ground with ID"+id+" has been deleted.");
//        }
//        else{
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ground with ID"+id+"not found");
//        }
//    }
@PutMapping
public GlobalApiResponse <Ground> update(@RequestBody GroundPojo groundPojo) {
    Ground updateGround = this.groundService.saveData(groundPojo);
    return  GlobalApiResponse.<Ground>builder()
            .data(updateGround)
            .statusCode(200)
            .message("Data Updated sucessfully")
            .build();
}

    @DeleteMapping("delete/{id}")
    public GlobalApiResponse<String> delete(@PathVariable int id) {
        this.groundService.deleteDataById(id);
        return GlobalApiResponse.<String>builder()
                .data("Ground entity with  ID " + id + "delete successfully")
                .statusCode(200)
                .message("data delete successfully")
                .build() ;

    }



}
























