package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cUsuario;
	
	@Column(name="nombreUsuario", nullable=false, length=60)
	private String nUsuario;
	
	@Column(name="nombreEmail", nullable=false, length=60)
	private String nEmail;
	
	@Column(name="nombrePassword", nullable=false, length=30)
	private String nPassword;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int cUsuario, String nUsuario, String nEmail, String nPassword) {
		super();
		this.cUsuario = cUsuario;
		this.nUsuario = nUsuario;
		this.nEmail = nEmail;
		this.nPassword = nPassword;
	}

	public int getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(int cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getnUsuario() {
		return nUsuario;
	}

	public void setnUsuario(String nUsuario) {
		this.nUsuario = nUsuario;
	}

	public String getnEmail() {
		return nEmail;
	}

	public void setnEmail(String nEmail) {
		this.nEmail = nEmail;
	}

	public String getnPassword() {
		return nPassword;
	}

	public void setnPassword(String nPassword) {
		this.nPassword = nPassword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cUsuario;
		result = prime * result + ((nEmail == null) ? 0 : nEmail.hashCode());
		result = prime * result + ((nPassword == null) ? 0 : nPassword.hashCode());
		result = prime * result + ((nUsuario == null) ? 0 : nUsuario.hashCode());
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
		if (nEmail == null) {
			if (other.nEmail != null)
				return false;
		} else if (!nEmail.equals(other.nEmail))
			return false;
		if (nPassword == null) {
			if (other.nPassword != null)
				return false;
		} else if (!nPassword.equals(other.nPassword))
			return false;
		if (nUsuario == null) {
			if (other.nUsuario != null)
				return false;
		} else if (!nUsuario.equals(other.nUsuario))
			return false;
		return true;
	}
}
