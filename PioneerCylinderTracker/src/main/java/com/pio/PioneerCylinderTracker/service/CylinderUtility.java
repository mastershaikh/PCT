package com.pio.PioneerCylinderTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	@Autowired
	public CylinderUtility() {
		
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
