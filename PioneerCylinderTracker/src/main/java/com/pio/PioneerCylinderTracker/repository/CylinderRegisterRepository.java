package com.pio.PioneerCylinderTracker.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pio.PioneerCylinderTracker.model.CylinderBean;

public interface CylinderRegisterRepository extends CrudRepository<CylinderBean, Long> {

	Optional<CylinderBean> findById(Iterable<Long> cylinderId);
}
