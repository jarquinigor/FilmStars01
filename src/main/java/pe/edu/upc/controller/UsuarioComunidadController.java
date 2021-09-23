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
import pe.edu.upc.entity.UsuarioComunidad;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IComunidadService;
import pe.edu.upc.service.IUsuarioComunidadService;

@Named
@RequestScoped

public class UsuarioComunidadController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private IComunidadService cService;
	
	@Inject
	private IUsuarioComunidadService ucService;
	
	private Usuario usuario;
	private Comunidad comunidad;
	private UsuarioComunidad usuarioComunidad;
	
	List<Usuario> listaUsuarios;
	List<Comunidad> listaComunidades;
	List<UsuarioComunidad> listaUsuarioComunidad;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaComunidades = new ArrayList<Comunidad>();
		this.listaUsuarioComunidad = new ArrayList<UsuarioComunidad>();
		
		this.usuario = new Usuario();
		this.comunidad = new Comunidad();
		this.usuarioComunidad = new UsuarioComunidad();
		
		this.listarUsuario();
		this.listarComunidad();
		this.listarUsuarioComunidad();
	}
	
	public String nuevoUsuario_Comunidad() {
		this.setUsuarioComunidad(new UsuarioComunidad());
		return "usuariocomunidad.xhtml";
	}
	
	public void insertar() {
		ucService.insertar(usuarioComunidad);
		limpiarUsuarioComunidad();
		this.listarUsuarioComunidad();
	}
	
	public void listarUsuario() {
		listaUsuarios = uService.listar();
	}
	public void listarComunidad() {
		listaComunidades = cService.listar();
	}
	public void listarUsuarioComunidad() {
		listaUsuarioComunidad = ucService.listar();
	}
	
	public void limpiarUsuarioComunidad() {
		this.init();
	}
	
	public void eliminar(UsuarioComunidad usuario_comunidad) {
		ucService.eliminar(usuario_comunidad.getcUsuarioComunidad());
		this.listarUsuarioComunidad();
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

	public UsuarioComunidad getUsuarioComunidad() {
		return usuarioComunidad;
	}

	public void setUsuarioComunidad(UsuarioComunidad usuarioComunidad) {
		this.usuarioComunidad = usuarioComunidad;
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

	public List<UsuarioComunidad> getListaUsuarioComunidad() {
		return listaUsuarioComunidad;
	}

	public void setListaUsuarioComunidad(List<UsuarioComunidad> listaUsuarioComunidad) {
		this.listaUsuarioComunidad = listaUsuarioComunidad;
	}
}
