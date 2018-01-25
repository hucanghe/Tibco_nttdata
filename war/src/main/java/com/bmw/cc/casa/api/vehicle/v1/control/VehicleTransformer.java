package com.bmw.cc.casa.api.vehicle.v1.control;

import com.bmw.cc.casa.api.vehicle.v1.entity.Vehicle;
import com.bmw.cc.casa.bm.devicemanager.entity.DeviceBE;

public class VehicleTransformer {

	public Vehicle mapVehicle(DeviceBE vehicle) {
		return new Vehicle();
	}
	public DeviceBE mapVehicle(Vehicle vehicle) {
		return new DeviceBE();
	}
}
