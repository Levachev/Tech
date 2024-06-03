package com.seroter.tech.entity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "smartphone_model")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class SmartphoneModel extends AppliancesModel{

    @Column(name = "memory")
    private double memory;

    @Column(name = "camera_number")
    private int cameraNumber;


    @Override
    public String toString(){
        return cameraNumber+" "+
                memory+" "+
                getName()+" "+getSerialNumber();
    }
}
