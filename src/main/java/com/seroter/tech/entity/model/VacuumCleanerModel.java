package com.seroter.tech.entity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "vacuum_cleaner_model")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class VacuumCleanerModel extends AppliancesModel{

    @Column(name = "dust_container_volume")
    private double dustContainerVolume;

    @Column(name = "mode_number")
    private int modeNumber;

}
