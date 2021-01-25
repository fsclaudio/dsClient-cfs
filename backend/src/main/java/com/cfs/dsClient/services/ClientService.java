package com.cfs.dsClient.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cfs.dsClient.dto.ClientDTO;
import com.cfs.dsClient.entities.Client;
import com.cfs.dsClient.repositories.ClientRepository;
import com.cfs.dsClient.services.exceptions.EntityNotFoundPerException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {

		List<Client> list = repository.findAll();

		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new EntityNotFoundPerException("Entity not found!"));

		return new ClientDTO(entity);
	}
	
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
	//	copyDtoToEntity(dto);
		
		entity = repository.save(entity);

		return new ClientDTO(entity);
	}
	
	@Transactional
	public ClientDTO update(Long id,ClientDTO dto) {
		Client entity = new Client();
	//	copyDtoToEntity(dto);
		
		entity = repository.save(entity);

		return new ClientDTO(entity);
	}
}
