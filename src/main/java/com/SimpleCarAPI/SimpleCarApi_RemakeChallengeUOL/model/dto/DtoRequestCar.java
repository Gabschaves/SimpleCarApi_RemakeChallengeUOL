package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoRequestCar {

    @NotBlank
    private  String Model;

    @NotBlank
    private String Brand;

    @NotBlank
    private String Color;

    @NotBlank
    private String FabricationYear;
}
