package com.seroter.tech.entity.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "tv_model")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class TVModel extends AppliancesModel{

    @Column(name = "category")
    private String category;

    @Column(name = "technology")
    private String technology;
}
