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
 * This InvoiceBean class is used to generate Invoice
 * 
 * @author Shaikh Nizamuddin
 *
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "Invoice")
public class InvoiceBean {

	@Id
	private Long billNo;
	
	@NonNull
	private String dealerId;

	@Column(length=15)
	private String vehicleNo;
	
	@Column(length= 50)
	@NonNull
	private String cylinderType;
	
	@NonNull
	private Integer totalCylinders;
	
	@NonNull
	private Double quantity;
	
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
