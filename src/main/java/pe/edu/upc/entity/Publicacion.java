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
@Table(name="Publicacion")
public class Publicacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cPublicacion;

	@ManyToOne
	@JoinColumn(name = "cComunidad", nullable = false)
	private Comunidad comunidad;
	
	@ManyToOne
	@JoinColumn(name = "cUsuario", nullable = false)
	private Usuario usuario;
	
	@Column(name="tituloPublicacion", nullable=false, length=80)
	private String nPublicacionTitulo;
	
	@Column(name="textoPublicacion", nullable=false, length=800)
	private String tPublicacion;
	
	@Column(name="imagenPublicacion", nullable=false, length=200)
	private String tPublicacionImagen;

	public Publicacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publicacion(int cPublicacion, Comunidad comunidad, Usuario usuario, String nPublicacionTitulo,
			String tPublicacion, String tPublicacionImagen) {
		super();
		this.cPublicacion = cPublicacion;
		this.comunidad = comunidad;
		this.usuario = usuario;
		this.nPublicacionTitulo = nPublicacionTitulo;
		this.tPublicacion = tPublicacion;
		this.tPublicacionImagen = tPublicacionImagen;
	}

	public int getcPublicacion() {
		return cPublicacion;
	}

	public void setcPublicacion(int cPublicacion) {
		this.cPublicacion = cPublicacion;
	}

	public Comunidad getComunidad() {
		return comunidad;
	}

	public void setComunidad(Comunidad comunidad) {
		this.comunidad = comunidad;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getnPublicacionTitulo() {
		return nPublicacionTitulo;
	}

	public void setnPublicacionTitulo(String nPublicacionTitulo) {
		this.nPublicacionTitulo = nPublicacionTitulo;
	}

	public String gettPublicacion() {
		return tPublicacion;
	}

	public void settPublicacion(String tPublicacion) {
		this.tPublicacion = tPublicacion;
	}

	public String gettPublicacionImagen() {
		return tPublicacionImagen;
	}

	public void settPublicacionImagen(String tPublicacionImagen) {
		this.tPublicacionImagen = tPublicacionImagen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cPublicacion;
		result = prime * result + ((comunidad == null) ? 0 : comunidad.hashCode());
		result = prime * result + ((nPublicacionTitulo == null) ? 0 : nPublicacionTitulo.hashCode());
		result = prime * result + ((tPublicacion == null) ? 0 : tPublicacion.hashCode());
		result = prime * result + ((tPublicacionImagen == null) ? 0 : tPublicacionImagen.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Publicacion other = (Publicacion) obj;
		if (cPublicacion != other.cPublicacion)
			return false;
		if (comunidad == null) {
			if (other.comunidad != null)
				return false;
		} else if (!comunidad.equals(other.comunidad))
			return false;
		if (nPublicacionTitulo == null) {
			if (other.nPublicacionTitulo != null)
				return false;
		} else if (!nPublicacionTitulo.equals(other.nPublicacionTitulo))
			return false;
		if (tPublicacion == null) {
			if (other.tPublicacion != null)
				return false;
		} else if (!tPublicacion.equals(other.tPublicacion))
			return false;
		if (tPublicacionImagen == null) {
			if (other.tPublicacionImagen != null)
				return false;
		} else if (!tPublicacionImagen.equals(other.tPublicacionImagen))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
}
