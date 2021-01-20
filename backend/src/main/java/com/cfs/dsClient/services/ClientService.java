package com.cfs.dsClient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cfs.dsClient.entities.Client;
import com.cfs.dsClient.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		
		return repository.findAll();
		
	}
}