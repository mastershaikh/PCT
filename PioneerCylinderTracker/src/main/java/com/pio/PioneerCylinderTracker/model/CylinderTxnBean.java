package com.pio.PioneerCylinderTracker.model;

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
 * @author Shaikh Nizamuddin
 *
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "CylinderTxn")
public class CylinderTxnBean {
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
	private String liveTx;
	
	@NonNull
	private Timestamp dOTx;
	
	@Column(name = "DOR")
	private Timestamp DOR;
	
	@Column(length = 1)
	private String billGenerated;
}
