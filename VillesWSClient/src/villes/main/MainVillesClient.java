package villes.main;

import java.rmi.RemoteException;

import javax.swing.JOptionPane;
import javax.xml.rpc.ServiceException;

import villes.entities.Ville;
import villes.facade.FranceFacade;
import villes.facade.FranceFacadeServiceLocator;

public class MainVillesClient {

	public static void main(String[] args) throws ServiceException, RemoteException {
		FranceFacadeServiceLocator locator = new FranceFacadeServiceLocator();
		FranceFacade facade = locator.getFranceFacade();

		String cp = JOptionPane.showInputDialog("Code postal ?");
		if (cp == null || cp.length() > 5) {
			System.out.println("Code postal : maximum 5 chiffres");
			return;
		} else {
			for (Ville v : facade.getVillesByCodePostal(cp)) {
				System.out.println(v.getCodePostal() + " : " + v.getNom() + ", " + v.getDepartement());
			}
		}
	}

}
