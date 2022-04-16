package com.douglas.os.dtos;

import java.io.Serializable;

import org.hibernate.validator.constraints.br.CPF;

import com.douglas.os.domain.Cliente;

import lombok.Data;

@Data
public class ClienteDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	@CPF
	private String cpf;
	private String telefone;
	
	public ClienteDTO(Cliente obj) {
		super();
		id = obj.getId();
		nome = obj.getNome();
		cpf = obj.getCpf();
		telefone = obj.getTelefone();
	}

}
