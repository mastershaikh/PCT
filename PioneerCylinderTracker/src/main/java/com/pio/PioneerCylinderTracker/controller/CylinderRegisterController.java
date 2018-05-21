package com.pio.PioneerCylinderTracker.controller;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pio.PioneerCylinderTracker.model.CylinderBean;
import com.pio.PioneerCylinderTracker.repository.CylinderRegisterRepository;

@RestController
public class CylinderRegisterController {

	private CylinderRegisterRepository cylinderRegisterRepo;
	
	@Autowired
	public CylinderRegisterController(CylinderRegisterRepository cylinderRegisterRepo) {
		super();
		this.cylinderRegisterRepo = cylinderRegisterRepo;
	}

	@GetMapping(value = "/CylinderRegister",produces = {MediaType.APPLICATION_JSON_VALUE})
	public String getRegister (final Model model) {
		model.addAttribute("cylinder", new CylinderBean());
		return "CylinderRegister";
	}
	
	@PostMapping(value = "/CylinderRegister",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ModelAndView processRegister (
	@ModelAttribute("cylinder") final CylinderBean cylinder) {
			ModelAndView result = new ModelAndView("CylinderRegister", "fail",
					"Registration Failed");
				
			Optional<CylinderBean> cb = cylinderRegisterRepo.findById(cylinder.getCylinderId());
			if(cb.isPresent()) {
				result = new ModelAndView("CylinderRegister", "fail",
						"Cylinder Already registered with details:"
						+"Cylinder Id = "+cb.get().getCylinderId()+" capacity = "+cb.get().getCapacity()
						+"cylinder Type = "+cb.get().getCylinderType()
						+ "In possession with Dealer ID = "+cb.get().getUsageStatus());
					
			}else {				
				cylinder.setBillGenerated("N");
				cylinder.setLastModifiedDate(Timestamp.valueOf(LocalDateTime.now()));		
				cylinder.setUsageStatus("0");
				cylinderRegisterRepo.save(cylinder);
					result = new ModelAndView("CylinderRegister", "success",
					"Cylinder Registration Successful! CylinderID is:"
							+ cylinder.getCylinderId());
			}
			return result;
		}
}
