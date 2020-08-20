package com.badbadcode.application.model.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.badbadcode.application.model.dao.IClienteDao;
import com.badbadcode.application.model.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true) //se puede omitir ya que los metodos del crudrepository ya viene con @Transactional
	public Iterable<Cliente> findAll() {
		return clienteDao.findAll();
	}

}
