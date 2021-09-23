package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.UsuarioComunidad;

public interface IUsuarioComunidadDao {
	public void insertar(UsuarioComunidad usuarioComunidad);
	public List<UsuarioComunidad> listar();
	public void eliminar(int cUsuarioComunidad);
}
