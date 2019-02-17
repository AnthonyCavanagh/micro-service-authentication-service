package com.cav.spring.service.authentication.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cav.spring.service.authentication.entity.BankClient;
import com.cav.spring.service.authentication.model.Client;
import com.cav.spring.service.authentication.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository repository;

	@Override
	public Client getClient(Long clientId) {
		Client client = null;
		
		BankClient entity = repository.findOne(clientId);
		if(entity != null){
			client = new Client();
			client.setClientid(entity.getClientid());
			client.setClientName(entity.getClientName());
			client.setEffectiveDate(mapToLocalDate(entity.getEffectiveDate()));
			client.setClientActive(entity.getClientActive());
		}
		return client;
	}

	private LocalDate mapToLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

}
