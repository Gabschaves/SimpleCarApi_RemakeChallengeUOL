package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.service.assembler;

import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.CarResponseDTO;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.DtoRequestCar;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.entity.Car;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarDTOAssembler {

    private final ModelMapper modelMapper;

    public CarResponseDTO toDTO(Car car){
        return modelMapper.map(car, CarResponseDTO.class);
    }

    public Car toModel(DtoRequestCar requestDTO){
        return modelMapper.map(requestDTO, Car.class);
    }
}