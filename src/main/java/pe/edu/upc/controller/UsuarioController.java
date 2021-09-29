package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
//import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;
import pe.edu.upc.serviceimpl.LoginService;

@Named
//@SessionScoped
@RequestScoped
public class UsuarioController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;

	@Inject
	private IUsuarioService uService;
	
	@Inject
	private LoginService lService;
	
	private Usuario usuario;
	List<Usuario> listaUsuarios;
	
	private Usuario usuarioLogin;
	
	@PostConstruct
	public void init() {
		//if(aux==1 || aux==2) {
			this.listaUsuarios = new ArrayList<Usuario>();//limpia a "listaUsuarios"
			this.usuario = new Usuario(); //limpia a "usuario"
			this.listarUsuario(); //Guarda los usuarios en la lista
			//this.lService = new LoginService(); //ATENCIÓN CON ESTO
			//aux=aux+1;
		//}
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
		//System.out.println(usuario.getNombreEmail());
		//System.out.println(usuario.getNombrePassword());
		if(uService.verificaUsuario(usuario.getNombreEmail(), usuario.getNombrePassword())==true)
			return "login.xhtml"; //NO EXISTE USUARIO
		else
		{
			if (usuario.getNombreEmail().equals("admin") && usuario.getNombrePassword().equals("admin"))
			{				
				return "admin.xhtml";
			}
				
			else
			{
				lService.setUsuario(uService.enviarUsuario(usuario.getNombreEmail(), usuario.getNombrePassword()));
				setUsuarioLogin(lService.getUsuario());
				
				System.out.println(uService.enviarUsuario(usuario.getNombreEmail(), usuario.getNombrePassword()).getcUsuario());
				System.out.println(uService.enviarUsuario(usuario.getNombreEmail(), usuario.getNombrePassword()).getNombreUsuario());
				
				System.out.println(lService.getUsuario().getcUsuario());
				System.out.println(lService.getUsuario().getNombreUsuario());
				
				System.out.println(usuarioLogin.getcUsuario());
				System.out.println(usuarioLogin.getNombreUsuario());
				
				return "landingpage.xhtml";
			}			
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

	public Usuario getUsuarioLogin() {
		return usuarioLogin;
	}

	public void setUsuarioLogin(Usuario usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}

	public LoginService getlService() {
		return lService;
	}

	public void setlService(LoginService lService) {
		this.lService = lService;
	}
	
}
