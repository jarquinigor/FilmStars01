package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //usar ctrl+space
@Table(name="Actor")
public class Actor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombreActor", nullable=false, length=50)
	private String nombreActor;

	public Actor() {
		super();
	}

	public Actor(int id, String nombreActor) {
		super();
		this.id = id;
		this.nombreActor = nombreActor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreActor() {
		return nombreActor;
	}

	public void setNombreActor(String nombreActor) {
		this.nombreActor = nombreActor;
	}
}
