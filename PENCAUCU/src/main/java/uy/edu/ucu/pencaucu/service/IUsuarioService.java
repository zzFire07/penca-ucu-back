package uy.edu.ucu.pencaucu.service;

import java.util.List;

import uy.edu.ucu.pencaucu.dto.UsuarioDTO;

public interface IUsuarioService {

	UsuarioDTO createUsuario(UsuarioDTO usuarioDTO);
	
	UsuarioDTO loginUsuario(String email, String password);
	
	UsuarioDTO updateUsuario(UsuarioDTO usuarioDTO);
	
	void deleteUsuario(UsuarioDTO usuarioDTO);
	
	UsuarioDTO getUsuario(Integer id_usuario);
	
	List<UsuarioDTO> getAllUsuario(UsuarioDTO usuarioDTO);
}
