package com.douglas.os.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.douglas.os.domain.OS;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OSDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dataAbertura;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime dataFechamento;
	private Integer prioridade;
	private String observacoes;
	private Integer status;
	private Integer tecnico;
	private Integer cliente;
	
	public OSDTO() {
		super();
	}
	
	public OSDTO(OS obj) {
		super();
		id = obj.getId();
		dataAbertura = obj.getDataAbertura();
		dataFechamento = obj.getDataFechamento();
		prioridade = obj.getPrioridade().getCod();
		observacoes = obj.getObservacoes();
		status = obj.getStatus().getCod();
		tecnico = obj.getTecnico().getId();
		cliente = obj.getCliente().getId();
	}

}
