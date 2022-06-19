package com.EnergyAdvice.WebPagesList.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.EnergyAdvice.WebPagesList.models.dto.WebPageDto;
import com.EnergyAdvice.WebPagesList.services.WebPageService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class WebPageController {

    @Autowired
    private WebPageService webPageService;

    @Autowired
    public WebPageController(WebPageService webPageService) {
        this.webPageService = webPageService;
    }

    @GetMapping("/webpages")
    public List<WebPageDto> webPageControl() {
        return webPageService.getAllWebPages();
    }
    @RequestMapping("webpages/{id}")
    public WebPageDto getWebPage(@PathVariable(value="id") Integer id) {
        return webPageService.getWebPage(id);
    }

    @PostMapping("/add")
    public String addWebPage(@RequestBody WebPageDto webPageDto) {
       // WebPageDto webPageDto = new WebPageDto(title, url, logo);
        webPageService.save(webPageDto);
        return "Added new web page to repo!";
    }
}
