/*
 * This project is Licensed under Apache 2.0 
 * and it is intended for reference only.
 * Do not copy or sell without owners' permission.
 * 
 * Copyright © 2018 by Shaikh Nizamuddin. All Rights Reserved.
 * 
 */
package com.pio.PioneerCylinderTracker.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pio.PioneerCylinderTracker.model.DealerDetailsBean;
import com.pio.PioneerCylinderTracker.model.RateBean;
import com.pio.PioneerCylinderTracker.repository.CylinderRepository;
import com.pio.PioneerCylinderTracker.repository.DealerDetailsRepository;
import com.pio.PioneerCylinderTracker.repository.RateRepository;
import com.pio.PioneerCylinderTracker.vo.DealerDetailsVO;

/**
 * DealerController.java is used to 
 * 
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 *
 * Since   : May 23, 2018
 *
 */
@RestController
public class DealerController {

	private DealerDetailsRepository dealerDetailsRepo;
	private RateRepository rateRepo;
	private CylinderRepository cylinderRepo;
	
	@Autowired
	public DealerController(DealerDetailsRepository dealerDetailsRepo,RateRepository rateRepo,
			CylinderRepository cylinderRepo) {
		super();
		this.dealerDetailsRepo = dealerDetailsRepo;
		this.rateRepo = rateRepo;
		this.cylinderRepo = cylinderRepo;
	}
	
	@GetMapping(value = "/dealerLists",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<DealerDetailsBean> listOfDealers () {	
		List<DealerDetailsBean> ddb = dealerDetailsRepo.findAll();
		return ddb;
	}

	@PostMapping(value = "/dealerDetails",produces = {MediaType.APPLICATION_JSON_VALUE})
	public DealerDetailsVO dealerDetails (@RequestParam(value = "dealerId") String dealerId){
		
			DealerDetailsBean ddb = dealerDetailsRepo.findByDealerId(dealerId);
			RateBean rb = rateRepo.findByDealerId(dealerId);
			Long n2 = cylinderRepo.countByUsageStatusAndCylinderType(dealerId,7);
			Long o2 = cylinderRepo.countByUsageStatusAndCylinderType(dealerId,8);	
			
			return new DealerDetailsVO(ddb,rb,n2,o2);
		}
}
