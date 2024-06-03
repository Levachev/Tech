package com.seroter.tech.entity.model;

import com.seroter.tech.entity.Appliances;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "appliances_model")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public abstract class AppliancesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "size")
    private int size;

    @Column(name = "price")
    private int price;

    @Column(name = "is_have")
    private boolean isHave;

    @ManyToOne (optional=false, cascade=CascadeType.MERGE)
    @JoinColumn (name="appliances_id")
    private Appliances appliances;
}
