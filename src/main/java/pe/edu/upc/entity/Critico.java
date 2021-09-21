package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Critico")
public class Critico implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CCritico;
	
	@Column(name="nombreCritico", nullable=false, length=60)
	private String NCritico;

	public Critico() {
		super();
	}

	public Critico(int CCritico, String NCritico) {
		super();
		this.CCritico = CCritico;
		this.NCritico = NCritico;
	}

	public int getCCritico() {
		return CCritico;
	}

	public void setCCritico(int cCritico) {
		CCritico = cCritico;
	}

	public String getNCritico() {
		return NCritico;
	}

	public void setNCritico(String nCritico) {
		NCritico = nCritico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CCritico;
		result = prime * result + ((NCritico == null) ? 0 : NCritico.hashCode());
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
		Critico other = (Critico) obj;
		if (CCritico != other.CCritico)
			return false;
		if (NCritico == null) {
			if (other.NCritico != null)
				return false;
		} else if (!NCritico.equals(other.NCritico))
			return false;
		return true;
	}
}
