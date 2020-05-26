package com.kazachenko.lansoft.lansofttest.controller;

import com.google.common.base.Preconditions;
import com.kazachenko.lansoft.lansofttest.persistence.model.CustomerEntity;
import com.kazachenko.lansoft.lansofttest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    List<CustomerEntity> getAll() {
        List<CustomerEntity> customers = customerService.getAll();
        return customers;
    }

    @GetMapping(value = "/id={id}")
    public CustomerEntity findById(@PathVariable("id") Integer id) {
        return customerService.getById(id);
    }

    @GetMapping(value = "/name={name}")
    public List<CustomerEntity> findByName(@PathVariable("name") String name) {
        return customerService.getAllByName(name);
    }

    @GetMapping(value = "/company_name={companyName}")
    public List<CustomerEntity> findByCompanyName(@PathVariable("companyName") String companyName) {
        return customerService.getByCompanyName(companyName);
    }

    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerEntity create(@RequestBody CustomerEntity resource) {
        Preconditions.checkNotNull(resource);
        return customerService.create(resource);
    }

    @PutMapping(value = "/update/id={id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") Integer id, @RequestBody CustomerEntity resource) {
        Preconditions.checkNotNull(resource);
        Preconditions.checkNotNull(customerService.getById(resource.getId()));
        customerService.update(resource);
    }

    @DeleteMapping(value = "/delete/id={id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id) {
        customerService.deleteById(id);
    }
}
