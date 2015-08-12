/**
 * FranceFacadeServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package villes.facade;

public class FranceFacadeServiceLocator extends org.apache.axis.client.Service implements villes.facade.FranceFacadeService {

    public FranceFacadeServiceLocator() {
    }


    public FranceFacadeServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FranceFacadeServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FranceFacade
    private java.lang.String FranceFacade_address = "http://localhost:8080/VillesWS/services/FranceFacade";

    public java.lang.String getFranceFacadeAddress() {
        return FranceFacade_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FranceFacadeWSDDServiceName = "FranceFacade";

    public java.lang.String getFranceFacadeWSDDServiceName() {
        return FranceFacadeWSDDServiceName;
    }

    public void setFranceFacadeWSDDServiceName(java.lang.String name) {
        FranceFacadeWSDDServiceName = name;
    }

    public villes.facade.FranceFacade getFranceFacade() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FranceFacade_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFranceFacade(endpoint);
    }

    public villes.facade.FranceFacade getFranceFacade(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            villes.facade.FranceFacadeSoapBindingStub _stub = new villes.facade.FranceFacadeSoapBindingStub(portAddress, this);
            _stub.setPortName(getFranceFacadeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFranceFacadeEndpointAddress(java.lang.String address) {
        FranceFacade_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (villes.facade.FranceFacade.class.isAssignableFrom(serviceEndpointInterface)) {
                villes.facade.FranceFacadeSoapBindingStub _stub = new villes.facade.FranceFacadeSoapBindingStub(new java.net.URL(FranceFacade_address), this);
                _stub.setPortName(getFranceFacadeWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FranceFacade".equals(inputPortName)) {
            return getFranceFacade();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://facade.villes", "FranceFacadeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://facade.villes", "FranceFacade"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FranceFacade".equals(portName)) {
            setFranceFacadeEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
