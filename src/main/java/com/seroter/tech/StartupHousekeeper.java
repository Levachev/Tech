package com.seroter.tech;

import com.seroter.tech.entity.Appliances;
import com.seroter.tech.entity.Vendor;
import com.seroter.tech.entity.model.*;
import com.seroter.tech.repository.AppliancesRepo;
import com.seroter.tech.repository.VendorRepo;
import com.seroter.tech.repository.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StartupHousekeeper implements ApplicationListener<ContextRefreshedEvent> {

    private final VendorRepo vendorRepo;
    private final AppliancesRepo appliancesRepo;
    private final TVModelRepo tvModelRepo;
    private final SmartphoneModelRepo smartphoneModelRepo;
    private final VacuumCleanerModelRepo vacuumCleanerModelRepo;
    private final FridgeModelRepo fridgeModelRepo;
    private final ComputerModelRepo computerModelRepo;
    private final AppliancesModelRepo appliancesModelRepo;

    @Autowired
    public StartupHousekeeper(VendorRepo vendorRepo, AppliancesRepo appliancesRepo, TVModelRepo tvModelRepo, SmartphoneModelRepo smartphoneModelRepo, VacuumCleanerModelRepo vacuumCleanerModelRepo, FridgeModelRepo fridgeModelRepo, ComputerModelRepo computerModelRepo, AppliancesModelRepo appliancesModelRepo) {
        this.vendorRepo = vendorRepo;
        this.appliancesRepo = appliancesRepo;
        this.tvModelRepo = tvModelRepo;
        this.smartphoneModelRepo = smartphoneModelRepo;
        this.vacuumCleanerModelRepo = vacuumCleanerModelRepo;
        this.fridgeModelRepo = fridgeModelRepo;
        this.computerModelRepo = computerModelRepo;
        this.appliancesModelRepo = appliancesModelRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        /*tvModelRepo.deleteAll();
        smartphoneModelRepo.deleteAll();
        vacuumCleanerModelRepo.deleteAll();
        fridgeModelRepo.deleteAll();
        computerModelRepo.deleteAll();

        appliancesModelRepo.deleteAll();

        appliancesRepo.deleteAll();

        vendorRepo.deleteAll();*/

        Vendor appleVendor = Vendor.builder()
                .name("apple").
                build();

        if (vendorRepo.findAll().isEmpty()) {
            vendorRepo.save(appleVendor);
        }

        Appliances smartphone = Appliances.builder().name("smartphone")
                .canInstallmentPlan(true)
                .canOrderOnline(true)
                .vendor(appleVendor)
                .build();

        Appliances tv = Appliances.builder().name("tv")
                .canInstallmentPlan(true)
                .canOrderOnline(true)
                .vendor(appleVendor)
                .build();

        Appliances vacuumCleaner = Appliances.builder().name("vacuumCleaner")
                .canInstallmentPlan(true)
                .canOrderOnline(true)
                .vendor(appleVendor)
                .build();

        Appliances fridge = Appliances.builder().name("fridge")
                .canInstallmentPlan(true)
                .canOrderOnline(true)
                .vendor(appleVendor)
                .build();

        Appliances computer = Appliances.builder().name("computer")
                .canInstallmentPlan(true)
                .canOrderOnline(true)
                .vendor(appleVendor)
                .build();

        if(appliancesRepo.findAll().isEmpty()){
            List<Appliances> appliancesList = new ArrayList<>();

            appliancesList.add(smartphone);
            appliancesList.add(tv);
            appliancesList.add(vacuumCleaner);
            appliancesList.add(fridge);
            appliancesList.add(computer);

            appliancesRepo.saveAll(appliancesList);
        }


        TVModel tvModel11 = TVModel.builder()
                .name("tv1")
                .serialNumber("111")
                .color("white")
                .size(1)
                .price(100001)
                .isHave(true)
                .category("category1")
                .technology("technology1")
                .appliances(tv)
                .build();

        TVModel tvModel21 = TVModel.builder()
                .name("tv2")
                .serialNumber("121")
                .color("white")
                .size(2)
                .price(200001)
                .isHave(true)
                .category("category2")
                .technology("technology2")
                .appliances(tv)
                .build();

        TVModel tvModel31 = TVModel.builder()
                .name("tv3")
                .serialNumber("131")
                .color("white")
                .size(3)
                .price(300001)
                .isHave(true)
                .category("category3")
                .technology("technology3")
                .appliances(tv)
                .build();

        TVModel tvModel12 = TVModel.builder()
                .name("tv1")
                .serialNumber("112")
                .color("white")
                .size(1)
                .price(100020)
                .isHave(true)
                .category("category1")
                .technology("technology1")
                .appliances(tv)
                .build();

        TVModel tvModel22 = TVModel.builder()
                .name("tv2")
                .serialNumber("122")
                .color("white")
                .size(2)
                .price(200023)
                .isHave(true)
                .category("category2")
                .technology("technology2")
                .appliances(tv)
                .build();

        TVModel tvModel32 = TVModel.builder()
                .name("tv3")
                .serialNumber("132")
                .color("white")
                .size(3)
                .price(300300)
                .isHave(true)
                .category("category3")
                .technology("technology3")
                .appliances(tv)
                .build();

        if(tvModelRepo.findAll().isEmpty()){
            List<TVModel> tvModels = new ArrayList<>();

            tvModels.add(tvModel11);
            tvModels.add(tvModel21);
            tvModels.add(tvModel31);
            tvModels.add(tvModel12);
            tvModels.add(tvModel22);
            tvModels.add(tvModel32);

            tvModelRepo.saveAll(tvModels);
        }

        SmartphoneModel smartphoneModel11 = SmartphoneModel.builder()
                .name("smartphone1")
                .serialNumber("211")
                .color("white")
                .size(3)
                .price(310000)
                .isHave(true)
                .cameraNumber(1)
                .memory(1)
                .appliances(smartphone)
                .build();

        SmartphoneModel smartphoneModel21 = SmartphoneModel.builder()
                .name("smartphone2")
                .serialNumber("221")
                .color("white")
                .size(3)
                .price(3220000)
                .isHave(true)
                .cameraNumber(1)
                .memory(1)
                .appliances(smartphone)
                .build();

        SmartphoneModel smartphoneModel31 = SmartphoneModel.builder()
                .name("smartphone3")
                .serialNumber("231")
                .color("white")
                .size(3)
                .price(300120)
                .isHave(true)
                .cameraNumber(1)
                .memory(1)
                .appliances(smartphone)
                .build();

        SmartphoneModel smartphoneModel12 = SmartphoneModel.builder()
                .name("smartphone12")
                .serialNumber("21")
                .color("white")
                .size(3)
                .price(300660)
                .isHave(true)
                .cameraNumber(1)
                .memory(1)
                .appliances(smartphone)
                .build();

        SmartphoneModel smartphoneModel22 = SmartphoneModel.builder()
                .name("smartphone2")
                .serialNumber("222")
                .color("white")
                .size(3)
                .price(31610)
                .isHave(true)
                .cameraNumber(1)
                .memory(1)
                .appliances(smartphone)
                .build();

        SmartphoneModel smartphoneModel32 = SmartphoneModel.builder()
                .name("smartphone3")
                .serialNumber("232")
                .color("white")
                .size(3)
                .price(309900)
                .isHave(true)
                .cameraNumber(1)
                .memory(1)
                .appliances(smartphone)
                .build();

        if(smartphoneModelRepo.findAll().isEmpty()){
            List<SmartphoneModel> smartphoneModels = new ArrayList<>();

            smartphoneModels.add(smartphoneModel11);
            smartphoneModels.add(smartphoneModel21);
            smartphoneModels.add(smartphoneModel31);
            smartphoneModels.add(smartphoneModel12);
            smartphoneModels.add(smartphoneModel22);
            smartphoneModels.add(smartphoneModel32);

            smartphoneModelRepo.saveAll(smartphoneModels);
        }

        VacuumCleanerModel vacuumCleanerModel11 = VacuumCleanerModel.builder()
                .name("vacuumCleaner1")
                .serialNumber("311")
                .color("white")
                .size(3)
                .price(300099)
                .isHave(true)
                .dustContainerVolume(1)
                .modeNumber(1)
                .appliances(vacuumCleaner)
                .build();

        VacuumCleanerModel vacuumCleanerModel21 = VacuumCleanerModel.builder()
                .name("vacuumCleaner2")
                .serialNumber("321")
                .color("white")
                .size(3)
                .price(300079)
                .isHave(true)
                .dustContainerVolume(1)
                .modeNumber(1)
                .appliances(vacuumCleaner)
                .build();

        VacuumCleanerModel vacuumCleanerModel31 = VacuumCleanerModel.builder()
                .name("vacuumCleaner3")
                .serialNumber("331")
                .color("white")
                .size(3)
                .price(3089900)
                .isHave(true)
                .dustContainerVolume(1)
                .modeNumber(1)
                .appliances(vacuumCleaner)
                .build();

        VacuumCleanerModel vacuumCleanerModel12 = VacuumCleanerModel.builder()
                .name("vacuumCleaner1")
                .serialNumber("312")
                .color("white")
                .size(3)
                .price(30005491)
                .isHave(true)
                .dustContainerVolume(1)
                .modeNumber(1)
                .appliances(vacuumCleaner)
                .build();

        VacuumCleanerModel vacuumCleanerModel22 = VacuumCleanerModel.builder()
                .name("vacuumCleaner2")
                .serialNumber("322")
                .color("white")
                .size(3)
                .price(3045600)
                .isHave(true)
                .dustContainerVolume(1)
                .modeNumber(1)
                .appliances(vacuumCleaner)
                .build();

        VacuumCleanerModel vacuumCleanerModel32 = VacuumCleanerModel.builder()
                .name("vacuumCleaner3")
                .serialNumber("332")
                .color("white")
                .size(3)
                .price(3000770)
                .isHave(true)
                .dustContainerVolume(1)
                .modeNumber(1)
                .appliances(vacuumCleaner)
                .build();

        if(vacuumCleanerModelRepo.findAll().isEmpty()){
            List<VacuumCleanerModel> vacuumCleanerModels = new ArrayList<>();

            vacuumCleanerModels.add(vacuumCleanerModel11);
            vacuumCleanerModels.add(vacuumCleanerModel21);
            vacuumCleanerModels.add(vacuumCleanerModel31);
            vacuumCleanerModels.add(vacuumCleanerModel12);
            vacuumCleanerModels.add(vacuumCleanerModel22);
            vacuumCleanerModels.add(vacuumCleanerModel32);

            vacuumCleanerModelRepo.saveAll(vacuumCleanerModels);
        }

        FridgeModel fridgeModel11 = FridgeModel.builder()
                .name("fridgeModel1")
                .serialNumber("411")
                .color("white")
                .size(3)
                .price(301200)
                .isHave(true)
                .compressorType("1")
                .doorNumber(1)
                .appliances(fridge)
                .build();

        FridgeModel fridgeModel21 = FridgeModel.builder()
                .name("fridgeModel2")
                .serialNumber("421")
                .color("white")
                .size(3)
                .price(1230000)
                .isHave(true)
                .compressorType("1")
                .doorNumber(1)
                .appliances(fridge)
                .build();

        FridgeModel fridgeModel31 = FridgeModel.builder()
                .name("fridgeModel3")
                .serialNumber("431")
                .color("white")
                .size(3)
                .price(3300000)
                .isHave(true)
                .compressorType("1")
                .doorNumber(1)
                .appliances(fridge)
                .build();

        FridgeModel fridgeModel12 = FridgeModel.builder()
                .name("fridgeModel1")
                .serialNumber("412")
                .color("white")
                .size(3)
                .price(55300000)
                .isHave(true)
                .compressorType("1")
                .doorNumber(1)
                .appliances(fridge)
                .build();

        FridgeModel fridgeModel22 = FridgeModel.builder()
                .name("fridgeModel2")
                .serialNumber("422")
                .color("white")
                .size(3)
                .price(30000055)
                .isHave(true)
                .compressorType("1")
                .doorNumber(1)
                .appliances(fridge)
                .build();

        FridgeModel fridgeModel32 = FridgeModel.builder()
                .name("fridgeModel3")
                .serialNumber("432")
                .color("white")
                .size(3)
                .price(33424320)
                .isHave(true)
                .compressorType("1")
                .doorNumber(1)
                .appliances(fridge)
                .build();

        if(fridgeModelRepo.findAll().isEmpty()){
            List<FridgeModel> fridgeModels = new ArrayList<>();

            fridgeModels.add(fridgeModel11);
            fridgeModels.add(fridgeModel21);
            fridgeModels.add(fridgeModel31);
            fridgeModels.add(fridgeModel12);
            fridgeModels.add(fridgeModel22);
            fridgeModels.add(fridgeModel32);

            fridgeModelRepo.saveAll(fridgeModels);
        }

        ComputerModel computerModel11 = ComputerModel.builder()
                .name("computerModel1")
                .serialNumber("511")
                .color("white")
                .size(3)
                .price(30234000)
                .isHave(true)
                .processorType("1")
                .category("1")
                .appliances(computer)
                .build();

        ComputerModel computerModel21 = ComputerModel.builder()
                .name("computerModel2")
                .serialNumber("521")
                .color("white")
                .size(3)
                .price(34444400)
                .isHave(true)
                .processorType("1")
                .category("1")
                .appliances(computer)
                .build();

        ComputerModel computerModel31 = ComputerModel.builder()
                .name("computerModel3")
                .serialNumber("531")
                .color("white")
                .size(3)
                .price(30024547)
                .isHave(true)
                .processorType("1")
                .category("1")
                .appliances(computer)
                .build();

        ComputerModel computerModel12 = ComputerModel.builder()
                .name("computerModel1")
                .serialNumber("512")
                .color("white")
                .size(3)
                .price(304566000)
                .isHave(true)
                .processorType("1")
                .category("1")
                .appliances(computer)
                .build();

        ComputerModel computerModel22 = ComputerModel.builder()
                .name("computerModel2")
                .serialNumber("522")
                .color("white")
                .size(3)
                .price(3065300)
                .isHave(true)
                .processorType("1")
                .category("1")
                .appliances(computer)
                .build();

        ComputerModel computerModel32 = ComputerModel.builder()
                .name("computerModel3")
                .serialNumber("532")
                .color("white")
                .size(3)
                .price(123313)
                .isHave(true)
                .processorType("1")
                .category("1")
                .appliances(computer)
                .build();

        if(computerModelRepo.findAll().isEmpty()){
            List<ComputerModel> computerModels = new ArrayList<>();

            computerModels.add(computerModel11);
            computerModels.add(computerModel21);
            computerModels.add(computerModel31);
            computerModels.add(computerModel12);
            computerModels.add(computerModel22);
            computerModels.add(computerModel32);

            computerModelRepo.saveAll(computerModels);
        }
    }
}
