package com.cav.spring.service.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cav.spring.service.authentication.model.Client;
import com.cav.spring.service.authentication.service.ClientService;

@RestController
@RequestMapping("/authenticationservice")
class ClientController {
	
	@Autowired
	private ClientService service;

	@RequestMapping(value = "/")
	public String home() {
		   return "Authentication Service";
	 }
	
	@RequestMapping(value="/getClient/{clientId}/", method=RequestMethod.GET)
	public Client getClient(@PathVariable("clientId") Long clientId){
		return service.getClient(clientId);
	}
}
