package com.badbadcode.application.model.services;


import com.badbadcode.application.model.entity.Cliente;

public interface IClienteService {

	public Iterable<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void delete(Long id);
	public Cliente update(Cliente cliente, Long id);
	
}
