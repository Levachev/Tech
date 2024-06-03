package com.seroter.tech;

import com.seroter.tech.entity.model.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterUtil {

    public static List<AppliancesModel> filterSmartphone(List<AppliancesModel> starterList,
                                                   Map<String, String> parameters){
        String lowCameraNumber = parameters.get("low_camera_number");
        String highCameraNumber = parameters.get("high_camera_number");

        String lowMemory = parameters.get("low_memory");
        String highMemory = parameters.get("high_memory");

        return starterList.stream()
                .filter(model -> (lowCameraNumber==null || ((SmartphoneModel)model).getCameraNumber() >= Integer.parseInt(lowCameraNumber)))
                .filter(model -> (highCameraNumber==null || ((SmartphoneModel)model).getCameraNumber() <= Integer.parseInt(highCameraNumber)))
                .filter(model -> (lowMemory==null || ((SmartphoneModel)model).getMemory() >= Integer.parseInt(lowMemory)))
                .filter(model -> (highMemory==null || ((SmartphoneModel)model).getMemory() <= Integer.parseInt(highMemory)))
                .collect(Collectors.toList());
    }

    public static List<AppliancesModel> filterVacuumCleaner(List<AppliancesModel> starterList,
                                                      Map<String, String> parameters){
        String lowModeNumber = parameters.get("low_mode_number");
        String highModeNumber = parameters.get("high_mode_number");

        String lowDustContainerVolume = parameters.get("low_dust_container_volume");
        String highDustContainerVolume = parameters.get("high_dust_container_volume");

        return starterList.stream()
                .filter(model -> (lowDustContainerVolume==null || ((VacuumCleanerModel)model).getDustContainerVolume() >= Integer.parseInt(lowDustContainerVolume)))
                .filter(model -> (highDustContainerVolume==null || ((VacuumCleanerModel)model).getDustContainerVolume() <= Integer.parseInt(highDustContainerVolume)))
                .filter(model -> (lowModeNumber==null || ((VacuumCleanerModel)model).getModeNumber() >= Integer.parseInt(lowModeNumber)))
                .filter(model -> (highModeNumber==null || ((VacuumCleanerModel)model).getModeNumber() <= Integer.parseInt(highModeNumber)))
                .collect(Collectors.toList());
    }

    public static List<AppliancesModel> filterFridge(List<AppliancesModel> starterList,
                                               Map<String, String> parameters){
        String lowDoorNumber = parameters.get("low_door_number");
        String highDoorNumber = parameters.get("high_door_number");

        String compressorType = parameters.get("compressor_type");

        return starterList.stream()
                .filter(model -> (lowDoorNumber==null || ((FridgeModel)model).getDoorNumber() >= Integer.parseInt(lowDoorNumber)))
                .filter(model -> (highDoorNumber==null || ((FridgeModel)model).getDoorNumber() <= Integer.parseInt(highDoorNumber)))
                .filter(model -> (compressorType==null || ((FridgeModel)model).getCompressorType().equals(compressorType)))
                .collect(Collectors.toList());
    }

    public static List<AppliancesModel> filterComputer(List<AppliancesModel> starterList,
                                                 Map<String, String> parameters){
        String category = parameters.get("category");

        String processorType = parameters.get("processor_type");

        return starterList.stream()
                .filter(model -> (category==null || ((ComputerModel)model).getCategory().equals(category)))
                .filter(model -> (processorType==null || ((ComputerModel)model).getProcessorType().equals(processorType)))
                .collect(Collectors.toList());
    }

    public static List<AppliancesModel> filterTV(List<AppliancesModel> starterList,
                                           Map<String, String> parameters){
        String category = parameters.get("category");

        String technology = parameters.get("technology");

        return starterList.stream()
                .filter(model -> (category==null || ((TVModel)model).getCategory().equals(category)))
                .filter(model -> (technology==null || ((TVModel)model).getTechnology().equals(technology)))
                .collect(Collectors.toList());
    }
}
