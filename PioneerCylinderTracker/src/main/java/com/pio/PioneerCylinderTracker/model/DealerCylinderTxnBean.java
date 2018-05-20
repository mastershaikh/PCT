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
 * This DealerCylinderTxn class is a model of Txns happening
 * during purchase and return of a Customer Cylinders
 * 
 * @author Shaikh Nizamuddin
 *
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "DealerCylinderTxn")
public class DealerCylinderTxnBean {

	@Id
	private Long transactionId;
	
	@Column(length = 1)
	@NonNull
	private String billGenerated;
	
	@NonNull
	private Double billValue;
	
	@NonNull
	private Double capacity;
	
	@NonNull
	private Integer cylinderCount;
	
	@NonNull
	private String cylinderType;
	
	@NonNull
	private String dealerId;
	
	@NonNull
	private Timestamp dOTx;
	
	@NonNull
	private Double quantity;	
	
}
