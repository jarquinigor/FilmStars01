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
@Table(name="PublicacionComentario")
public class PublicacionComentario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cPublicacionComentario;

	@ManyToOne
	@JoinColumn(name = "cPublicacion", nullable = false)
	private Publicacion publicacion;
	
	@ManyToOne
	@JoinColumn(name = "cUsuario", nullable = false)
	private Usuario usuario;
	
	@Column(name="comentarioPublicacion", nullable=false, length=400)
	private String tPublicacionComentario;

	public PublicacionComentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PublicacionComentario(int cPublicacionComentario, Publicacion publicacion, Usuario usuario,
			String tPublicacionComentario) {
		super();
		this.cPublicacionComentario = cPublicacionComentario;
		this.publicacion = publicacion;
		this.usuario = usuario;
		this.tPublicacionComentario = tPublicacionComentario;
	}

	public int getcPublicacionComentario() {
		return cPublicacionComentario;
	}

	public void setcPublicacionComentario(int cPublicacionComentario) {
		this.cPublicacionComentario = cPublicacionComentario;
	}

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String gettPublicacionComentario() {
		return tPublicacionComentario;
	}

	public void settPublicacionComentario(String tPublicacionComentario) {
		this.tPublicacionComentario = tPublicacionComentario;
	}
}
