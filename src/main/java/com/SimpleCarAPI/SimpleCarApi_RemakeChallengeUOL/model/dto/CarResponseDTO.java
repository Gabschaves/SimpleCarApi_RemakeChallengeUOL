package com.SimpleCarAPI.SimpleCarApi_RemakeChallengeUOL.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarResponseDTO {

    private Long ChassiId;

    private String Model;

    private String Brand;

    private String Color;

    private String FabricationYear;

}
