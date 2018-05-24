/*
 * This project is Licensed under Apache 2.0 
 * and it is intended for reference only.
 * Do not copy or sell without owners' permission.
 *
 * Copyright © 2018 by Shaikh Nizamuddin. All Rights Reserved.
 * 
 */
package com.pio.PioneerCylinderTracker.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pio.PioneerCylinderTracker.service.CylinderService;
import com.pio.PioneerCylinderTracker.vo.CylinderDetailsVO;

/**
 * CylinderController.java is used to 
 * 
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 *
 * Since   : May 23, 2018
 *
 */
@RestController
public class CylinderController {
	
	private CylinderService cylinderS;
	
	/**
	 * @param cylinderRepo
	 */
	@Autowired
	public CylinderController() {
		super();
		
	}
	
	@PostMapping(value="/trackCylinder",produces = {MediaType.APPLICATION_JSON_VALUE})
	public CylinderDetailsVO trackCylinder (@RequestParam(value = "cylinderId") Long cylinderId) {
		
		return cylinderS.trackCylinder(cylinderId);
	}
	
}
