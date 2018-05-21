package com.pio.PioneerCylinderTracker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pio.PioneerCylinderTracker.model.DealerDetailsBean;

public interface DealerListRepository extends CrudRepository<DealerDetailsBean, String>{

	List<DealerDetailsBean> findAll();
}
