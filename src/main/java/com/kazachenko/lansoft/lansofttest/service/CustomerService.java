package com.kazachenko.lansoft.lansofttest.service;

import com.kazachenko.lansoft.lansofttest.persistence.model.CustomerEntity;
import com.kazachenko.lansoft.lansofttest.persistence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerEntity create(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }

    public void update(CustomerEntity customerEntity) {
        customerRepository.save(customerEntity);
    }

    public List<CustomerEntity> getAll() {
        return customerRepository.findAll();
    }

    public CustomerEntity getById(Integer id) {
        Optional<CustomerEntity> optionalCustomer = customerRepository.findById(id);
        CustomerEntity customerEntity = optionalCustomer.orElseGet(CustomerEntity::new);
        return customerEntity;
    }

    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    public List<CustomerEntity> getAllByName(String name) {
        return customerRepository.getAllByNameContains(name);
    }

    public List<CustomerEntity> getByCompanyName(String companyName) {
        return customerRepository.getAllByCompanyCompanyNameContains(companyName);
    }
}
