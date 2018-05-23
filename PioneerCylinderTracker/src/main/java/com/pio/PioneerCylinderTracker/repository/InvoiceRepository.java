/*
 * This project is Licensed under Apache 2.0 
 * and it is intended for reference only.
 * Do not copy or sell without owners' permission.
 *
 * Copyright © 2018 by Shaikh Nizamuddin. All Rights Reserved.
 * 
 */
package com.pio.PioneerCylinderTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pio.PioneerCylinderTracker.model.InvoiceBean;

/**
 * InvoiceRepository.java is used to 
 * 
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 *
 * Since   : May 23, 2018
 *
 */
public interface InvoiceRepository extends JpaRepository<InvoiceBean, Long> {

}
