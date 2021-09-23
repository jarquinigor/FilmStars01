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
@Table(name="NoticiaComentario")
public class NoticiaComentario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cNoticiaComentario;

	@ManyToOne
	@JoinColumn(name = "cNoticia", nullable = false)
	private Noticia noticia;

	@ManyToOne
	@JoinColumn(name = "cUsuario", nullable = false)
	private Usuario usuario;
	
	@Column(name="comentarioNoticia", nullable=false, length=400)
	private String tNoticiaComentario;

	public NoticiaComentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoticiaComentario(int cNoticiaComentario, Noticia noticia, Usuario usuario, String tNoticiaComentario) {
		super();
		this.cNoticiaComentario = cNoticiaComentario;
		this.noticia = noticia;
		this.usuario = usuario;
		this.tNoticiaComentario = tNoticiaComentario;
	}

	public int getcNoticiaComentario() {
		return cNoticiaComentario;
	}

	public void setcNoticiaComentario(int cNoticiaComentario) {
		this.cNoticiaComentario = cNoticiaComentario;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String gettNoticiaComentario() {
		return tNoticiaComentario;
	}

	public void settNoticiaComentario(String tNoticiaComentario) {
		this.tNoticiaComentario = tNoticiaComentario;
	}
}
