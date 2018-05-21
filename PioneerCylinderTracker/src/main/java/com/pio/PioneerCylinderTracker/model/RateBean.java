package com.pio.PioneerCylinderTracker.model;

import java.io.Serializable;

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
public class RateBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 824622734856036476L;

	@Id
	private String dealerId;
	
	@NonNull
	private Double rateo2;
	
	@NonNull
	private Double raten2;
	
	@NonNull
	private Double rateair;
	
	@NonNull
	private Double drateo2;
	
	@NonNull
	private Double draten2;
	
	@NonNull
	private Double drateair;
}
