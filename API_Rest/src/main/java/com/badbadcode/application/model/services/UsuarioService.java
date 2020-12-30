package com.badbadcode.application.model.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.badbadcode.application.model.dao.IUsuarioDao;
import com.badbadcode.application.model.entity.Usuario;

@Service
public class UsuarioService implements UserDetailsService, IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;
	
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true, noRollbackFor=Exception.class)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioDao.findByUsername(username);
		
		if(usuario == null) {
			logger.error("Error: el usuario "+ username + " no existe en el sistema");
			throw new UsernameNotFoundException("Error: el usuario "+ username + " no existe en el sistema");
		}
		
		List<GrantedAuthority> authorities = usuario.getRoles()
													.stream()
													.map( rol -> new SimpleGrantedAuthority(rol.getNombre()))
													.peek(authority -> logger.info("Role: "+ authority.getAuthority()))
													.collect(Collectors.toList());
				
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, authorities );
	}

	@Override
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

}
