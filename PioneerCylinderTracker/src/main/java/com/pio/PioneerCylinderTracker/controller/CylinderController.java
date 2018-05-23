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
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pio.PioneerCylinderTracker.model.CylinderBean;
import com.pio.PioneerCylinderTracker.model.CylinderTxnBean;
import com.pio.PioneerCylinderTracker.model.ElementTypeBean;
import com.pio.PioneerCylinderTracker.repository.CylinderRepository;
import com.pio.PioneerCylinderTracker.repository.CylinderTxnRepository;
import com.pio.PioneerCylinderTracker.repository.ElementRepository;
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
	
	private CylinderRepository cylinderRepo;
	private ElementRepository elementRepo;
	private CylinderTxnRepository cylinderTxnRepo;
	
	/**
	 * @param cylinderRepo
	 */
	@Autowired
	public CylinderController(CylinderRepository cylinderRepo,ElementRepository elementRepo,
			CylinderTxnRepository cylinderTxnRepo) {
		super();
		this.cylinderRepo = cylinderRepo;
		this.elementRepo = elementRepo;
		this.cylinderTxnRepo = cylinderTxnRepo;
	}
	
	@PostMapping(value="/trackCylinder",produces = {MediaType.APPLICATION_JSON_VALUE})
	public CylinderDetailsVO trackCylinder (@RequestParam(value = "cylinderId") Long cylinderId) {
		
		Optional<CylinderBean> cb = cylinderRepo.findByCylinderId(cylinderId);
		List<CylinderTxnBean> ctb = cylinderTxnRepo.findByCylinderId(cylinderId);
		ElementTypeBean etb = elementRepo.findByElementId(cb.get().getCylinderType());
		return new CylinderDetailsVO(cb, ctb, etb);
	}
	
}
