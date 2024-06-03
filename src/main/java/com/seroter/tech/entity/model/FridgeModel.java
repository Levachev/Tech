package com.seroter.tech.entity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "fridge_model")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class FridgeModel extends AppliancesModel{
    @Column(name = "door_number")
    private int doorNumber;

    @Column(name = "compressor_type")
    private String compressorType;

}
