package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.PublicacionComentario;

public interface IPublicacionComentarioDao {
	public void insertar(PublicacionComentario publicacionComentario);
	public List<PublicacionComentario> listar();
	public void eliminar(int CPublicacionComentario);
}
