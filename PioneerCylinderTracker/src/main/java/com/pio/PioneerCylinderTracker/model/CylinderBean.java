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
 * This class is a model of Cylinder.
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
@Table(name = "Cylinder")
public class CylinderBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -76596069178402454L;

	@Id
	private Long cylinderId;
	
	@Column(length = 1)
	@NonNull
	private String billGenerated;
	
	private Float capacity;
	
	@NonNull
	private Integer cylinderType;
	
	@NonNull
	@Column(length = 1)
	private String damage;
	
	@NonNull
	private Timestamp lastModifiedDate;		
	
	@Column(name = "REMARK")
	private String remark;	

	@Column(length = 6)
	@NonNull
	private String usageStatus;
	
	private Long billNo;
}
