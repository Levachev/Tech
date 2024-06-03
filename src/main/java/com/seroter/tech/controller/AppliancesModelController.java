package com.seroter.tech.controller;

import com.seroter.tech.entity.model.*;
import com.seroter.tech.service.AppliancesModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/models")
public class AppliancesModelController {
    private final AppliancesModelService service;

    @Autowired
    public AppliancesModelController(AppliancesModelService service){
        this.service = service;
    }

    @GetMapping("/get")
    public Object getAll(@RequestParam Map<String, String> parameters){
        return service.getAll(parameters);
    }

    @GetMapping("/sort/price")
    public List<AppliancesModel> getSortedByPrice(){
        return service.getSortedByPrice();
    }

    @GetMapping("/sort/alphabet")
    public List<AppliancesModel> getSortedByAlphabet(){
        return service.getSortedByAlphabet();
    }
}
