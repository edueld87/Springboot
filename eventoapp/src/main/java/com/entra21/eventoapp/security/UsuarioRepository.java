package com.entra21.eventoapp.security;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entra21.eventoapp.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	
	Usuario findByLogin(String login);

}
