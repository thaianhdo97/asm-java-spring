package com.example.asmjavaspring.controller;

import com.example.asmjavaspring.entity.District;
import com.example.asmjavaspring.entity.Street;
import com.example.asmjavaspring.entity.StreetDTO;
import com.example.asmjavaspring.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class StreetController {

    @Autowired
    private StreetService streetService;

    @RequestMapping(method = RequestMethod.GET, value = "/api/listStreet")
    public List<Street> getListStreet(@RequestParam(required = false, defaultValue = "1") int page,
                                      @RequestParam(required = false, defaultValue = "10") int limit) {
        return streetService.getListStreet();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/api/createStreet")
    public StreetDTO createStreet(@RequestBody Street street) {
        streetService.createStreet(street);
        return new StreetDTO(street);
    }
}
