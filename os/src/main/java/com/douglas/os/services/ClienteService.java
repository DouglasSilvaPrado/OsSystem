package com.douglas.os.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.os.domain.Cliente;
import com.douglas.os.exceptions.ObjectNotFoundException;
import com.douglas.os.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public Cliente findById(Integer id){
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não Encontado! ID: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
