package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
//import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
@SessionScoped
//@RequestScoped


public class UsuarioController implements Serializable {

	private static final long serialVersionUID = -3351318371418292111L;
	private HttpServletRequest request;
	
	@Inject
	private IUsuarioService uService;
	private Usuario usuario;
	List<Usuario> listaUsuarios;

	@PostConstruct
	public void init() {
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
		this.listarUsuario();
	}

	public String nuevoUsuario() {
		this.setUsuario(new Usuario());
		return "usuario.xhtml";
	}

	public void insertar() {
		uService.insertar(usuario);
		limpiarUsuario();
	}

	public void listarUsuario() {
		listaUsuarios = uService.listar();
	}

	public void limpiarUsuario() {
		this.init();
	}

	public void eliminar(Usuario usuario) {
		uService.eliminar(usuario.getcUsuario());
		this.listarUsuario();
	}
	
	public String antiguoUsuario() {
		System.out.println(usuario.getNombreEmail());
		System.out.println(usuario.getNombrePassword());
		if(uService.verificaUsuario(usuario.getNombreEmail(), usuario.getNombrePassword())==true) {
			return "login.xhtml"; //NO EXISTE USUARIO
			
			}
		else
		{
			HttpSession session =  getSession();
			session.setAttribute("miusuario", "arthur");
			
			if (usuario.getNombreEmail().equals("admin") && usuario.getNombrePassword().equals("admin")) {
				
			
				return "admin.xhtml";
			}
			else
				return "landingpage.xhtml";
		}
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	public static HttpSession getSession() {
		return (HttpSession)
				FacesContext.
				getCurrentInstance().
				getExternalContext().
				getSession(false);
	}
}

