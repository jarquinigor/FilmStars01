package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Rating;

public interface IRatingDao {
	public void insertar(Rating rating);
	public List<Rating> listar();
	public void eliminar(int CRating);
}