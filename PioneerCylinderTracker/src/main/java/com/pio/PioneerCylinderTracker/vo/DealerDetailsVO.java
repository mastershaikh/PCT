/*
 * This project is Licensed under Apache 2.0 
 * and it is intended for reference only.
 * Do not copy or sell without owners' permission.
 *
 * Copyright © 2018 by Shaikh Nizamuddin. All Rights Reserved.
 * 
 */
package com.pio.PioneerCylinderTracker.vo;

import java.sql.Timestamp;

import com.pio.PioneerCylinderTracker.model.DealerDetailsBean;
import com.pio.PioneerCylinderTracker.model.RateBean;

import lombok.Data;

/**
 * DealerDetailsVO.java is used to 
 * 
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 *
 * Since   : May 23, 2018
 *
 */
@Data
public class DealerDetailsVO {
	
	public DealerDetailsVO(DealerDetailsBean ddb, RateBean rb,Long n2, Long o2) {
		setDealerId(ddb.getDealerId());
		setDealerName(ddb.getDealerName());
		setAddress(ddb.getAddress());
		setContactNo(ddb.getContactNo());
		setEmailId(ddb.getEmailId());
		setGstin(ddb.getGstin());
		setDateOfRegistration(ddb.getDateOfRegistration());
		
		//Company rates
		setRateair(rb.getRateair());
		setRaten2(rb.getRaten2());
		setRateo2(rb.getRateo2());
		
		//Dealer rates
		setDrateair(rb.getDrateair());
		setDraten2(rb.getDraten2());
		setDrateo2(rb.getDrateo2());
		
		//Company cylinder counts
		setO2(o2);
		setN2(n2);
	}

	private String dealerId;	
	private String dealerName;	
	private String gstin;	
	private String address;	
	private String contactNo;	
	private String emailId;	
	private Timestamp dateOfRegistration;
	
	//Company rates
	private Double rateo2;	
	private Double raten2;
	private Double rateair;	
	
	//Dealer rates
	private Double drateo2;	
	private Double draten2;	
	private Double drateair;
	
	//Company cylinder counts
	private Long o2;
	private Long n2;
	
}
