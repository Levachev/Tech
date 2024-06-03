package com.seroter.tech.repository.model;

import com.seroter.tech.entity.model.SmartphoneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartphoneModelRepo extends JpaRepository<SmartphoneModel, Long> {
}
