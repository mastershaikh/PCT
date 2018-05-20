package com.pio.PioneerCylinderTracker.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pio.PioneerCylinderTracker.dao.CylinderDetailsTab;
import com.pio.PioneerCylinderTracker.dao.CylinderRegisterDAO;
import com.pio.PioneerCylinderTracker.model.CylinderBean;
import com.pio.PioneerCylinderTracker.model.CylinderTxnBean;

/**
 * This CylinderUtility.java class is 
 *
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 */

@Service
public class CylinderUtility implements CylinderUtil{

	private CylinderRegisterDAO cylinderDAO;
	
	private CylinderDetailsTab cdtDAO;
	
	@Autowired
	public CylinderUtility(CylinderRegisterDAO cylinderDAO,CylinderDetailsTab cdtDAO) {
		this.cylinderDAO = cylinderDAO;
		this.cdtDAO = cdtDAO;
	}
	
	@Override
	public String register(CylinderBean cylinder) {
		Timestamp time = Timestamp.valueOf(LocalDateTime.now());
		cylinder.setLastModifiedDate(time);		
		cylinder.setUsageStatus("0");
		return cylinderDAO.cylinderRegister(cylinder);
	}

	@Override
	public List<CylinderTxnBean> findCylinder(Long cylinderId) {
		//This findCylinder method
		return null;
	}

	@Override
	public Double getCylinderCapacity(Long cylinderId) {
		//This getCylinderCapacity method
		return null;
	}

	@Override
	public Optional<CylinderBean> checkCylinder(Long cylinderId) {
		return cylinderDAO.checkCylinder(cylinderId);
		
	}

	@Override
	public String getCylinderType(Long cylinderId) {
		//This getCylinderType method
		return null;
	}

	@Override
	public String getUsageAndType(Long cylinderId) {
		//This getUsageAndType method
		return null;
	}
	
	
}
