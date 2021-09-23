package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.UsuarioComunidad;

public interface IUsuarioComunidadService {
	public void insertar(UsuarioComunidad usuarioComunidad);
	public List<UsuarioComunidad> listar();
	public void eliminar(int cUsuarioComunidad);
}
