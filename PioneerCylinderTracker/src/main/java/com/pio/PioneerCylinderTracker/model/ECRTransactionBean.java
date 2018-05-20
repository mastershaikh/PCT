package com.pio.PioneerCylinderTracker.model;

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
 * @author Shaikh Nizamuddin
 *
 */

@Entity
@Data
@NoArgsConstructor
@Table(name ="ECRTransaction")
public class ECRTransactionBean {

	@Id
	private Long txId;
	
	@NonNull
	private Long cylinderId;
	
	@NonNull
	private String lorryNo;
	
	@NonNull
	private String dealerId;
	
	@Column(length = 1)
	@NonNull
	private String ecrStatus;

	
}
