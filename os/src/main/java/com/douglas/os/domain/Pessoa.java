package com.douglas.os.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Pessoa {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String telefone;

}
