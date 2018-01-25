package com.bmw.cc.casa.api.vehicle.v1.boundary;

import com.bmw.cc.casa.api.vehicle.v1.control.VehicleTransformer;
import com.bmw.cc.casa.api.vehicle.v1.entity.Vehicle;
import com.bmw.cc.casa.bm.devicemanager.boundary.DeviceManager;
import com.bmw.cc.casa.bm.devicemanager.entity.DeviceBE;
import com.bmw.cc.casa.bm.devicemanager.entity.Vin17PK;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Interface for the vehicle service.
 */
@Path("/vehicle")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class VehicleResource {

	@Inject
	private DeviceManager deviceManager;

	@Inject
	VehicleTransformer transformer;

	@GET
	@Path("/{vin}")
	public Response get(@PathParam("vin") String vin) {
		DeviceBE deviceBE = deviceManager.getDevice(new Vin17PK(vin));
		Vehicle vehicle = transformer.mapVehicle(deviceBE);
		return Response.ok().entity(vehicle).build();
	}
}
