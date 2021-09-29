package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.NoticiaComentario;

public interface INoticiaComentarioService {
	public void insertar(NoticiaComentario noticiaComentario);
	public List<NoticiaComentario> listar();
	public void eliminar(int cNoticiaComentario);
	public List<NoticiaComentario> filtroNoticiaComentario(int CNoticia);
}
