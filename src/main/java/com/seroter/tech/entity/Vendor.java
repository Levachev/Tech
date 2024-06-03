package com.seroter.tech.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vendor")
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="vendor", fetch= FetchType.LAZY)
    @JsonIgnore
    private List<Appliances> appliances;
}
