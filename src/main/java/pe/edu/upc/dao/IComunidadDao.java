package pe.edu.upc.dao;

import java.util.List;
import pe.edu.upc.entity.Comunidad;

public interface IComunidadDao {
	public void insertar(Comunidad comunidad);
	public List<Comunidad> listar();
	public void eliminar(int CComunidad);
}
