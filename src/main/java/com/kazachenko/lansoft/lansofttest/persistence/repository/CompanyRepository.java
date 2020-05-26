package com.kazachenko.lansoft.lansofttest.persistence.repository;

import com.kazachenko.lansoft.lansofttest.persistence.model.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {

}
