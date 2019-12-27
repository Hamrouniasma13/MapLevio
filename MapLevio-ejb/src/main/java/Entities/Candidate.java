package Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import Enumerates.*;
@Entity
public class Candidate extends User implements Serializable{
	
	private String cv;
	@Enumerated(EnumType.STRING)
	private EtatCandidate etat ;
	@ManyToOne
	@JoinColumn(name="testId")
	private Test test ;
	
	
	public Candidate() {
	}
	
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	public EtatCandidate getEtat() {
		return etat;
	}
	public void setEtat(EtatCandidate etat) {
		this.etat = etat;
	}
	
	
	

}
