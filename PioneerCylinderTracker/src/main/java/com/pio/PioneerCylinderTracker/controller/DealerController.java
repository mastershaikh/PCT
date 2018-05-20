package com.pio.PioneerCylinderTracker.controller;


import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pio.PioneerCylinderTracker.service.DealerUtil;

@Controller
public class DealerController {

	private DealerUtil dealerU;
	
	@Autowired
	public DealerController(DealerUtil dealerU) {
		super();
		this.dealerU = dealerU;
	}

	@GetMapping(value = "/dealerLists",produces = {MediaType.APPLICATION_JSON_VALUE})
	public TreeMap<String,String> listOfDealers () {		
		return dealerU.allDealers();
	}
}
