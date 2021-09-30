package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Pelicula;
import pe.edu.upc.entity.Actor;
import pe.edu.upc.entity.PeliculaActor;

import pe.edu.upc.service.IPeliculaService;
import pe.edu.upc.service.IActorService;
import pe.edu.upc.service.IPeliculaActorService;

@Named
@RequestScoped

public class PeliculaActorController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IPeliculaService pService;
	
	@Inject
	private IActorService aService;
	
	@Inject
	private IPeliculaActorService paService;
	
	private Pelicula pelicula;
	private Actor actor;
	private PeliculaActor peliculaActor;
	
	List<Pelicula> listaPeliculas;
	List<Actor> listaActores;
	List<PeliculaActor> listaPeliculaActor;
	
	@PostConstruct
	public void init() {
		this.listaPeliculas = new ArrayList<Pelicula>();
		this.listaActores = new ArrayList<Actor>();
		this.listaPeliculaActor = new ArrayList<PeliculaActor>();
		
		this.pelicula = new Pelicula();
		this.actor = new Actor();
		this.peliculaActor = new PeliculaActor();
		
		this.listarPelicula();
		this.listarActor();
		this.listarPelicula_Actor();
	}
	
	public String nuevoPelicula_Actor() {
		this.setPeliculaActor(new PeliculaActor());
		return "peliculaActor.xhtml";
	}
	
	public void insertar() {
		paService.insertar(peliculaActor);
		limpiarPelicula_Actor();
		this.listarPelicula_Actor();
	}
	
	public void listarPelicula() {
		listaPeliculas = pService.listar();
	}
	public void listarActor() {
		listaActores = aService.listar();
	}
	public void listarPelicula_Actor() {
		listaPeliculaActor = paService.listar();
	}
	
	public void limpiarPelicula_Actor() {
		this.init();
	}
	
	public void eliminar(PeliculaActor pelicula_actor) {
		paService.eliminar(pelicula_actor.getcPeliculaActor());
		this.listarPelicula_Actor();
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public PeliculaActor getPeliculaActor() {
		return peliculaActor;
	}

	public void setPeliculaActor(PeliculaActor peliculaActor) {
		this.peliculaActor = peliculaActor;
	}

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

	public List<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actor> listaActores) {
		this.listaActores = listaActores;
	}

	public List<PeliculaActor> getListaPeliculaActor() {
		return listaPeliculaActor;
	}

	public void setListaPeliculaActor(List<PeliculaActor> listaPeliculaActor) {
		this.listaPeliculaActor = listaPeliculaActor;
	}
}
