package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.entity.Noticia;
import pe.edu.upc.entity.NoticiaComentario;

import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.service.INoticiaService;
import pe.edu.upc.service.INoticiaComentarioService;

@Named
@RequestScoped

public class NoticiaComentarioController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private IUsuarioService uService;
	
	@Inject
	private INoticiaService nService;
	
	@Inject
	private INoticiaComentarioService ncService;
	
	private Usuario usuario;
	private Noticia noticia;
	private NoticiaComentario noticiaComentario;
	
	List<Usuario> listaUsuarios;
	List<Noticia> listaNoticias;
	List<NoticiaComentario> listaNoticiaComentarios;
	
	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaNoticias = new ArrayList<Noticia>();
		this.listaNoticiaComentarios = new ArrayList<NoticiaComentario>();
		
		this.usuario = new Usuario();
		this.noticia = new Noticia();
		this.noticiaComentario = new NoticiaComentario();
		
		this.listarUsuario();
		this.listarNoticia();
		this.listarNoticiaComentario();
	}
	
	public String nuevoNoticiaComentario() {
		this.setNoticiaComentario(new NoticiaComentario());
		return "noticiaComentario.xhtml";
	}
	
	public void insertar() {
		ncService.insertar(noticiaComentario);
		limpiarNoticiaComentario();
		this.listarNoticiaComentario();
	}
	
	public void listarUsuario() {
		listaUsuarios = uService.listar();
	}
	public void listarNoticia() {
		listaNoticias = nService.listar();
	}
	public void listarNoticiaComentario() {
		listaNoticiaComentarios = ncService.listar();
	}
	
	public void limpiarNoticiaComentario() {
		this.init();
	}
	
	public void eliminar(NoticiaComentario noticiaComentario) {
		ncService.eliminar(noticiaComentario.getCNoticiaComentario());
		this.listarNoticiaComentario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

	public NoticiaComentario getNoticiaComentario() {
		return noticiaComentario;
	}

	public void setNoticiaComentario(NoticiaComentario noticiaComentario) {
		this.noticiaComentario = noticiaComentario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Noticia> getListaNoticias() {
		return listaNoticias;
	}

	public void setListaNoticias(List<Noticia> listaNoticias) {
		this.listaNoticias = listaNoticias;
	}

	public List<NoticiaComentario> getListaNoticiaComentarios() {
		return listaNoticiaComentarios;
	}

	public void setListaNoticiaComentarios(List<NoticiaComentario> listaNoticiaComentarios) {
		this.listaNoticiaComentarios = listaNoticiaComentarios;
	}
}
