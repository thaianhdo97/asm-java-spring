package com.example.asmjavaspring.service;

import com.example.asmjavaspring.entity.Street;
import com.example.asmjavaspring.repository.StreetJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetService {
    @Autowired
    private StreetJpaRepository streetRepository;

    public List<Street> getListStreet() {
        return streetRepository.findAll();
    }

    public void createStreet(Street street) {
        streetRepository.save(street);
    }
}
