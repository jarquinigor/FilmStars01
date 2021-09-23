package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usuario_Comunidad")
public class Usuario_Comunidad implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CUsuario_Comunidad;

	@ManyToOne
	@JoinColumn(name = "CUsuario", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "CComunidad", nullable = false)
	private Comunidad comunidad;
	
	@Column(name="comunidadFuncion", nullable=false)
	private int FFuncionComunidad;

	public Usuario_Comunidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario_Comunidad(int cUsuario_Comunidad, Usuario usuario, Comunidad comunidad, int fFuncionComunidad) {
		super();
		CUsuario_Comunidad = cUsuario_Comunidad;
		this.usuario = usuario;
		this.comunidad = comunidad;
		FFuncionComunidad = fFuncionComunidad;
	}

	public int getCUsuario_Comunidad() {
		return CUsuario_Comunidad;
	}

	public void setCUsuario_Comunidad(int cUsuario_Comunidad) {
		CUsuario_Comunidad = cUsuario_Comunidad;
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

	public int getFFuncionComunidad() {
		return FFuncionComunidad;
	}

	public void setFFuncionComunidad(int fFuncionComunidad) {
		FFuncionComunidad = fFuncionComunidad;
	}
}
