package com.badbadcode.application.model.services;

import org.springframework.stereotype.Service;

import com.badbadcode.application.model.entity.Usuario;

@Service
public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
