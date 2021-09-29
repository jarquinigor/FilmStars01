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
	private int cActor;
	
	@Column(name="nActor", nullable=false, length=60)
	private String nActor;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(int cActor, String nActor) {
		super();
		this.cActor = cActor;
		this.nActor = nActor;
	}
	
	public int getcActor() {
		return cActor;
	}

	public void setcActor(int cActor) {
		this.cActor = cActor;
	}

	public String getnActor() {
		return nActor;
	}

	public void setnActor(String nActor) {
		this.nActor = nActor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cActor;
		result = prime * result + ((nActor == null) ? 0 : nActor.hashCode());
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
		if (cActor != other.cActor)
			return false;
		if (nActor == null) {
			if (other.nActor != null)
				return false;
		} else if (!nActor.equals(other.nActor))
			return false;
		return true;
	}
}
