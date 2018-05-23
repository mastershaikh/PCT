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
 * This DealerCylinderTxn class is a model of Txns happening
 * during purchase and return of a Customer Cylinders
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
@Table(name = "DealerCylinderTxn")
public class DealerCylinderTxnBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2624096177665652635L;

	@Id
	private Long transactionId;
	
	@Column(length = 1)
	@NonNull
	private String billGenerated;
	
	@NonNull
	private Double billValue;
	
	@NonNull
	private Float capacity;
	
	@NonNull
	private Integer cylinderCount;
	
	@NonNull
	private String cylinderType;
	
	@NonNull
	private String dealerId;
	
	@NonNull
	private Timestamp dOTx;
	
	@NonNull
	private Float quantity;	
	
}
