package pe.edu.upc.entity;

import java.io.Serializable;

//import javax.enterprise.context.SessionScoped;//
//import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
//@Named
//@SessionScoped
public class Usuario implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cUsuario;
	
	@Column(name="nombreUsuario", nullable=false, length=60)
	private String nombreUsuario;
	
	@Column(name="nombreEmail", nullable=false, length=60)
	private String nombreEmail;
	
	@Column(name="nombrePassword", nullable=false, length=30)
	private String nombrePassword;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int cUsuario, String nombreUsuario, String nombreEmail, String nombrePassword) {
		super();
		this.cUsuario = cUsuario;
		this.nombreUsuario = nombreUsuario;
		this.nombreEmail = nombreEmail;
		this.nombrePassword = nombrePassword;
	}

	public int getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(int cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreEmail() {
		return nombreEmail;
	}

	public void setNombreEmail(String nombreEmail) {
		this.nombreEmail = nombreEmail;
	}

	public String getNombrePassword() {
		return nombrePassword;
	}

	public void setNombrePassword(String nombrePassword) {
		this.nombrePassword = nombrePassword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cUsuario;
		result = prime * result + ((nombreEmail == null) ? 0 : nombreEmail.hashCode());
		result = prime * result + ((nombrePassword == null) ? 0 : nombrePassword.hashCode());
		result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (cUsuario != other.cUsuario)
			return false;
		if (nombreEmail == null) {
			if (other.nombreEmail != null)
				return false;
		} else if (!nombreEmail.equals(other.nombreEmail))
			return false;
		if (nombrePassword == null) {
			if (other.nombrePassword != null)
				return false;
		} else if (!nombrePassword.equals(other.nombrePassword))
			return false;
		if (nombreUsuario == null) {
			if (other.nombreUsuario != null)
				return false;
		} else if (!nombreUsuario.equals(other.nombreUsuario))
			return false;
		return true;
	}
}
