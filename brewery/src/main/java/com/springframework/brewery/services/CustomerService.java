package com.springframework.brewery.services;

import com.springframework.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
