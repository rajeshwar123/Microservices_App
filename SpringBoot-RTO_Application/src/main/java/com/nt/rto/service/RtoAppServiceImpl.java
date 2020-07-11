package com.nt.rto.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.nt.rto.entities.VehicleDetailsEntity;
import com.nt.rto.entities.VehicleOwnerAddressDetailsEntity;
import com.nt.rto.entities.VehicleOwnerDetailsEntity;
import com.nt.rto.entities.VehicleRegDetailsEntity;
import com.nt.rto.pojo.VehicleDetails;
import com.nt.rto.pojo.VehicleOwnerAddressDetails;
import com.nt.rto.pojo.VehicleOwnerDetails;
import com.nt.rto.pojo.VehicleRegDetails;
import com.nt.rto.repository.VehicleDetailsRepository;
import com.nt.rto.repository.VehicleOnrAddrsDetailsRepository;
import com.nt.rto.repository.VehicleOwnerDetailsRepository;
import com.nt.rto.repository.VehicleRegDetailsRepository;

import ch.qos.logback.core.net.SyslogOutputStream;


@Service
public class RtoAppServiceImpl implements RtoAppService {
	
	@Autowired
	VehicleOwnerDetailsRepository vhclOnrRepo;
	@Autowired
	VehicleDetailsRepository vhclDtlsRepo;
	@Autowired
	VehicleOnrAddrsDetailsRepository vhclOnrAdrsDtlsRepo;
	
	@Autowired
	VehicleRegDetailsRepository vhclRegDtlsRepo;
	
	@Autowired
	VehicleOwnerDetailsEntity onrDtlsEntity;
	
	
	@Override
	public int registerOnrDtls(VehicleOwnerDetails vhclOnrDtls) {
		//convert vhclOnrDtls to entity
		BeanUtils.copyProperties(vhclOnrDtls, onrDtlsEntity);
		VehicleOwnerDetailsEntity vhclEntity = vhclOnrRepo.save(onrDtlsEntity);
		//System.out.println(vhclEntity);
		return vhclEntity.getVehicleOwnerId();
	}
	@Override
	public VehicleDetailsEntity registerVehicleDtls(VehicleDetails vhclDtls) {
		VehicleDetailsEntity entity=new VehicleDetailsEntity();
		BeanUtils.copyProperties(vhclDtls, entity);	
		
		//entity.setVhclOnrDtls(vhclOnrDtls);
		//entity.setVhclOnrDtls());
		return  vhclDtlsRepo.save(entity);
	}

	@Override
	public VehicleOwnerAddressDetailsEntity  registerVehicleOnrAdrsDtls(VehicleOwnerAddressDetails vhclOnrAdrsDtls) {
		VehicleOwnerAddressDetailsEntity entity=new VehicleOwnerAddressDetailsEntity();
		BeanUtils.copyProperties(vhclOnrAdrsDtls, entity);
		//entity.setVhclOnrDtls(onrDtlsEntity);
		return vhclOnrAdrsDtlsRepo.save(entity);
	}
	
	@Override
	public VehicleRegDetailsEntity registerVehicleRegDetails(VehicleRegDetails vhclRgDtls) {
		VehicleRegDetailsEntity entity=new VehicleRegDetailsEntity();
		BeanUtils.copyProperties(vhclRgDtls, entity);
		//entity.setVhclOnrDtls(onrDtlsEntity);
		return vhclRegDtlsRepo.save(entity);
	}	
}