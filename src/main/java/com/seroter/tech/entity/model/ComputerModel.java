package com.seroter.tech.entity.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "computer_model")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class ComputerModel extends AppliancesModel{

    @Column(name = "category")
    private String category;

    @Column(name = "processor_type")
    private String processorType;

}
