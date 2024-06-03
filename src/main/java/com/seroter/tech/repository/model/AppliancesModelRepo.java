package com.seroter.tech.repository.model;

import com.seroter.tech.entity.model.AppliancesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppliancesModelRepo extends JpaRepository<AppliancesModel, Long> {

    @Query("select u from AppliancesModel u where lower(u.name) like lower(concat('%', ?1,'%'))")
    List<AppliancesModel> findByNameFree(String name);

    List<AppliancesModel> findAllByOrderByPriceAsc();

    List<AppliancesModel> findAllByOrderByNameAsc();
}
