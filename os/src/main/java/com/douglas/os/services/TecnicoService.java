package com.douglas.os.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.os.domain.Tecnico;
import com.douglas.os.exceptions.ObjectNotFoundException;
import com.douglas.os.repositories.TecnicoRepository;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não Encontado! ID: " + id + ", Tipo: " + Tecnico.class.getName()));
	}
	
	public List<Tecnico> findAll(){
		return repository.findAll();
	}
	
	public Tecnico save(Tecnico tecnico) {
		Tecnico obj  = new Tecnico();
		obj.setNome(tecnico.getNome());
		obj.setCpf(tecnico.getCpf());
		obj.setTelefone(tecnico.getTelefone());
		return repository.save(obj);
	}
}
