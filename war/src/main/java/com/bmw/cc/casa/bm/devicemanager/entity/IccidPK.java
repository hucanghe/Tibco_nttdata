package com.bmw.cc.casa.bm.devicemanager.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class IccidPK implements Serializable {
    private String iccid;
}
