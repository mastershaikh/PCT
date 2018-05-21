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
 * This DealerDetails class is a model of Dealer Details
 * 
 * @author Shaikh Nizamuddin
 *
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "DealerDetails")
public class DealerDetailsBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8332306461638524148L;

	@Id
	private String dealerId;
	
	@NonNull
	private String dealerName;
	
	@Column(name="GSTIN")
	private String gstin;
	
	@NonNull
	private String address;
	
	@NonNull
	private String contactNo;
	
	@NonNull
	private String emailId;
	
	@NonNull
	private Timestamp dateOfRegistration;
	
	
}
