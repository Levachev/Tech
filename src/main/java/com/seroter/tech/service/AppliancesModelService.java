package com.seroter.tech.service;

import com.seroter.tech.FilterUtil;
import com.seroter.tech.entity.model.AppliancesModel;
import com.seroter.tech.repository.model.AppliancesModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AppliancesModelService {
    private final AppliancesModelRepo appliancesModelRepo;

    @Autowired
    public AppliancesModelService(AppliancesModelRepo repo){
        this.appliancesModelRepo = repo;
    }

    public Object getAll(Map<String, String> parameters){
        String name = parameters.get("name");
        if(name == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        List<AppliancesModel> models = appliancesModelRepo.findByNameFree(name);

        String applianceName = parameters.get("appliance_name");
        String color = parameters.get("color");
        String lowPrice = parameters.get("low_price");
        String highPrice = parameters.get("high_price");

        List<AppliancesModel> filtredList = models.stream()
                .filter(model -> (applianceName==null || model.getAppliances().getName().equals(applianceName)))
                .filter(model -> (color==null || model.getColor().equals(color)))
                .filter(model -> (lowPrice==null || model.getPrice() >= Integer.parseInt(lowPrice)))
                .filter(model -> (highPrice==null || model.getPrice() <= Integer.parseInt(highPrice)))
                .collect(Collectors.toList());

        if(applianceName != null){
            switch (applianceName){
                case "smartphone":
                    return FilterUtil.filterSmartphone(filtredList, parameters);
                case "tv":
                    return FilterUtil.filterTV(filtredList, parameters);
                case "fridge":
                    return FilterUtil.filterFridge(filtredList, parameters);
                case "vacuumCleaner":
                    return FilterUtil.filterVacuumCleaner(filtredList, parameters);
                case "computer":
                    return FilterUtil.filterComputer(filtredList, parameters);
            }
        }

        return filtredList;
    }

    public List<AppliancesModel> getSortedByPrice(){
        return appliancesModelRepo.findAllByOrderByPriceAsc();
    }

    public List<AppliancesModel> getSortedByAlphabet(){
        return appliancesModelRepo.findAllByOrderByNameAsc();
    }
}
