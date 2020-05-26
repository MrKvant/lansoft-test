package com.kazachenko.lansoft.lansofttest.persistence.repository;

import com.kazachenko.lansoft.lansofttest.persistence.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
    List<CustomerEntity> getAllByNameContains(String name);
    List<CustomerEntity> getAllByCompanyCompanyNameContains(String name);
}
