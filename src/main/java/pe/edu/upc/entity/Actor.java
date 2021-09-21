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
	private int CActor;
	
	@Column(name="nombreActor", nullable=false, length=60)
	private String NActor;

	public Actor() {
		super();
	}

	public Actor(int CActor, String NActor) {
		super();
		this.CActor = CActor;
		this.NActor = NActor;
	}
	
	public int getId() {
		return CActor;
	}

	public void setId(int CActor) {
		this.CActor = CActor;
	}

	public String getNombreActor() {
		return NActor;
	}

	public void setNombreActor(String nombreActor) {
		this.NActor = nombreActor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CActor;
		result = prime * result + ((NActor == null) ? 0 : NActor.hashCode());
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
		Actor other = (Actor) obj;
		if (CActor != other.CActor)
			return false;
		if (NActor == null) {
			if (other.NActor != null)
				return false;
		} else if (!NActor.equals(other.NActor))
			return false;
		return true;
	}
}
