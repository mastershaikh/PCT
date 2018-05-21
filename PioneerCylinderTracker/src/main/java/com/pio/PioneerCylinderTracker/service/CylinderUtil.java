package com.pio.PioneerCylinderTracker.service;

import java.util.List;

import com.pio.PioneerCylinderTracker.model.CylinderTxnBean;

/**
 * This CylinderUtil.java class is 
 *
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 */
public interface CylinderUtil {
	

	public List<CylinderTxnBean> findCylinder(Long cylinderId);
	
	public Double getCylinderCapacity(Long cylinderId);

	public String getCylinderType(Long cylinderId);

	public String getUsageAndType(Long cylinderId);
}
