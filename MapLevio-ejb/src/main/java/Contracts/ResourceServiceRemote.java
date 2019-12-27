package Contracts;

import java.util.List;

import javax.ejb.Remote;

import Entities.Resource;
import Entities.User;

@Remote
public interface ResourceServiceRemote {
	 void AjouterResource(Resource resource) ;
	 public void updateResource(Resource resource);
	 public void deleteResource(int id) ;
	 public List<Resource> findAllResources() ;
	 public Resource findResourceById(int id);

}
