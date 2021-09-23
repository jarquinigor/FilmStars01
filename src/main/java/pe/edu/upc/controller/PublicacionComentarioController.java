package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Publicacion;
import pe.edu.upc.entity.PublicacionComentario;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IPublicacionService;
import pe.edu.upc.service.IPublicacionComentarioService;

@Named
@RequestScoped

public class PublicacionComentarioController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private IPublicacionService pService;
	
	@Inject
	private IPublicacionComentarioService pcService;
	
	private Usuario usuario;
	private Publicacion publicacion;
	private PublicacionComentario publicacionComentario;
	
	List<Usuario> listaUsuarios;
	List<Publicacion> listaPublicaciones;
	List<PublicacionComentario> listaPublicacionComentarios;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaPublicaciones = new ArrayList<Publicacion>();
		this.listaPublicacionComentarios = new ArrayList<PublicacionComentario>();
		
		this.usuario = new Usuario();
		this.publicacion = new Publicacion();
		this.publicacionComentario = new PublicacionComentario();
		
		this.listarUsuario();
		this.listarPublicacion();
		this.listarPublicacionComentario();
	}
	
	public String nuevoPublicacionComentario() {
		this.setPublicacionComentario(new PublicacionComentario());
		return "publicacionComentario.xhtml";
	}
	
	public void insertar() {
		pcService.insertar(publicacionComentario);
		limpiarPublicacionComentario();
		this.listarPublicacionComentario();
	}
	
	public void listarUsuario() {
		listaUsuarios = uService.listar();
	}
	public void listarPublicacion() {
		listaPublicaciones = pService.listar();
	}
	public void listarPublicacionComentario() {
		listaPublicacionComentarios = pcService.listar();
	}
	
	public void limpiarPublicacionComentario() {
		this.init();
	}
	
	public void eliminar(PublicacionComentario publicacionComentario) {
		pcService.eliminar(publicacionComentario.getcPublicacionComentario());
		this.listarPublicacionComentario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

	public PublicacionComentario getPublicacionComentario() {
		return publicacionComentario;
	}

	public void setPublicacionComentario(PublicacionComentario publicacionComentario) {
		this.publicacionComentario = publicacionComentario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Publicacion> getListaPublicaciones() {
		return listaPublicaciones;
	}

	public void setListaPublicaciones(List<Publicacion> listaPublicaciones) {
		this.listaPublicaciones = listaPublicaciones;
	}

	public List<PublicacionComentario> getListaPublicacionComentarios() {
		return listaPublicacionComentarios;
	}

	public void setListaPublicacionComentarios(List<PublicacionComentario> listaPublicacionComentarios) {
		this.listaPublicacionComentarios = listaPublicacionComentarios;
	}
}
