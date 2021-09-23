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
	private int CPublicacion;

	@ManyToOne
	@JoinColumn(name = "CComunidad", nullable = false)
	private Comunidad comunidad;
	
	@ManyToOne
	@JoinColumn(name = "CUsuario", nullable = false)
	private Usuario usuario;
	
	@Column(name="tituloPublicacion", nullable=false, length=80)
	private String NPublicacionTitulo;
	
	@Column(name="textoPublicacion", nullable=false, length=800)
	private String TPublicacion;
	
	@Column(name="imagenPublicacion", nullable=false, length=200)
	private String TPublicacionImagen;

	public Publicacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publicacion(int cPublicacion, Comunidad comunidad, Usuario usuario, String nPublicacionTitulo,
			String tPublicacion, String tPublicacionImagen) {
		super();
		CPublicacion = cPublicacion;
		this.comunidad = comunidad;
		this.usuario = usuario;
		NPublicacionTitulo = nPublicacionTitulo;
		TPublicacion = tPublicacion;
		TPublicacionImagen = tPublicacionImagen;
	}

	public int getCPublicacion() {
		return CPublicacion;
	}

	public void setCPublicacion(int cPublicacion) {
		CPublicacion = cPublicacion;
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

	public String getNPublicacionTitulo() {
		return NPublicacionTitulo;
	}

	public void setNPublicacionTitulo(String nPublicacionTitulo) {
		NPublicacionTitulo = nPublicacionTitulo;
	}

	public String getTPublicacion() {
		return TPublicacion;
	}

	public void setTPublicacion(String tPublicacion) {
		TPublicacion = tPublicacion;
	}

	public String getTPublicacionImagen() {
		return TPublicacionImagen;
	}

	public void setTPublicacionImagen(String tPublicacionImagen) {
		TPublicacionImagen = tPublicacionImagen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CPublicacion;
		result = prime * result + ((NPublicacionTitulo == null) ? 0 : NPublicacionTitulo.hashCode());
		result = prime * result + ((TPublicacion == null) ? 0 : TPublicacion.hashCode());
		result = prime * result + ((TPublicacionImagen == null) ? 0 : TPublicacionImagen.hashCode());
		result = prime * result + ((comunidad == null) ? 0 : comunidad.hashCode());
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
		if (CPublicacion != other.CPublicacion)
			return false;
		if (NPublicacionTitulo == null) {
			if (other.NPublicacionTitulo != null)
				return false;
		} else if (!NPublicacionTitulo.equals(other.NPublicacionTitulo))
			return false;
		if (TPublicacion == null) {
			if (other.TPublicacion != null)
				return false;
		} else if (!TPublicacion.equals(other.TPublicacion))
			return false;
		if (TPublicacionImagen == null) {
			if (other.TPublicacionImagen != null)
				return false;
		} else if (!TPublicacionImagen.equals(other.TPublicacionImagen))
			return false;
		if (comunidad == null) {
			if (other.comunidad != null)
				return false;
		} else if (!comunidad.equals(other.comunidad))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
}
