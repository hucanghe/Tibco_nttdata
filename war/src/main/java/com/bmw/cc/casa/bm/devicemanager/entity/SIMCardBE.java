package com.bmw.cc.casa.bm.devicemanager.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class SIMCardBE {
    @EmbeddedId
    private IccidPK iccid;
    private boolean enabled;
}
