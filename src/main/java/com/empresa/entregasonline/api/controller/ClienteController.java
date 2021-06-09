package com.empresa.entregasonline.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entregasonline.domain.model.Cliente;

@RestController // Identificação de componente spring capaz de tratar requisições http
public class ClienteController {

	@GetMapping("/clientes") // Mapeamento do método
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Maria Jose");
		cliente1.setEmail("maria.jose@dominio.com.br");
		cliente1.setTelefone("11 90000-1111");

		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Jose Maria");
		cliente2.setEmail("jose.maria@dominio.com.br");
		cliente2.setTelefone("11 91111-2222");		
		
		
		return Arrays.asList(cliente1,cliente2);
	}
	
}
