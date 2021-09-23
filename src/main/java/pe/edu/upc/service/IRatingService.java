package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Rating;

public interface IRatingService {
	public void insertar(Rating rating);
	public List<Rating> listar();
	public void eliminar(int CRating);
}
