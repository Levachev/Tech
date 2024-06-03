package com.seroter.tech.repository;

import com.seroter.tech.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendorRepo extends JpaRepository<Vendor, Long> {
    List<Vendor> findByName(String name);
}
