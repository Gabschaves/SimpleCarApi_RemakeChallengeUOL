package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.repository;

import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {

}
