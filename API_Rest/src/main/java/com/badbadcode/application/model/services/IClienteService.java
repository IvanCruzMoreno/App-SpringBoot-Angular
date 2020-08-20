package com.badbadcode.application.model.services;


import com.badbadcode.application.model.entity.Cliente;

public interface IClienteService {

	public Iterable<Cliente> findAll();
	
}
