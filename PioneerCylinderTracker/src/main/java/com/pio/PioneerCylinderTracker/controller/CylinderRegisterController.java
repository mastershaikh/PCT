package com.pio.PioneerCylinderTracker.controller;


import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pio.PioneerCylinderTracker.model.CylinderBean;
import com.pio.PioneerCylinderTracker.service.CylinderUtil;

@RestController
public class CylinderRegisterController {

	private CylinderUtil cylUtil;
		
	public CylinderRegisterController(CylinderUtil cylinderUtil) {
		super();
		this.cylUtil = cylinderUtil;
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
				
			Optional<CylinderBean> cb = cylUtil.checkCylinder(cylinder.getCylinderId());
			
			if(cb.isPresent()) {
				result = new ModelAndView("CylinderRegister", "fail",
						"Cylinder Already registered with details:"
						+"Cylinder Id = "+cb.get().getCylinderId()+" capacity = "+cb.get().getCapacity()
						+"cylinder Type = "+cb.get().getCylinderType()
						+ "In possession with Dealer ID = "+cb.get().getUsageStatus());
					
			}else {				
				cylinder.setBillGenerated("N");
				String status = cylUtil.register(cylinder);
				if(status.equals("SUCCESS")){
					result = new ModelAndView("CylinderRegister", "success",
					"Cylinder Registration Successful! CylinderID is:"
							+ cylinder.getCylinderId());
				}
			}
			return result;
		}
	/*@GetMapping(value = "/CylinderDamage",produces = {MediaType.APPLICATION_JSON_VALUE})
	public String viewDamage (final Model model) {
		model.addAttribute("cylinder", new CylinderBean());
		return "CylinderDamage";
	}
	
	@PostMapping(value = "/CylinderDamage",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ModelAndView processDamage (
	@ModelAttribute("cylinder") final CylinderBean cylinder) {
			ModelAndView result = new ModelAndView("CylinderDamage", "fail",
					"Registration Failed");
			String exist = cylUtil.checkCylinder(cylinder.getCylinderId());
			if(!exist.equals("SUCCESS")) {
			String[] c = exist.split(";");
			Double capacity = Double.valueOf(c[1]);
			cylinder.setCapacity(capacity);
			String cylinderType = c[2];
			cylinder.setCylinderType(cylinderType);
			String remark = c[3]+" "+cylinder.getRemark();
			cylinder.setDamage("Y");
			cylinder.setBillGenerated("N");
			cylinder.setRemark(remark);
					String status = cylUtil.register(cylinder);
					if(status.equals("SUCCESS")){
				result = new ModelAndView("CylinderDamage", "success",
						"Cylinder Damage Entry Done! Remark is:"
								+ cylinder.getRemark());
				}
			}else {
				result = new ModelAndView("CylinderDamage", "fail",
						"Invalid Cylinder! Check again");
			}
			return result;
		}*/
}
