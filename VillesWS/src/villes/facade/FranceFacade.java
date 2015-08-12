package villes.facade;

import java.util.List;

import villes.dao.VilleDAO;
import villes.entities.Ville;

public class FranceFacade {

	public Ville[] getVillesByCodePostal(String cp){
		VilleDAO dao = new VilleDAO();
		List<Ville> villes = dao.getVillesByCodePostal(cp);
		return villes.toArray(new Ville[]{});
	}
	
}
