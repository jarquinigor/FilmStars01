package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Noticia;

public interface INoticiaDao {
	public void insertar(Noticia noticia);
	public List<Noticia> listar();
	public void eliminar(int CNoticia);
}
