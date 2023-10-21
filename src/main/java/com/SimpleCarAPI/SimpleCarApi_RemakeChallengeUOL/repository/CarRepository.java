package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.repository;

import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto.CarResponseDTO;
import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {

}
