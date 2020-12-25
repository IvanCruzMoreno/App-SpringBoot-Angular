package com.badbadcode.application.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.badbadcode.application.model.entity.Cliente;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
