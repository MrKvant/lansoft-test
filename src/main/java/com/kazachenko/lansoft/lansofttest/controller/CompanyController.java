package com.kazachenko.lansoft.lansofttest.controller;

import com.google.common.base.Preconditions;
import com.kazachenko.lansoft.lansofttest.persistence.model.CompanyEntity;
import com.kazachenko.lansoft.lansofttest.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    List<CompanyEntity> getAll() {
        List<CompanyEntity> companies = companyService.getAll();
        return companies;
    }

    @GetMapping(value = "/id={id}")
    public CompanyEntity findById(@PathVariable("id") Integer id) {
        return companyService.getById(id);
    }

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public CompanyEntity create(@RequestBody CompanyEntity resource) {
        Preconditions.checkNotNull(resource);
        return companyService.create(resource);
    }

    @PutMapping(value = "/update/id={id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") Integer id, @RequestBody CompanyEntity resource) {
        Preconditions.checkNotNull(resource);
        Preconditions.checkNotNull(companyService.getById(resource.getId()));
        companyService.update(resource);
    }

    @DeleteMapping(value = "/delete/id={id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id) {
        companyService.deleteById(id);
    }

}
