package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.PublicacionComentario;

public interface IPublicacionComentarioService {
	public void insertar(PublicacionComentario publicacionComentario);
	public List<PublicacionComentario> listar();
	public void eliminar(int CPublicacionComentario);
}
