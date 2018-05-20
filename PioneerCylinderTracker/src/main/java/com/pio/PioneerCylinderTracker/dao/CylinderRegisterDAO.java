package com.pio.PioneerCylinderTracker.dao;

import java.util.Optional;

import com.pio.PioneerCylinderTracker.model.CylinderBean;

/**
 * This CylinderRegisterDAO.java interface is 
 *
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 */
public interface CylinderRegisterDAO {
	
	public String cylinderRegister(CylinderBean cylinder);

	public Optional<CylinderBean> checkCylinder(Long cylinderId);
}
