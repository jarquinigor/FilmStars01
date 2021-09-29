package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Noticia;

public interface INoticiaDao {
	public void insertar(Noticia noticia);
	public List<Noticia> listar();
	public void eliminar(int CNoticia);
	public List<Noticia> findByTituloNoticia(Noticia n);
	//public Noticia enviarNoticia(String email, String password)
}
