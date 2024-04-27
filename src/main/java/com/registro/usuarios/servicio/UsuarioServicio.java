package com.registro.usuarios.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuarios.modelo.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.bd.Usuario;


public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();

	void cambiarPassword(String email, String nuevaPassword);
}
