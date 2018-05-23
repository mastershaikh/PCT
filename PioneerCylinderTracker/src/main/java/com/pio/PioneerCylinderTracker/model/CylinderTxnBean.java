/*
 * This project is Licensed under Apache 2.0 
 * and it is intended for reference only.
 * Do not copy or sell without owners' permission.
 * 
 * Copyright © 2018 by Shaikh Nizamuddin. All Rights Reserved.
 * 
 */
package com.pio.PioneerCylinderTracker.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * This CylinderTxnBean class is a model of Txns happening
 * during purchase and return of Company Cylinders
 * 
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 *
 * Since   : May 23, 2018
 *
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "CylinderTxn")
public class CylinderTxnBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3510766079626078903L;

	@Id
	private Long transactionId;
	
	@NonNull
	private String dealerId;
	
	@NonNull
	private Long cylinderId;
	
	@NonNull
	private String cylinderType;

	@NonNull
	@Column(length = 1)
	private String live;
	
	@NonNull
	private Timestamp dOTx;
	
	@Column(name = "DOR")
	private Timestamp DOR;
	
	@Column(length = 1)
	private String billGenerated;
}
