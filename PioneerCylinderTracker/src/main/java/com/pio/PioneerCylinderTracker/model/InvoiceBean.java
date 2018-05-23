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
 * This InvoiceBean class is used to generate Invoice
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
@Table(name = "Invoice")
public class InvoiceBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5027649115531062055L;

	@Id
	private Long billNo;
	
	@NonNull
	private String dealerId;

	@Column(length=15)
	private String vehicleNo;
	
	@NonNull
	private Integer cylinderType;
	
	@NonNull
	private Integer totalCylinders;
	
	@NonNull
	private Float quantity;
	
	@NonNull
	private Double saleValue;
	
	@NonNull
	private Double CGST;
	
	@NonNull
	private Double SGST;
	
	@NonNull
	private Double billValue;
	
	@NonNull
	private Double rate;
	
	@NonNull
	private Timestamp billDate;

	@Column(length=2000)
	@NonNull
	private String cylinderNo;
	
	@Column(length = 1)
	@NonNull
	private String outstanding;
	
	@Column(length = 1)
	@NonNull
	private String CorD;

}
