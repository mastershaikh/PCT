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
 * This class is a model of Cylinder.
 * 
 * @author Shaikh Nizamuddin
 *
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "Cylinder")
public class CylinderBean {
	
	@Id
	@Column(length = 6)
	@NonNull
	private Long cylinderId;
	
	@Column(length = 1)
	@NonNull
	private String billGenerated;
	
	@Column(length = 1)
	private Double capacity;
	
	@NonNull
	private String cylinderType;
	
	@Column(length = 1)
	@NonNull
	private String damage;
	
	@NonNull
	private Timestamp lmd;		
	
	@Column(name = "REMARK")
	private String remark;	

	@Column(length = 6)
	@NonNull
	private String usageStatus;
}
