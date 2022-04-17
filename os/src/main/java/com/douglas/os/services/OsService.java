package com.douglas.os.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.os.domain.OS;
import com.douglas.os.exceptions.ObjectNotFoundException;
import com.douglas.os.repositories.OSRepository;

@Service
public class OsService {
	
	@Autowired
	private OSRepository repository;
	
	public OS findById(Integer id) {
		Optional<OS> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id"));
	}

}
