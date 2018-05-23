/*
 * This project is Licensed under Apache 2.0 
 * and it is intended for reference only.
 * Do not copy or sell without owners' permission.
 *
 * Copyright © 2018 by Shaikh Nizamuddin. All Rights Reserved.
 * 
 */
package com.pio.PioneerCylinderTracker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pio.PioneerCylinderTracker.model.DealerDetailsBean;

/**
 * DealerDetailsRepository.java is used to 
 * 
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 *
 * Since   : May 23, 2018
 *
 */
public interface DealerDetailsRepository extends CrudRepository<DealerDetailsBean, String> {

	DealerDetailsBean findByDealerId(String dealerId);
	
	List<DealerDetailsBean> findAll();
}
