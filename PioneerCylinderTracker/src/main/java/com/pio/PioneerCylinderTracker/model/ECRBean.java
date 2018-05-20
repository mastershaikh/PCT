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
 * This ECRBean class is a model of ECR
 * 
 * @author Shaikh Nizamuddin
 *
 */

@Entity
@Data
@NoArgsConstructor
@Table(name = "ECR")
public class ECRBean {

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
