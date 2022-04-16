package com.douglas.os.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

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
	
	@NotEmpty(message = "O Campo nome e requerido")
	private String nome;
	
	@CPF
	@NotEmpty(message = "O Campo cpf e requerido")
	private String cpf;
	@NotEmpty(message = "O Campo telefone e requerido")
	private String telefone;
	
	public TecnicoDTO(Tecnico obj) {
		super();
		id = obj.getId();
		nome = obj.getNome();
		cpf = obj.getCpf();
		telefone = obj.getTelefone();
	}
	
	
}
