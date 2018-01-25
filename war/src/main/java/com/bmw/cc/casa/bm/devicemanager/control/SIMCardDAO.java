package com.bmw.cc.casa.bm.devicemanager.control;

import javax.enterprise.context.ApplicationScoped;

import com.bmw.cc.casa.bm.devicemanager.entity.SIMCardBE;

@ApplicationScoped
public class SIMCardDAO {

    public SIMCardBE save(SIMCardBE sim) {
        return sim;
    }
}
