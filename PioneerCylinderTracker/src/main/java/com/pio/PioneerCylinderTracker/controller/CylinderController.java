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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pio.PioneerCylinderTracker.model.CylinderBean;
import com.pio.PioneerCylinderTracker.repository.CylinderRepository;

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
	
	private CylinderRepository cylinderRepo;
	
	/**
	 * @param cylinderRepo
	 */
	@Autowired
	public CylinderController(CylinderRepository cylinderRepo) {
		super();
		this.cylinderRepo = cylinderRepo;
	}
	
	

	@GetMapping(value="/findCylinder/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public CylinderBean findCylinder (@PathVariable("id") Long id) {		
		return cylinderRepo.findByCylinderId(id);
	}

	
}
