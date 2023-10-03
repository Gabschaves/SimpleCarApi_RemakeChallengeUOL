package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.controller;

import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.CarResponseDTO;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.DtoRequestCar;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @GetMapping("/{chassiId}")
    public ResponseEntity<CarResponseDTO> getCar(@PathVariable Long chassiId){
        return ResponseEntity.ok(carService.findBy(chassiId));
    }

    @PostMapping
    public ResponseEntity<CarResponseDTO> postCar(@RequestBody @Valid DtoRequestCar requestDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.create(requestDTO));
    }

}
