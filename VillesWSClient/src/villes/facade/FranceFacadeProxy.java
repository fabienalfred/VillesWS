package villes.facade;

public class FranceFacadeProxy implements villes.facade.FranceFacade {
  private String _endpoint = null;
  private villes.facade.FranceFacade franceFacade = null;
  
  public FranceFacadeProxy() {
    _initFranceFacadeProxy();
  }
  
  public FranceFacadeProxy(String endpoint) {
    _endpoint = endpoint;
    _initFranceFacadeProxy();
  }
  
  private void _initFranceFacadeProxy() {
    try {
      franceFacade = (new villes.facade.FranceFacadeServiceLocator()).getFranceFacade();
      if (franceFacade != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)franceFacade)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)franceFacade)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (franceFacade != null)
      ((javax.xml.rpc.Stub)franceFacade)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public villes.facade.FranceFacade getFranceFacade() {
    if (franceFacade == null)
      _initFranceFacadeProxy();
    return franceFacade;
  }
  
  public villes.entities.Ville[] getVillesByCodePostal(java.lang.String cp) throws java.rmi.RemoteException{
    if (franceFacade == null)
      _initFranceFacadeProxy();
    return franceFacade.getVillesByCodePostal(cp);
  }
  
  
}