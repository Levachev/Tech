package com.seroter.tech.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.seroter.tech.entity.model.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "appliances")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Appliances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne (optional=false, cascade=CascadeType.MERGE)
    @JoinColumn (name="vendor_id")
    private Vendor vendor;

    @Column(name = "can_order_online")
    private boolean canOrderOnline;

    @Column(name = "can_installment_plan")
    private boolean canInstallmentPlan;

    @OneToMany(mappedBy="appliances", fetch= FetchType.LAZY)
    @JsonIgnore
    private List<AppliancesModel> appliancesModels;

//    @OneToMany(mappedBy="appliances", fetch= FetchType.LAZY)
//    private List<TVModel> tvModels;
//
//    @OneToMany(mappedBy="appliances", fetch= FetchType.LAZY)
//    private List<VacuumCleanerModel> vacuumCleanerModels;
//
//    @OneToMany(mappedBy="appliances", fetch= FetchType.LAZY)
//    private List<FridgeModel> fridgeModels;
//
//    @OneToMany(mappedBy="appliances", fetch= FetchType.LAZY)
//    private List<SmartphoneModel> smartphoneModels;
//
//    @OneToMany(mappedBy="appliances", fetch= FetchType.LAZY)
//    private List<ComputerModel> computerModels;
}
