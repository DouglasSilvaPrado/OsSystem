package com.douglas.os.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglas.os.domain.Tecnico;
import com.douglas.os.dtos.TecnicoDTO;
import com.douglas.os.exceptions.DataIntergratyViolationException;
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
	
	public Tecnico save(TecnicoDTO objDTO) {
		if(findByCPF(objDTO) != null) {
			throw new DataIntergratyViolationException("CPF ja cadastrado na base de dados!");
		}
		
		return repository.save(new Tecnico(null, objDTO.getNome(), objDTO.getCpf(), objDTO.getTelefone()));
	}
	
	private Tecnico findByCPF(TecnicoDTO objDTO) {
		Tecnico obj = repository.findByCPF(objDTO.getCpf());
		if(obj != null) {
			return obj;
		}
		return null;
	}
	
	
}
