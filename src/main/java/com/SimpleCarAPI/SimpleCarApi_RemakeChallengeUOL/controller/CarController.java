package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.controller;

import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.CarResponseDTO;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.DtoRequestCar;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.entity.Car;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.repository.CarRepository;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;
    @Autowired
    private CarRepository carRepository;

    @GetMapping("/{chassiId}")
    public ResponseEntity<CarResponseDTO> getCar(@PathVariable Long chassiId){
        return ResponseEntity.ok(carService.findBy(chassiId));
    }
    @GetMapping
    public List<CarResponseDTO> getAllCars(){
        return carService.findAll();
    }


    @PostMapping
    public ResponseEntity<CarResponseDTO> postCar(@RequestBody @Valid DtoRequestCar requestDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.create(requestDTO));
    }

}
