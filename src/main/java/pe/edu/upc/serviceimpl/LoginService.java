package pe.edu.upc.serviceimpl;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import pe.edu.upc.entity.Usuario;
import java.io.Serializable;

@Named
@SessionScoped
public class LoginService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
