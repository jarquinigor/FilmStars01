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
@Table(name="Comunidad")
public class Comunidad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cComunidad;

	@ManyToOne
	@JoinColumn(name = "cTema", nullable = false)
	private Tema tema;
	
	@Column(name="nombreComunidad", nullable=false, length=60)
	private String nComunidad;

	public Comunidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comunidad(int cComunidad, Tema tema, String nComunidad) {
		super();
		this.cComunidad = cComunidad;
		this.tema = tema;
		this.nComunidad = nComunidad;
	}

	public int getcComunidad() {
		return cComunidad;
	}

	public void setcComunidad(int cComunidad) {
		this.cComunidad = cComunidad;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public String getnComunidad() {
		return nComunidad;
	}

	public void setnComunidad(String nComunidad) {
		this.nComunidad = nComunidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cComunidad;
		result = prime * result + ((nComunidad == null) ? 0 : nComunidad.hashCode());
		result = prime * result + ((tema == null) ? 0 : tema.hashCode());
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
		Comunidad other = (Comunidad) obj;
		if (cComunidad != other.cComunidad)
			return false;
		if (nComunidad == null) {
			if (other.nComunidad != null)
				return false;
		} else if (!nComunidad.equals(other.nComunidad))
			return false;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}
}
