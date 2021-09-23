package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Noticia;

public interface INoticiaService {
	public void insertar(Noticia noticia);
	public List<Noticia> listar();
	public void eliminar(int CNoticia);
}
