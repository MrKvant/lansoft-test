package com.kazachenko.lansoft.lansofttest.service;

import com.kazachenko.lansoft.lansofttest.persistence.model.CompanyEntity;
import com.kazachenko.lansoft.lansofttest.persistence.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity create(CompanyEntity companyEntity) {
        return companyRepository.save(companyEntity);
    }

    public void update(CompanyEntity companyEntity) {
        companyRepository.save(companyEntity);
    }

    public List<CompanyEntity> getAll() {
        return companyRepository.findAll();
    }

    public CompanyEntity getById(Integer id) {
        Optional<CompanyEntity> optionalCompany = companyRepository.findById(id);
        CompanyEntity companyEntity = optionalCompany.orElseGet(CompanyEntity::new);
        return companyEntity;
    }

    public void deleteById(Integer id) {
        companyRepository.deleteById(id);
    }
}
