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
	private int CComunidad;

	@ManyToOne
	@JoinColumn(name = "CTema", nullable = false)
	private Tema tema;
	
	@Column(name="nombreComunidad", nullable=false, length=60)
	private String NComunidad;

	public Comunidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comunidad(int cComunidad, Tema tema, String nComunidad) {
		super();
		CComunidad = cComunidad;
		this.tema = tema;
		NComunidad = nComunidad;
	}

	public int getCComunidad() {
		return CComunidad;
	}

	public void setCComunidad(int cComunidad) {
		CComunidad = cComunidad;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public String getNComunidad() {
		return NComunidad;
	}

	public void setNComunidad(String nComunidad) {
		NComunidad = nComunidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CComunidad;
		result = prime * result + ((NComunidad == null) ? 0 : NComunidad.hashCode());
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
		if (CComunidad != other.CComunidad)
			return false;
		if (NComunidad == null) {
			if (other.NComunidad != null)
				return false;
		} else if (!NComunidad.equals(other.NComunidad))
			return false;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}
}
