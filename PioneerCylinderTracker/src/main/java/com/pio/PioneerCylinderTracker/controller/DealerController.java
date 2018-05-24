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
import com.pio.PioneerCylinderTracker.repository.DealerDetailsRepository;
import com.pio.PioneerCylinderTracker.service.DealerService;
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
	private DealerService dealerS;
	@Autowired
	public DealerController(DealerDetailsRepository dealerDetailsRepo,DealerService dealerS) {
		super();
		this.dealerDetailsRepo = dealerDetailsRepo;
		this.dealerS = dealerS;
	}
	
	@GetMapping(value = "/dealerLists",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<DealerDetailsBean> listOfDealers () {	
		List<DealerDetailsBean> ddb = dealerDetailsRepo.findAll();
		return ddb;
	}

	@PostMapping(value = "/dealerDetails",produces = {MediaType.APPLICATION_JSON_VALUE})
	public DealerDetailsVO dealerDetails (@RequestParam(value = "dealerId") String dealerId){
		
		return dealerS.dealerDetails(dealerId);
			
		}
}
