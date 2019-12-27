package Entities;
import Enumerates.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Project implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectId;
	
	
	@Enumerated(EnumType.STRING)
	private ProjectType ProjectType ;
	
	private int nbrResource;
	private String projectName;
	@Embedded
	private Adresse adresse;
	private String photo;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	@ManyToOne
	@JoinColumn(name="client" ,referencedColumnName="userId",insertable=false,updatable=false)
	private Client client ;
	
	@OneToMany(mappedBy = "project", cascade = CascadeType.REMOVE)
	private List<Mandate> listeMandate;
	
	
	public List<Mandate> getListeMandate() {
		return listeMandate;
	}
	public void setListeMandate(List<Mandate> listeMandate) {
		this.listeMandate = listeMandate;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public ProjectType getProjectType() {
		return ProjectType;
	}
	public void setProjectType(ProjectType projectType) {
		ProjectType = projectType;
	}
	public int getNbrResource() {
		return nbrResource;
	}
	public void setNbrResource(int nbrResource) {
		this.nbrResource = nbrResource;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
	



}
