package com.example.demo.customerController;

import com.example.demo.customerEntity.CustomerEntity;
import com.example.demo.customerRepository.CustomerRepository;
import com.example.demo.customerService.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

     @Autowired
     CustomerService customerService;
    @PostMapping("/customer")
    public void createCustomer(@RequestBody CustomerEntity customerEntity){

        customerService.createCustomer(customerEntity);
        System.out.println("create customer55");
    }


}
