package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Usuario_Comunidad;

public interface IUsuario_ComunidadDao {
	public void insertar(Usuario_Comunidad usuario_comunidad);
	public List<Usuario_Comunidad> listar();
	public void eliminar(int CUsuario_Comunidad);
}