package com.douglas.os;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.douglas.os.domain.Cliente;
import com.douglas.os.domain.OS;
import com.douglas.os.domain.Tecnico;
import com.douglas.os.domain.enums.Prioridade;
import com.douglas.os.domain.enums.Status;
import com.douglas.os.repositories.ClienteRepository;
import com.douglas.os.repositories.OSRepository;
import com.douglas.os.repositories.TecnicoRepository;

@SpringBootApplication
public class OsApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private OSRepository osRepository;

	public static void main(String[] args) {
		SpringApplication.run(OsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico t1  = new Tecnico(null, "Douglas Prado", "492.934.340-24", "(21) 99999-9999");
		Cliente c1  = new Cliente(null, "Betina Campos", "433.455.010-07", "(01) 99888-9999");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste Create OD", Status.ANDAMENTO, t1, c1);
		
		t1.getList().add(os1);
		c1.getList().add(os1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}

}
