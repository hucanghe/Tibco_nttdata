package com.bmw.cc.casa.bm.devicemanager.control;

import com.bmw.cc.casa.bm.devicemanager.entity.SIMCardBE;
import com.bmw.cc.casa.integration.mnomanager.boundary.MnoManagerAdapter;

import javax.inject.Inject;

/**
 * Created by BEN on 30.11.2017.
 */
public class ManageSIMCard {
    @Inject
    private MnoManagerAdapter mnoManagerESI;
    @Inject
    private SIMCardDAO simDao;

    public SIMCardBE disableSim(SIMCardBE sim) {
        mnoManagerESI.disable(sim);
        sim.setEnabled(false);
        return simDao.save(sim);
    }
}
