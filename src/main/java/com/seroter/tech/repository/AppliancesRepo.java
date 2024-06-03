package com.seroter.tech.repository;

import com.seroter.tech.entity.Appliances;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppliancesRepo extends JpaRepository<Appliances, Long> {
    List<Appliances> findByName(String name);
}
