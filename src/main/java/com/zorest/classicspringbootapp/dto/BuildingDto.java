package com.zorest.classicspringbootapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BuildingDto {

    private Integer id;

    private String name;

    private Integer floors;

}
