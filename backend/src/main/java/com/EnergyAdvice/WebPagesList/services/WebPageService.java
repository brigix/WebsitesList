package com.EnergyAdvice.WebPagesList.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EnergyAdvice.WebPagesList.models.entities.WebPageEntity;
import com.EnergyAdvice.WebPagesList.models.dto.WebPageDto;
import com.EnergyAdvice.WebPagesList.converters.WebPageConverter;
import com.EnergyAdvice.WebPagesList.repositories.WebPageRepository;

import java.util.List;

@Service
public class WebPageService {

    private WebPageRepository webPageRepository;
    private WebPageConverter webPageConverter;

    public WebPageService(WebPageRepository webPageRepository, WebPageConverter webPageConverter){
        this.webPageRepository = webPageRepository;
        this.webPageConverter = webPageConverter;
    }

    public WebPageDto getWebPage(Integer id) {
         WebPageEntity webPageEntity = webPageRepository.findWebPageById(id);
         WebPageDto webPageDto = webPageConverter.webPageConvert(webPageEntity);
        return webPageDto;
    }

   public List<WebPageDto> getAllWebPages(){
        List<WebPageEntity> webPageEntityList = webPageRepository.findAll();
        List<WebPageDto> webPageDtoList = webPageConverter.webPageDtoListConvert(webPageEntityList);
        return webPageDtoList;
   }

    public WebPageEntity save(WebPageDto webPageDto) {
        WebPageEntity webPageEntity = webPageConverter.webPageEntityConvert(webPageDto);
        return webPageRepository.save(webPageEntity);
    }

    public void delete(Integer id) {
        webPageRepository.deleteById(id);
    }

}
