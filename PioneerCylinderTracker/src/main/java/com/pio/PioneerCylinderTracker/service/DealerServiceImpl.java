package com.pio.PioneerCylinderTracker.service;

import java.util.Optional;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pio.PioneerCylinderTracker.dao.DealerDAO;
import com.pio.PioneerCylinderTracker.model.DealerDetailsBean;
import com.pio.PioneerCylinderTracker.model.RateBean;
import com.pio.PioneerCylinderTracker.repository.CylinderRepository;
import com.pio.PioneerCylinderTracker.repository.DealerDetailsRepository;
import com.pio.PioneerCylinderTracker.repository.RateRepository;
import com.pio.PioneerCylinderTracker.vo.DealerDetailsVO;

@Service
public class DealerServiceImpl implements DealerService {
	
	private DealerDetailsRepository dealerDetailsRepo;
	private RateRepository rateRepo;
	private CylinderRepository cylinderRepo;
	private DealerDAO dealerDAO;
	
	
	/**
	 * @param dealerDAO
	 * @param dealerL
	 */
	@Autowired
	public DealerServiceImpl(DealerDetailsRepository dealerDetailsRepo,RateRepository rateRepo,
			CylinderRepository cylinderRepo,DealerDAO dealerDAO) {
		super();
		this.dealerDAO = dealerDAO;
		this.dealerDetailsRepo = dealerDetailsRepo;
		this.rateRepo = rateRepo;
		this.cylinderRepo = cylinderRepo;
	}



	@Override
	public TreeMap<String, String> allDealers() {
		
		TreeMap<String,String> tm = new TreeMap<>();		
		Optional<TreeMap<String,String>> opt = dealerDAO.dealerList();
		
		if(opt.isPresent()) {
			opt.get().forEach((k,v)->tm.put(k, v));
		}else {
			tm.put("0", "0");
		}
		return tm;
	}



	@Override
	public DealerDetailsVO dealerDetails(String dealerId) {
		
		DealerDetailsBean ddb = dealerDetailsRepo.findByDealerId(dealerId);
		RateBean rb = rateRepo.findByDealerId(dealerId);
		Long n2 = cylinderRepo.countByUsageStatusAndCylinderType(dealerId,7);
		Long o2 = cylinderRepo.countByUsageStatusAndCylinderType(dealerId,8);	
		
		return new DealerDetailsVO(ddb,rb,n2,o2);
	}
			
		
}
