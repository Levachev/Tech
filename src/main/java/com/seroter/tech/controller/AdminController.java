package com.seroter.tech.controller;

import com.seroter.tech.entity.Appliances;
import com.seroter.tech.entity.model.*;
import com.seroter.tech.repository.AppliancesRepo;
import com.seroter.tech.repository.VendorRepo;
import com.seroter.tech.repository.model.*;
import com.seroter.tech.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appliances")
public class AdminController {

    private final AdminService service;

    @Autowired
    public AdminController(AdminService service) {
        this.service = service;
    }

    @PutMapping("/add/appliances")
    public void addAppliances(@RequestBody Appliances appliances, @RequestParam String vendorName){
        service.addAppliances(appliances, vendorName);
    }

    @PutMapping("/add/smartphone")
    public void addSmartphoneModel(@RequestBody SmartphoneModel smartphoneModel){
        service.addSmartphone(smartphoneModel);
    }

    @PutMapping("/add/fridge")
    public void addFridgeModel(@RequestBody FridgeModel fridgeModel){
        service.addFridge(fridgeModel);
    }

    @PutMapping("/add/computer")
    public void addComputerModel(@RequestBody ComputerModel computerModel){
        service.addComputer(computerModel);
    }

    @PutMapping("/add/vacuum_cleaner")
    public void addVacuumCleanerModel(@RequestBody VacuumCleanerModel vacuumCleanerModel1){
        service.addVacuumCleaner(vacuumCleanerModel1);
    }

    @PutMapping("/add/tv")
    public void addTVModel(@RequestBody TVModel tvModel){
        service.addTV(tvModel);
    }
}
