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
 * This OutstandingBean class is used to generate monthly
 * dealer invoice outstanding
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
@Table(name = "OutStanding")
public class OutstandingBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1254407780852665287L;

	@Id
	@Column(length = 6)
	private Long outId;
	
	@NonNull
	private Timestamp outDate;
	
	@Column(length = 6)
	@NonNull
	private String dealerId;
	
	@NonNull
	private Double totalAmount;
	
	@NonNull
	private Integer cylinderTaken;
	
	@NonNull
	private Integer cylinderReturn;
	
	@NonNull
	private String billNos;
	
}
