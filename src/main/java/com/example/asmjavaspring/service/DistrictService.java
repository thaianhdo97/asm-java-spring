package com.example.asmjavaspring.service;

import com.example.asmjavaspring.entity.District;
import com.example.asmjavaspring.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;

    public List<District> getListDistrict() {
        return districtRepository.findAll();
    }

    public void createDistrict(District district) {
        districtRepository.save(district);
    }
}
