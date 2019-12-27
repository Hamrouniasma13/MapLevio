package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Mandate implements Serializable{
	@EmbeddedId
	private MandatePK mandatePK;
	
	private Date debutMandat;
	private Date finMandat;
	@ManyToOne
	@JoinColumn(name="projectId" ,referencedColumnName="projectId",insertable=false,updatable=false)
	private Project project ;
	
	@ManyToOne
	@JoinColumn(name="resourceId" ,referencedColumnName="userId",insertable=false,updatable=false)
	private Resource resource ;
	public MandatePK getMandatePK() {
		return mandatePK;
	}
	public void setMandatePK(MandatePK mandatePK) {
		this.mandatePK = mandatePK;
	}
	public Date getDebutMandat() {
		return debutMandat;
	}
	public void setDebutMandat(Date debutMandat) {
		this.debutMandat = debutMandat;
	}
	public Date getFinMandat() {
		return finMandat;
	}
	public void setFinMandat(Date finMandat) {
		this.finMandat = finMandat;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	

}
