package villes.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import villes.entities.Ville;

public class VilleDAO {

	private EntityManagerFactory emf;
	
	public VilleDAO() {
		emf = Persistence.createEntityManagerFactory("france");
	}
	
	@SuppressWarnings("unchecked")
	public List<Ville> getVillesByCodePostal(String cp){
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("Ville.getVillesByCodePostal");
		query.setParameter("cp", cp+"%");
		List<Ville> villes = query.getResultList();
		em.close();
		return villes;
	}
	
}
