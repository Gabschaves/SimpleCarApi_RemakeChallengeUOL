package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.service;


import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.CarResponseDTO;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.repository.CarRepository;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.service.assembler.CarDTOAssembler;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {
    @InjectMocks
    private CarService carService;

    @Mock
    private CarRepository carRepository;

    @Mock
    private CarResponseDTO carResponseDTO;

    @Mock
    private CarDTOAssembler carDTOAssembler;


}