package com.badbadcode.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badbadcode.application.model.entity.Cliente;
import com.badbadcode.application.model.services.IClienteService;
/*
 * cros : intercambio de recursos de origen cruzado
 * http://localhost:4200 ----> puerto en donde esta situado nuestro front-end
 */
@CrossOrigin(origins = {"http://localhost:4200"}) 
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public Iterable<Cliente> index(){
		return clienteService.findAll();
	}
	
}
