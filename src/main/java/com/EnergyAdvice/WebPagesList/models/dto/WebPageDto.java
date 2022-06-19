package com.EnergyAdvice.WebPagesList.models.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WebPageDto {
    private Integer id;
    private String title;
    private String url;
    private String logo;
}
