/*
 * This project is Licensed under Apache 2.0 
 * and it is intended for reference only.
 * Do not copy or sell without owners' permission.
 *
 * Copyright © 2018 by Shaikh Nizamuddin. All Rights Reserved.
 * 
 */
package com.pio.PioneerCylinderTracker.vo;

import java.util.List;
import java.util.Optional;

import com.pio.PioneerCylinderTracker.model.CylinderBean;
import com.pio.PioneerCylinderTracker.model.CylinderTxnBean;
import com.pio.PioneerCylinderTracker.model.ElementTypeBean;

import lombok.Data;

/**
 * CylinderDetailsVO.java is used to 
 * 
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 *
 * Since   : May 23, 2018
 *
 */
@Data
public class CylinderDetailsVO {

	/**
	 * 
	 */
	public CylinderDetailsVO(Optional<CylinderBean> cb, List<CylinderTxnBean> ctb, ElementTypeBean etb) {
		setCylinderId(cb.get().getCylinderId());
		setCylinderType(etb.getElementName());
		setCtb(ctb);
		
	}
	
	private Long cylinderId;
	private String cylinderType;
	private List<CylinderTxnBean> ctb;

}
