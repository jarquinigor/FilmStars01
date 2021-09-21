package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usuario implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CUsuario;
	
	@Column(name="nombreUsuario", nullable=false, length=60)
	private String NUsuario;
	
	@Column(name="nombreEmail", nullable=false, length=60)
	private String NEmail;
	
	@Column(name="nombrePassword", nullable=false, length=30)
	private String NPassword;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int cUsuario, String nUsuario, String nEmail, String nPassword) {
		super();
		CUsuario = cUsuario;
		NUsuario = nUsuario;
		NEmail = nEmail;
		NPassword = nPassword;
	}

	public int getCUsuario() {
		return CUsuario;
	}

	public void setCUsuario(int cUsuario) {
		CUsuario = cUsuario;
	}

	public String getNUsuario() {
		return NUsuario;
	}

	public void setNUsuario(String nUsuario) {
		NUsuario = nUsuario;
	}

	public String getNEmail() {
		return NEmail;
	}

	public void setNEmail(String nEmail) {
		NEmail = nEmail;
	}

	public String getNPassword() {
		return NPassword;
	}

	public void setNPassword(String nPassword) {
		NPassword = nPassword;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CUsuario;
		result = prime * result + ((NEmail == null) ? 0 : NEmail.hashCode());
		result = prime * result + ((NPassword == null) ? 0 : NPassword.hashCode());
		result = prime * result + ((NUsuario == null) ? 0 : NUsuario.hashCode());
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
		if (CUsuario != other.CUsuario)
			return false;
		if (NEmail == null) {
			if (other.NEmail != null)
				return false;
		} else if (!NEmail.equals(other.NEmail))
			return false;
		if (NPassword == null) {
			if (other.NPassword != null)
				return false;
		} else if (!NPassword.equals(other.NPassword))
			return false;
		if (NUsuario == null) {
			if (other.NUsuario != null)
				return false;
		} else if (!NUsuario.equals(other.NUsuario))
			return false;
		return true;
	}
}
