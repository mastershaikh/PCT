package com.pio.PioneerCylinderTracker.service;

import java.util.List;
import java.util.Optional;

import com.pio.PioneerCylinderTracker.model.CylinderBean;
import com.pio.PioneerCylinderTracker.model.CylinderTxnBean;

/**
 * This CylinderUtil.java class is 
 *
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 */
public interface CylinderUtil {
	
	public String register(CylinderBean cylinder);

	public List<CylinderTxnBean> findCylinder(Long cylinderId);
	
	public Double getCylinderCapacity(Long cylinderId);

	public Optional<CylinderBean> checkCylinder(Long cylinderId);

	public String getCylinderType(Long cylinderId);

	public String getUsageAndType(Long cylinderId);
}
