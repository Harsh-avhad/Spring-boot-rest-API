package com.harshal.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harshal.props.AppProperties;


@RestController
public class MsgRestController {

	@Autowired
	private AppProperties appProps;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return appProps.getMessages().get("welcomeMsg");
		
		
	}
	

}
