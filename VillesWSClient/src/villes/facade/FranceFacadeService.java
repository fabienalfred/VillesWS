/**
 * FranceFacadeService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package villes.facade;

public interface FranceFacadeService extends javax.xml.rpc.Service {
    public java.lang.String getFranceFacadeAddress();

    public villes.facade.FranceFacade getFranceFacade() throws javax.xml.rpc.ServiceException;

    public villes.facade.FranceFacade getFranceFacade(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
