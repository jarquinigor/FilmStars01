package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class NoticiaComentario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CNoticiaComentario;

	@ManyToOne
	@JoinColumn(name = "CNoticia", nullable = false)
	private Noticia noticia;

	@ManyToOne
	@JoinColumn(name = "CUsuario", nullable = false)
	private Usuario usuario;
	
	@Column(name="comentarioNoticia", nullable=false, length=400)
	private String TNoticiaComentario;

	
	public NoticiaComentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoticiaComentario(int cNoticiaComentario, Noticia noticia, Usuario usuario, String tNoticiaComentario) {
		super();
		CNoticiaComentario = cNoticiaComentario;
		this.noticia = noticia;
		this.usuario = usuario;
		TNoticiaComentario = tNoticiaComentario;
	}

	public int getCNoticiaComentario() {
		return CNoticiaComentario;
	}

	public void setCNoticiaComentario(int cNoticiaComentario) {
		CNoticiaComentario = cNoticiaComentario;
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

	public String getTNoticiaComentario() {
		return TNoticiaComentario;
	}

	public void setTNoticiaComentario(String tNoticiaComentario) {
		TNoticiaComentario = tNoticiaComentario;
	}
}
