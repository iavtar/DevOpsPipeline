/**
 * 
 */
package com.iavtar.vpi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author indra(Created this controller name with logical controller name X1, )
 * 
 *
 */
@Controller
public class X1Controller {

	@GetMapping(value= {"/", "/index", "/home", "default"})
	public String home() {
		return "index";
	}
	
}
