package com.pio.PioneerCylinderTracker.service;

import java.util.Optional;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pio.PioneerCylinderTracker.dao.DealerDAO;

@Service
public class DealerUtility implements DealerUtil {
	
	private DealerDAO dealerDAO;
	
	
	/**
	 * @param dealerDAO
	 * @param dealerL
	 */
	@Autowired
	public DealerUtility(DealerDAO dealerDAO) {
		super();
		this.dealerDAO = dealerDAO;
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
			
		
}
