package com.in28minutes.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@GetMapping("welcome")
	public String sayWelcome() {
		return "Hello You";
	}
}
