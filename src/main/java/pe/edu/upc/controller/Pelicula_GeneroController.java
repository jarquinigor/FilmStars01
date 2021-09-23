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
import pe.edu.upc.entity.Pelicula_Genero;

import pe.edu.upc.service.IPeliculaService;
import pe.edu.upc.service.IGeneroService;
import pe.edu.upc.service.IPelicula_GeneroService;

@Named
@RequestScoped

public class Pelicula_GeneroController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IPeliculaService pService;
	
	@Inject
	private IGeneroService gService;
	
	@Inject
	private IPelicula_GeneroService pgService;
	
	private Pelicula pelicula;
	private Genero genero;
	private Pelicula_Genero pelicula_genero;
	
	List<Pelicula> listaPeliculas;
	List<Genero> listaGeneros;
	List<Pelicula_Genero> listaPelicula_Genero;
	
	@PostConstruct
	public void init() {
		this.listaPeliculas = new ArrayList<Pelicula>();
		this.listaGeneros = new ArrayList<Genero>();
		this.listaPelicula_Genero = new ArrayList<Pelicula_Genero>();
		
		this.pelicula = new Pelicula();
		this.genero = new Genero();
		this.pelicula_genero = new Pelicula_Genero();
		
		this.listarPelicula();
		this.listarGenero();
		this.listarPelicula_Genero();
	}
	
	public String nuevoPelicula_Genero() {
		this.setPelicula_Genero(new Pelicula_Genero());
		return "pelicula_genero.xhtml";
	}
	
	public void insertar() {
		pgService.insertar(pelicula_genero);
		limpiarPelicula_Genero();
		this.listarPelicula_Genero();
	}
	
	public void listarPelicula() {
		listaPeliculas = pService.listar();
	}
	public void listarGenero() {
		listaGeneros = gService.listar();
	}
	public void listarPelicula_Genero() {
		listaPelicula_Genero = pgService.listar();
	}
	
	public void limpiarPelicula_Genero() {
		this.init();
	}
	
	public void eliminar(Pelicula_Genero pelicula_genero) {
		pgService.eliminar(pelicula_genero.getCPelicula_Genero());
		this.listarPelicula_Genero();
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

	public Pelicula_Genero getPelicula_Genero() {
		return pelicula_genero;
	}

	public void setPelicula_Genero(Pelicula_Genero pelicula_genero) {
		this.pelicula_genero = pelicula_genero;
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

	public List<Pelicula_Genero> getListaPelicula_Genero() {
		return listaPelicula_Genero;
	}

	public void setListaPelicula_Genero(List<Pelicula_Genero> listaPelicula_Genero) {
		this.listaPelicula_Genero = listaPelicula_Genero;
	}
}
