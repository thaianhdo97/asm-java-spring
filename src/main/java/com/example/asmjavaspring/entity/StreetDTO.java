package com.example.asmjavaspring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StreetDTO {
    private String name;
    private String establish;
    private String description;
    private String status;
    private String information;

    public StreetDTO(Street street) {
        this.name = street.getName();
        this.establish = street.getEstablish();
        this.description = street.getDescription();
        this.status = street.getStatusString();
        this.information = street.getDistrict().getInformation();
    }
}
