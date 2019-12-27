package Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Conge implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConge;
	@Temporal(TemporalType.DATE)
	private Date congeDebut;
	@Temporal(TemporalType.DATE)
	private Date congeFin;
	@ManyToOne
	@JoinColumn(name="resourceId" ,referencedColumnName="userId",insertable=false,updatable=false)
	private Resource resource ;
	
	
	
	
	
	
	public Conge() {
		super();
	}
	public Conge(Date congeDebut, Date congeFin) {
		super();
		this.congeDebut = congeDebut;
		this.congeFin = congeFin;
	}
	public Conge(int idConge, Date congeDebut, Date congeFin) {
		super();
		this.idConge = idConge;
		this.congeDebut = congeDebut;
		this.congeFin = congeFin;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public int getIdConge() {
		return idConge;
	}
	public void setIdConge(int idConge) {
		this.idConge = idConge;
	}
	public Date getCongeDebut() {
		return congeDebut;
	}
	public void setCongeDebut(Date congeDebut) {
		this.congeDebut = congeDebut;
	}
	public Date getCongeFin() {
		return congeFin;
	}
	public void setCongeFin(Date congeFin) {
		this.congeFin = congeFin;
	}
	
	

}
