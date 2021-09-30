package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Usuario;

public interface IUsuarioDao {
	public void insertar(Usuario usuario);
	public List<Usuario> listar();
	public void eliminar(int CUsuario);
	public boolean verificaUsuario(String email, String password);//
	public Usuario enviarUsuario(String email, String password);//
}
