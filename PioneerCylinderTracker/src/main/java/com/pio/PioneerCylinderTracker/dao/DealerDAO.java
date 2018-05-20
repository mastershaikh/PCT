package com.pio.PioneerCylinderTracker.dao;


import java.util.Optional;
import java.util.TreeMap;


public interface DealerDAO {
	
	public Optional<TreeMap<String, String>> dealerList();

}
