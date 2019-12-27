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
import javax.persistence.OneToMany;


@Entity
public class User  implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
private String nom ;
private String prenom ;
private String email ;
private String password ; 
private String image ;



@Enumerated(EnumType.STRING)
private  Role role ;
@Embedded
private Adresse adresse ;
private Date dateNaissance ;

@OneToMany(mappedBy = "sender", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
private List<Message> listeMessagesended;
@OneToMany(mappedBy = "receiver", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
private List<Message> listeMessagereceived;


public List<Message> getListeMessagesended() {
	return listeMessagesended;
}
public void setListeMessagesended(List<Message> listeMessagesended) {
	this.listeMessagesended = listeMessagesended;
}
public List<Message> getListeMessagereceived() {
	return listeMessagereceived;
}


public User(){}

public void setListeMessagereceived(List<Message> listeMessagereceived) {
	this.listeMessagereceived = listeMessagereceived;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
public Adresse getAdresse() {
	return adresse;
}
public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}
public Date getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}


}
