package com.douglas.os.dtos;

import java.io.Serializable;

import org.hibernate.validator.constraints.br.CPF;

import com.douglas.os.domain.Tecnico;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TecnicoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	
	@CPF
	private String cpf;
	private String telefone;
	
	public TecnicoDTO(Tecnico obj) {
		super();
		id = obj.getId();
		nome = obj.getNome();
		cpf = obj.getCpf();
		telefone = obj.getTelefone();
	}
	
	
}
