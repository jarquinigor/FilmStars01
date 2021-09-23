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
@Table(name="UsuarioComunidad")
public class UsuarioComunidad implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cUsuarioComunidad;

	@ManyToOne
	@JoinColumn(name = "cUsuario", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "cComunidad", nullable = false)
	private Comunidad comunidad;
	
	@Column(name="comunidadFuncion", nullable=false)
	private int fFuncionComunidad;

	public UsuarioComunidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioComunidad(int cUsuarioComunidad, Usuario usuario, Comunidad comunidad, int fFuncionComunidad) {
		super();
		this.cUsuarioComunidad = cUsuarioComunidad;
		this.usuario = usuario;
		this.comunidad = comunidad;
		this.fFuncionComunidad = fFuncionComunidad;
	}

	public int getcUsuarioComunidad() {
		return cUsuarioComunidad;
	}

	public void setcUsuarioComunidad(int cUsuarioComunidad) {
		this.cUsuarioComunidad = cUsuarioComunidad;
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

	public int getfFuncionComunidad() {
		return fFuncionComunidad;
	}

	public void setfFuncionComunidad(int fFuncionComunidad) {
		this.fFuncionComunidad = fFuncionComunidad;
	}
}