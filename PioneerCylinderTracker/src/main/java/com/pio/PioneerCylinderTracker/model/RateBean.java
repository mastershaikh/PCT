package com.pio.PioneerCylinderTracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * This RateBean class is used to fix rate of gas supplied
 * to Dealers by the company
 *
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "rate")
public class RateBean {

	@Id
	private String dealerId;
	
	@NonNull
	private double rateo2;
	
	@NonNull
	private double raten2;
	
	@NonNull
	private double rateair;
	
	@NonNull
	private double drateo2;
	
	@NonNull
	private double draten2;
	
	@NonNull
	private double drateair;
}
