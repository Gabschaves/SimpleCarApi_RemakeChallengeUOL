package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.entity;

import com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.exception.BrandException;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chassiId;

    @Column
    @NotNull
    @NotEmpty
    private String modelCar;

    @Column
    @NotNull
    @NotEmpty
    private String brand;

    @Column
    @NotNull
    @NotEmpty
    private String Color;

    @Column
    @NotNull
    @NotEmpty
    private String fabricationYear;

    public String getBrands() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!isValidBrand(brand)) {
            throw new BrandException(brand);
        }
        this.brand = brand;
    }

    private boolean isValidBrand(String brand) {
        return brand != null && (brand.equals("Ford") || brand.equals("Chevrolet") || brand.equals("BMW") || brand.equals("Volvo"));

    }
}