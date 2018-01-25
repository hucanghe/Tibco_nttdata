package com.bmw.cc.casa.bm.devicemanager.control;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.bmw.cc.casa.bm.devicemanager.control.DeviceDAO;
import com.bmw.cc.casa.bm.devicemanager.entity.DeviceBE;
import com.bmw.cc.casa.bm.devicemanager.entity.Vin17PK;

@ApplicationScoped
public class CreateDevice {

    @Inject
    private DeviceDAO deviceDAO;

    @Inject
    private DeviceDAO vehicleDAO;

    public DeviceBE findBy(Vin17PK vin17) {
        return vehicleDAO.findBy();
    }

    public DeviceBE reset(Vin17PK vin17) {
        return null;
    }
}
