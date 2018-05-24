package com.pio.PioneerCylinderTracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pio.PioneerCylinderTracker.model.CylinderBean;
import com.pio.PioneerCylinderTracker.model.CylinderTxnBean;
import com.pio.PioneerCylinderTracker.model.ElementTypeBean;
import com.pio.PioneerCylinderTracker.repository.CylinderRepository;
import com.pio.PioneerCylinderTracker.repository.CylinderTxnRepository;
import com.pio.PioneerCylinderTracker.repository.ElementRepository;
import com.pio.PioneerCylinderTracker.vo.CylinderDetailsVO;

/**
 * This CylinderUtility.java class is 
 *
 * @author : Shaikh Nizamuddin
 *
 * version : 1.0
 */

@Service
public class CylinderServiceImpl implements CylinderService{	
	

	private CylinderRepository cylinderRepo;
	private ElementRepository elementRepo;
	private CylinderTxnRepository cylinderTxnRepo;
	
	@Autowired
	public CylinderServiceImpl(CylinderRepository cylinderRepo,ElementRepository elementRepo,
			CylinderTxnRepository cylinderTxnRepo) {
		this.cylinderRepo = cylinderRepo;
		this.elementRepo = elementRepo;
		this.cylinderTxnRepo = cylinderTxnRepo;
	}

	@Override
	public CylinderDetailsVO trackCylinder(Long cylinderId) {
		Optional<CylinderBean> cb = cylinderRepo.findByCylinderId(cylinderId);
		List<CylinderTxnBean> ctb = cylinderTxnRepo.findByCylinderId(cylinderId);
		ElementTypeBean etb = elementRepo.findByElementId(cb.get().getCylinderType());
		return new CylinderDetailsVO(cb,ctb,etb);
	}
	
	
}
