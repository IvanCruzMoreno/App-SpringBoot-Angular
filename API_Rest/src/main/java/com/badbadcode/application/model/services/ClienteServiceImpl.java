package com.badbadcode.application.model.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.badbadcode.application.model.dao.IClienteDao;
import com.badbadcode.application.model.dao.IFacturaDao;
import com.badbadcode.application.model.dao.IProductoDao;
import com.badbadcode.application.model.entity.Cliente;
import com.badbadcode.application.model.entity.Factura;
import com.badbadcode.application.model.entity.Producto;
import com.badbadcode.application.model.entity.Region;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteDao clienteDao;
	@Autowired
	private IFacturaDao facturaDao;
	@Autowired
	private IProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true) //se puede omitir ya que los metodos del crudrepository ya viene con @Transactional
	public Iterable<Cliente> findAll() {
		return clienteDao.findAll();
	}

	@Override
	public Page<Cliente> findAll(Pageable pageable) {
		return clienteDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		 return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

	@Override
	@Transactional
	public Cliente update(Cliente cliente, Long id) {
	
		Cliente currentCliente = findById(id);
		currentCliente.setApellido(cliente.getApellido());
		currentCliente.setNombre(cliente.getNombre());
		currentCliente.setEmail(cliente.getEmail());
		currentCliente.setFecha(cliente.getFecha());
		currentCliente.setRegion(cliente.getRegion());
		return currentCliente;
	}

	@Override
	public List<Region> findAllRegiones() {
		return clienteDao.findAllRegiones();
	}

	@Override
	public Factura findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
	}

	@Override
	public Factura saveFactura(Factura factura) {
		return facturaDao.save(factura);
	}

	@Override
	public void deleteFacturaById(Long id) {
		facturaDao.deleteById(id);
	}

	@Override
	public List<Producto> findProductoByNombreContainingIgnoreCase(String term) {
		return productoDao.findByNombreContainingIgnoreCase(term);
	}

	
}
