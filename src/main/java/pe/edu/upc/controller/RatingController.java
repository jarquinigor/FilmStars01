package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Pelicula;
import pe.edu.upc.entity.Rating;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IPeliculaService;
import pe.edu.upc.service.IRatingService;

@Named
@RequestScoped

public class RatingController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private IPeliculaService pService;
	
	@Inject
	private IRatingService rService;
	
	private Usuario usuario;
	private Pelicula pelicula;
	private Rating rating;
	
	List<Usuario> listaUsuarios;
	List<Pelicula> listaPeliculas;
	List<Rating> listaRatings;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaPeliculas = new ArrayList<Pelicula>();
		this.listaRatings = new ArrayList<Rating>();
		
		this.usuario = new Usuario();
		this.pelicula = new Pelicula();
		this.rating = new Rating();
		
		this.listarUsuario();
		this.listarPelicula();
		this.listarRating();
	}
	
	public String nuevoRating() {
		this.setRating(new Rating());
		return "rating.xhtml";
	}
	
	public void insertar() {
		rService.insertar(rating);
		limpiarRating();
		this.listarRating();
	}
	
	public void listarUsuario() {
		listaUsuarios = uService.listar();
	}
	public void listarPelicula() {
		listaPeliculas = pService.listar();
	}
	public void listarRating() {
		listaRatings = rService.listar();
	}
	
	public void limpiarRating() {
		this.init();
	}
	
	public void eliminar(Rating rating) {
		rService.eliminar(rating.getCRating());
		this.listarRating();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}

	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}

	public List<Rating> getListaRatings() {
		return listaRatings;
	}

	public void setListaRatings(List<Rating> listaRatings) {
		this.listaRatings = listaRatings;
	}
}
