/**
 * 
 */
package com.swathisprasad.springboot.controller;

import com.swathisprasad.springboot.model.Context;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@GetMapping("/context")
	public Context getContext() {
		return new Context("199", "contextValueTest");
	}

}
