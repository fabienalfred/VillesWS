/**
 * FranceFacade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package villes.facade;

public interface FranceFacade extends java.rmi.Remote {
    public villes.entities.Ville[] getVillesByCodePostal(java.lang.String cp) throws java.rmi.RemoteException;
}
