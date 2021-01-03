package com.badbadcode.application.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.badbadcode.application.model.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

	public List<Producto> findByNombreContainingIgnoreCase(String term);
}
