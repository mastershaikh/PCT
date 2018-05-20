/**
 * 
 */
package com.pio.PioneerCylinderTracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shaikh Nizamuddin
 *
 */
@Controller
public class HomeController {
	 @RequestMapping("/")
	 public String home() {
	  return "index";
	 }
}
