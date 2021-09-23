package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Comunidad;
import pe.edu.upc.entity.Publicacion;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IComunidadService;
import pe.edu.upc.service.IPublicacionService;

@Named
@RequestScoped

public class PublicacionController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private IComunidadService cService;
	
	@Inject
	private IPublicacionService pService;
	
	private Usuario usuario;
	private Comunidad comunidad;
	private Publicacion publicacion;
	
	List<Usuario> listaUsuarios;
	List<Comunidad> listaComunidades;
	List<Publicacion> listaPublicaciones;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaComunidades = new ArrayList<Comunidad>();
		this.listaPublicaciones = new ArrayList<Publicacion>();
		
		this.usuario = new Usuario();
		this.comunidad = new Comunidad();
		this.publicacion = new Publicacion();
		
		this.listarUsuario();
		this.listarComunidad();
		this.listarPublicacion();
	}
	
	public String nuevoPublicacion() {
		this.setPublicacion(new Publicacion());
		return "publicacion.xhtml";
	}
	
	public void insertar() {
		pService.insertar(publicacion);
		limpiarPublicacion();
		this.listarPublicacion();
	}
	
	public void listarUsuario() {
		listaUsuarios = uService.listar();
	}
	public void listarComunidad() {
		listaComunidades = cService.listar();
	}
	public void listarPublicacion() {
		listaPublicaciones = pService.listar();
	}
	
	public void limpiarPublicacion() {
		this.init();
	}
	
	public void eliminar(Publicacion publicacion) {
		pService.eliminar(publicacion.getcPublicacion());
		this.listarPublicacion();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Comunidad getComunidad() {
		return comunidad;
	}

	public void setComunidad(Comunidad comunidad) {
		this.comunidad = comunidad;
	}

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Comunidad> getListaComunidades() {
		return listaComunidades;
	}

	public void setListaComunidades(List<Comunidad> listaComunidades) {
		this.listaComunidades = listaComunidades;
	}

	public List<Publicacion> getListaPublicaciones() {
		return listaPublicaciones;
	}

	public void setListaPublicaciones(List<Publicacion> listaPublicaciones) {
		this.listaPublicaciones = listaPublicaciones;
	}
}
