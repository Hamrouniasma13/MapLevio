package Contracts;

import java.util.List;

import javax.ejb.Local;

import Entities.Resource;
import Entities.User;
@Local
public interface ResourceServiceLocal {

		 void AjouterResource(Resource resource) ;
		 public void updateResource(Resource resource);
		 public void deleteResource(int id) ;
		 public List<User> findAllResources() ;
		 public User findResourceById(int id);

	
}
