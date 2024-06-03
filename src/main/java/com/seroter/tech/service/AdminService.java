package com.seroter.tech.service;

import com.seroter.tech.entity.Appliances;
import com.seroter.tech.entity.model.*;
import com.seroter.tech.repository.AppliancesRepo;
import com.seroter.tech.repository.VendorRepo;
import com.seroter.tech.repository.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AppliancesRepo appliancesRepo;
    private final SmartphoneModelRepo smartphoneModelRepo;
    private final ComputerModelRepo computerModelRepo;
    private final VacuumCleanerModelRepo vacuumCleanerModelRepo;
    private final FridgeModelRepo fridgeModelRepo;
    private final TVModelRepo tvModelRepo;
    private final VendorRepo vendorRepo;

    @Autowired
    public AdminService(AppliancesRepo appliancesRepo, VendorRepo vendorRepo,
                           SmartphoneModelRepo smartphoneModelRepo, ComputerModelRepo computerModelRepo,
                           VacuumCleanerModelRepo vacuumCleanerModelRepo, TVModelRepo tvModelRepo,
                           FridgeModelRepo fridgeModelRepo) {
        this.appliancesRepo = appliancesRepo;
        this.smartphoneModelRepo = smartphoneModelRepo;
        this.vacuumCleanerModelRepo = vacuumCleanerModelRepo;
        this.fridgeModelRepo = fridgeModelRepo;
        this.tvModelRepo = tvModelRepo;
        this.computerModelRepo = computerModelRepo;
        this.vendorRepo = vendorRepo;
    }

    public void addAppliances(Appliances appliances, String vendorName){
        appliances.setVendor(vendorRepo.findByName(vendorName).get(0));
        appliancesRepo.save(appliances);
    }

    public void addSmartphone(SmartphoneModel model){
        model.setAppliances(appliancesRepo.findByName("smartphone").get(0));
        smartphoneModelRepo.save(model);
    }

    public void addFridge(FridgeModel model){
        model.setAppliances(appliancesRepo.findByName("fridge").get(0));
        fridgeModelRepo.save(model);
    }

    public void addComputer(ComputerModel model){
        model.setAppliances(appliancesRepo.findByName("computer").get(0));
        computerModelRepo.save(model);
    }

    public void addVacuumCleaner(VacuumCleanerModel model){
        model.setAppliances(appliancesRepo.findByName("vacuumCleaner").get(0));
        vacuumCleanerModelRepo.save(model);
    }

    public void addTV(TVModel model){
        model.setAppliances(appliancesRepo.findByName("tv").get(0));
        tvModelRepo.save(model);
    }
}
