package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Director;
import pe.edu.upc.entity.Pelicula;

import pe.edu.upc.service.IDirectorService;
import pe.edu.upc.service.IPeliculaService;

@Named
@RequestScoped

public class PeliculaController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IDirectorService dService;
	
	@Inject
	private IPeliculaService pService;
	
	private Director director;
	private Pelicula pelicula;
	
	List<Director> listaDirectores;
	List<Pelicula> listaPeliculas;
	
	@PostConstruct
	public void init() {
		this.listaDirectores = new ArrayList<Director>();
		this.listaPeliculas = new ArrayList<Pelicula>();
		
		this.director = new Director();
		this.pelicula = new Pelicula();
		
		this.listarDirector();
		this.listarPelicula();
	}
	
	public String nuevoPelicula() {
		this.setPelicula(new Pelicula());
		return "pelicula.xhtml";
	}
	
	public void insertar() {
		pService.insertar(pelicula);
		limpiarPelicula();
		this.listarPelicula();
	}
	
	public void listarDirector() {
		listaDirectores = dService.listar();
	}
	public void listarPelicula() {            
		listaPeliculas = pService.listar();
	}
	
	public void limpiarPelicula() {
		this.init();
	}
	
	public void eliminar(Pelicula pelicula) {
		pService.eliminar(pelicula.getcPelicula());
		this.listarPelicula();
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public List<Director> getListaDirectores() {
		return listaDirectores;
	}

	public void setListaDirectores(List<Director> listaDirectores) {
		this.listaDirectores = listaDirectores;
	}

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}
}
