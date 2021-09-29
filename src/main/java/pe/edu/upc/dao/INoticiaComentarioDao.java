package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.NoticiaComentario;

public interface INoticiaComentarioDao {
	public void insertar(NoticiaComentario noticiaComentario);
	public List<NoticiaComentario> listar();
	public void eliminar(int CNoticiaComentario);
	public List<NoticiaComentario> filtroNoticiaComentario(int CNoticia);
}
