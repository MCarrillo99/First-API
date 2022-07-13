package com.develhope.myfirstAPI.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    @NotBlank
    private String id;
    @NotBlank
    private String carModel;

    private double price;
}
