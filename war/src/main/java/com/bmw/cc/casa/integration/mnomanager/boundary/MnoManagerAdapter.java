package com.bmw.cc.casa.integration.mnomanager.boundary;

import javax.ejb.Stateless;

import com.bmw.cc.casa.bm.devicemanager.entity.SIMCardBE;

/**
 * Connector class, responsible to connect to the MNO manager and transform our model class objects to the MNO Manager ones.
 */
@Stateless
public class MnoManagerAdapter {

    public void disable(SIMCardBE sim) {
        // transform to MNO command
        
        // send MNO command
    }

}
