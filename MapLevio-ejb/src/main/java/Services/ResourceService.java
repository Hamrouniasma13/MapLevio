package Services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import Contracts.ResourceServiceRemote;
import Contracts.ResourceServiceLocal;
import Entities.Resource;
import Entities.User;

@Stateless
public class ResourceService implements ResourceServiceRemote {

	
	@PersistenceContext(unitName="MapLevio-ejb")
	EntityManager em;
	
	@Override
	public void AjouterResource(Resource resource) {
           em.persist(resource);
    }

	@Override
	public void updateResource(Resource resource) {
		em.merge(resource);
		
	}

	@Override
	public Resource findResourceById(int id) {
		Resource resource=em.find(Resource.class, id);
		return resource;
	}
	
	@Override
	public void deleteResource(int id) {
		em.remove(findResourceById(id));
		
	}

	@Override
	public List<Resource> findAllResources() {
		TypedQuery<Resource> query= em.createQuery("select r from Resource r",Resource.class);
		return  query.getResultList();
	}

	

}
