package com.nt.rto.service;

import com.nt.rto.entities.VehicleDetailsEntity;
import com.nt.rto.entities.VehicleOwnerAddressDetailsEntity;
import com.nt.rto.entities.VehicleRegDetailsEntity;
import com.nt.rto.pojo.VehicleDetails;
import com.nt.rto.pojo.VehicleOwnerAddressDetails;
import com.nt.rto.pojo.VehicleOwnerDetails;
import com.nt.rto.pojo.VehicleRegDetails;

public interface RtoAppService {
	int registerOnrDtls(VehicleOwnerDetails entity);
	VehicleDetailsEntity registerVehicleDtls(VehicleDetails entity);
	VehicleOwnerAddressDetailsEntity registerVehicleOnrAdrsDtls(VehicleOwnerAddressDetails entity);
	VehicleRegDetailsEntity registerVehicleRegDetails(VehicleRegDetails entity);
}
