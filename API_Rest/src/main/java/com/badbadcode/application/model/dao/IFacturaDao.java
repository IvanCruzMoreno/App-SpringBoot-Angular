package com.badbadcode.application.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.badbadcode.application.model.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

	
}
