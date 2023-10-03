package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.service;


import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.exception.CarNotFoundException;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.CarResponseDTO;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.DtoRequestCar;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.entity.Car;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.repository.CarRepository;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.service.assembler.CarDTOAssembler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    private final CarDTOAssembler assembler;

    public CarResponseDTO create(DtoRequestCar requestDTO) {
        var car = assembler.toModel(requestDTO);
        var carSave = carRepository.save(car);

        return assembler.toDTO(carSave);
    }

    public CarResponseDTO findBy(Long id) {
        var car = fetchOrFail(id);
        return assembler.toDTO(car);
    }

    private Car fetchOrFail(Long id) {
        return carRepository.findById(id).orElseThrow(CarNotFoundException::new);
    }
}