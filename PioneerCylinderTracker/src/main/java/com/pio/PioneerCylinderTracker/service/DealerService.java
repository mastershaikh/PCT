package com.pio.PioneerCylinderTracker.service;


import java.util.TreeMap;

import com.pio.PioneerCylinderTracker.vo.DealerDetailsVO;


public interface DealerService {

	public TreeMap<String, String> allDealers();
	
	public DealerDetailsVO dealerDetails(String dealerId);
}
