package com.douglas.os.domain;

import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tecnico extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "tecnico")
	private List<OS> list = new ArrayList<>();

	public Tecnico() {
		super();
	}

	public Tecnico(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
	}

	
}
