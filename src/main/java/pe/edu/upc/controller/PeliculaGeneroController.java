package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Pelicula;
import pe.edu.upc.entity.Genero;
import pe.edu.upc.entity.PeliculaGenero;

import pe.edu.upc.service.IPeliculaService;
import pe.edu.upc.service.IGeneroService;
import pe.edu.upc.service.IPeliculaGeneroService;

@Named
@RequestScoped

public class PeliculaGeneroController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IPeliculaService pService;
	
	@Inject
	private IGeneroService gService;
	
	@Inject
	private IPeliculaGeneroService pgService;
	
	private Pelicula pelicula;
	private Genero genero;
	private PeliculaGenero peliculaGenero;
	
	List<Pelicula> listaPeliculas;
	List<Genero> listaGeneros;
	List<PeliculaGenero> listaPeliculaGenero;
	
	@PostConstruct
	public void init() {
		this.listaPeliculas = new ArrayList<Pelicula>();
		this.listaGeneros = new ArrayList<Genero>();
		this.listaPeliculaGenero = new ArrayList<PeliculaGenero>();
		
		this.pelicula = new Pelicula();
		this.genero = new Genero();
		this.peliculaGenero = new PeliculaGenero();
		
		this.listarPelicula();
		this.listarGenero();
		this.listarPeliculaGenero();
	}
	
	public String nuevoPelicula_Genero() {
		this.setPeliculaGenero(new PeliculaGenero());
		return "peliculaGenero.xhtml";
	}
	
	public void insertar() {
		pgService.insertar(peliculaGenero);
		limpiarPeliculaGenero();
		this.listarPeliculaGenero();
	}
	
	public void listarPelicula() {
		listaPeliculas = pService.listar();
	}
	public void listarGenero() {
		listaGeneros = gService.listar();
	}
	public void listarPeliculaGenero() {
		listaPeliculaGenero = pgService.listar();
	}
	
	public void limpiarPeliculaGenero() {
		this.init();
	}
	
	public void eliminar(PeliculaGenero peliculaGenero) {
		pgService.eliminar(peliculaGenero.getcPeliculaGenero());
		this.listarPeliculaGenero();
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public PeliculaGenero getPeliculaGenero() {
		return peliculaGenero;
	}

	public void setPeliculaGenero(PeliculaGenero peliculaGenero) {
		this.peliculaGenero = peliculaGenero;
	}

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

	public List<Genero> getListaGeneros() {
		return listaGeneros;
	}

	public void setListaGeneros(List<Genero> listaGeneros) {
		this.listaGeneros = listaGeneros;
	}

	public List<PeliculaGenero> getListaPeliculaGenero() {
		return listaPeliculaGenero;
	}

	public void setListaPeliculaGenero(List<PeliculaGenero> listaPeliculaGenero) {
		this.listaPeliculaGenero = listaPeliculaGenero;
	}
}
