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
import pe.edu.upc.entity.Usuario_Comunidad;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.IComunidadService;
import pe.edu.upc.service.IUsuario_ComunidadService;

@Named
@RequestScoped

public class Usuario_ComunidadController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private IComunidadService cService;
	
	@Inject
	private IUsuario_ComunidadService ucService;
	
	private Usuario usuario;
	private Comunidad comunidad;
	private Usuario_Comunidad usuario_comunidad;
	
	List<Usuario> listaUsuarios;
	List<Comunidad> listaComunidades;
	List<Usuario_Comunidad> listaUsuario_Comunidad;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaComunidades = new ArrayList<Comunidad>();
		this.listaUsuario_Comunidad = new ArrayList<Usuario_Comunidad>();
		
		this.usuario = new Usuario();
		this.comunidad = new Comunidad();
		this.usuario_comunidad = new Usuario_Comunidad();
		
		this.listarUsuario();
		this.listarComunidad();
		this.listarUsuario_Comunidad();
	}
	
	public String nuevoUsuario_Comunidad() {
		this.setUsuario_Comunidad(new Usuario_Comunidad());
		return "usuario_comunidad.xhtml";
	}
	
	public void insertar() {
		ucService.insertar(usuario_comunidad);
		limpiarUsuario_Comunidad();
		this.listarUsuario_Comunidad(); //VERIFICAR
	}
	
	public void listarUsuario() {
		listaUsuarios = uService.listar();
	}
	public void listarComunidad() {
		listaComunidades = cService.listar();
	}
	public void listarUsuario_Comunidad() {
		listaUsuario_Comunidad = ucService.listar();
	}
	
	public void limpiarUsuario_Comunidad() {
		this.init();
	}
	
	public void eliminar(Usuario_Comunidad usuario_comunidad) {
		ucService.eliminar(usuario_comunidad.getCUsuario_Comunidad());
		this.listarUsuario_Comunidad();
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

	public Usuario_Comunidad getUsuario_Comunidad() {
		return usuario_comunidad;
	}

	public void setUsuario_Comunidad(Usuario_Comunidad usuario_comunidad) {
		this.usuario_comunidad = usuario_comunidad;
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

	public List<Usuario_Comunidad> getListaUsuario_Comunidad() {
		return listaUsuario_Comunidad;
	}

	public void setListaUsuario_Comunidad(List<Usuario_Comunidad> listaUsuario_Comunidad) {
		this.listaUsuario_Comunidad = listaUsuario_Comunidad;
	}
}
