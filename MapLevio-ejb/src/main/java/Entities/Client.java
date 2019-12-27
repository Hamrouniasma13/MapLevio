package Entities;
import Enumerates.*;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

@Entity
public class Client extends User implements Serializable {

	
	@Enumerated(EnumType.STRING)
	private ClientType clientType ;
	
	@Enumerated(EnumType.STRING)
	private ClientCategory clientCategory ;
	@OneToMany(mappedBy="client",cascade=CascadeType.REMOVE)
	private List<Project> listeProject ;

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public ClientCategory getClientCategory() {
		return clientCategory;
	}

	public void setClientCategory(ClientCategory clientCategory) {
		this.clientCategory = clientCategory;
	}
	
}
