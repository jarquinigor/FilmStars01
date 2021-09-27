package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Usuario;

public interface IUsuarioService {
	public void insertar(Usuario usuario);
	public List<Usuario> listar();
	public void eliminar(int cUsuario);
	public boolean verificaUsuario(String email, String password);
	public Usuario enviarUsuario(String email, String password);
}
