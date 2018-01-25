package com.bmw.cc.casa.bm.devicemanager.control;

import javax.enterprise.context.ApplicationScoped;

import com.bmw.cc.casa.bm.devicemanager.entity.DeviceBE;

/**
 *
 */
@ApplicationScoped // could also be a EJB
public class DeviceDAO {
    public DeviceBE findBy() {
        return new DeviceBE();
    }
}
