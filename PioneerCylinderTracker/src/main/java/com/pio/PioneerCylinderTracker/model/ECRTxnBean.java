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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * This ECRTransactionBean class is used to track returned Cylinders
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
@Table(name ="ECRTxn")
public class ECRTxnBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7280775114445131521L;

	@Id
	private Long txId;
	
	@NonNull
	private Long cylinderId;
	
	@NonNull
	private String dealerId;
	
	@Column(length = 1)
	@NonNull
	private String ecrStatus;

	
}
