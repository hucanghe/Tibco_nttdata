package com.bmw.cc.casa.api.vehicle.v1.entity;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
public class Vehicle {
    @Valid
    private Vin17 vin;
    @NotNull
    private String model;
}
