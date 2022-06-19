package com.EnergyAdvice.WebPagesList.converters;

import org.springframework.stereotype.Component;

import java.util.List;
import static java.util.stream.Collectors.toList;

import  com.EnergyAdvice.WebPagesList.models.dto.WebPageDto;
import  com.EnergyAdvice.WebPagesList.models.entities.WebPageEntity;



@Component
public class WebPageConverter {
    public List<WebPageDto> webPageDtoListConvert(List<WebPageEntity> webPageEntityList) {
        return webPageEntityList.stream().map(this::webPageConvert)
                                .collect(toList());
    }

    public WebPageDto webPageConvert(WebPageEntity webPageEntity){
        WebPageDto webPageDto = new WebPageDto( webPageEntity.getId(), webPageEntity.getTitle(), webPageEntity.getUrl(), webPageEntity.getLogo());
        return webPageDto;
    }

    public WebPageEntity webPageEntityConvert(WebPageDto webPageDto) {
        WebPageEntity webPageEntity = new WebPageEntity( webPageDto.getTitle(), webPageDto.getUrl(), webPageDto.getLogo());
        return webPageEntity;
    }
}
