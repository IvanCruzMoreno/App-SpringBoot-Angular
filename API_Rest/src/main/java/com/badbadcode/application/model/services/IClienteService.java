package com.badbadcode.application.model.services;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.badbadcode.application.model.entity.Cliente;
import com.badbadcode.application.model.entity.Region;

public interface IClienteService {

	public Iterable<Cliente> findAll();
	public Page<Cliente> findAll(Pageable pageable);
	public Cliente findById(Long id);
	public Cliente save(Cliente cliente);
	public void delete(Long id);
	public Cliente update(Cliente cliente, Long id);
	public List<Region> findAllRegiones();
	
}
