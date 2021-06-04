package com.example.asmjavaspring.controller;

import com.example.asmjavaspring.entity.District;
import com.example.asmjavaspring.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @RequestMapping(method = RequestMethod.GET, value = "/api/listDistrict")
    public List<District> getListDistrict(@RequestParam(required = false, defaultValue = "1") int page,
                                          @RequestParam(required = false, defaultValue = "10") int limit) {
        return districtService.getListDistrict();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/createDistrict")
    public District createDistrict(@RequestBody District district){
        districtService.createDistrict(district);
        return district;
    }
}
