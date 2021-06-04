package com.example.asmjavaspring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Street {
    @Id
    private String name;
    private long establish;
    private String description;
    private int status; //1. using, 0. under construction, -1. under repair

    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;

    public String getStatusString() {
        return this.getStatus() == 1 ? "Using" : (this.getStatus() == 0 ? "Under construction" : "Under repair");
    }
}
