package com.empresa.entregasonline.api.controller;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entregasonline.domain.model.Cliente;

@RestController // Identificação de componente spring capaz de tratar requisições http
public class ClienteController {

	@PersistenceContext
	private EntityManager manager; 
	
	
	@GetMapping("/clientes") // Mapeamento do método
	public List<Cliente> listar() {

		return manager.createQuery("from Cliente", Cliente.class)
				.getResultList();
	
	}
	
}
