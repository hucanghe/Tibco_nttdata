package com.bmw.cc.casa.bm.devicemanager.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Table(name = "vehicle")
@Entity 
@Data @EqualsAndHashCode(of = "vin")
public class DeviceBE {

    @Id
    @EmbeddedId
    private Vin17PK vin;
    
    /**
     * This entitiy belongs to a different component, as so we arent't allowed to change it if we save the vehicle
     */
    @OneToOne(cascade = {}, fetch = FetchType.LAZY)
    private SIMCardBE sim;
}
