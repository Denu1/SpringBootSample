package com.example.demo.customerService;

import com.example.demo.customerEntity.CustomerEntity;
import com.example.demo.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    public void createCustomer(CustomerEntity customerEntity){
        customerRepository.save(customerEntity);

    }

}
