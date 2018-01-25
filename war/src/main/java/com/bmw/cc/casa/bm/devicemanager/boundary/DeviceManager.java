package com.bmw.cc.casa.bm.devicemanager.boundary;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.bmw.cc.casa.bm.devicemanager.control.CreateDevice;
import com.bmw.cc.casa.bm.devicemanager.control.ManageSIMCard;
import com.bmw.cc.casa.bm.devicemanager.entity.DeviceBE;
import com.bmw.cc.casa.bm.devicemanager.entity.SIMCardBE;
import com.bmw.cc.casa.bm.devicemanager.entity.Vin17PK;

/**
 * Entry point to access SIMCardBE and manipualte them, works only with BEs.
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class DeviceManager {
    @Inject
    private CreateDevice deviceBA;
    @Inject
    private ManageSIMCard simCardBA;

    @RolesAllowed("SUPPORT") // authorization check
    public DeviceBE resetDevice(Vin17PK vin17) {
        return deviceBA.reset(vin17);
    }

    public DeviceBE getDevice(Vin17PK vin17) {
        return deviceBA.findBy(vin17);
    }

    public SIMCardBE disableSim(SIMCardBE simCard) {
        return simCardBA.disableSim(simCard);
    }
}
