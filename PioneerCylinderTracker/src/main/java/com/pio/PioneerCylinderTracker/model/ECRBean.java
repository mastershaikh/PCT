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
 * This ECRBean class is a model of ECR
 * 
 * @author Shaikh Nizamuddin
 *
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "ECR")
public class ECRBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3602076609225742978L;

	@Id
	private Long ecrNo;
	
	@NonNull
	private Timestamp ecrDate;
	
	@Column(length=15)
	private String lorryNo;
	
	@Column(length=2000)
	@NonNull
	private String cylinderNo;
	
	@Column(length=6)
	@NonNull
	private String dealerId;
	
	
}
