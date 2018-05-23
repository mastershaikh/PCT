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
import org.springframework.web.bind.annotation.RestController;

import com.pio.PioneerCylinderTracker.model.DealerDetailsBean;
import com.pio.PioneerCylinderTracker.repository.DealerListRepository;
import com.pio.PioneerCylinderTracker.service.DealerUtil;

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

	private DealerUtil dealerU;
	private DealerListRepository dealerListRepo;
	@Autowired
	public DealerController(DealerUtil dealerU,DealerListRepository dealerListRepo) {
		super();
		this.dealerU = dealerU;
		this.dealerListRepo = dealerListRepo;
	}
	
	@GetMapping(value = "/dealerLists",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<DealerDetailsBean> listOfDealers () {	
		List<DealerDetailsBean> ddb = dealerListRepo.findAll();
		return ddb;
	}

	/*@GetMapping(value = "/dealerLists",produces = {MediaType.APPLICATION_JSON_VALUE})
	public TreeMap<String,String> listOfDealers () {	
		
		return dealerU.allDealers();
	}*/
}
