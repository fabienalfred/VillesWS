/**
 * Ville.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package villes.entities;

public class Ville  implements java.io.Serializable {
    private java.lang.String codePostal;

    private java.lang.String departement;

    private long id;

    private double latitude;

    private double longitude;

    private java.lang.String nom;

    private java.lang.String region;

    public Ville() {
    }

    public Ville(
           java.lang.String codePostal,
           java.lang.String departement,
           long id,
           double latitude,
           double longitude,
           java.lang.String nom,
           java.lang.String region) {
           this.codePostal = codePostal;
           this.departement = departement;
           this.id = id;
           this.latitude = latitude;
           this.longitude = longitude;
           this.nom = nom;
           this.region = region;
    }


    /**
     * Gets the codePostal value for this Ville.
     * 
     * @return codePostal
     */
    public java.lang.String getCodePostal() {
        return codePostal;
    }


    /**
     * Sets the codePostal value for this Ville.
     * 
     * @param codePostal
     */
    public void setCodePostal(java.lang.String codePostal) {
        this.codePostal = codePostal;
    }


    /**
     * Gets the departement value for this Ville.
     * 
     * @return departement
     */
    public java.lang.String getDepartement() {
        return departement;
    }


    /**
     * Sets the departement value for this Ville.
     * 
     * @param departement
     */
    public void setDepartement(java.lang.String departement) {
        this.departement = departement;
    }


    /**
     * Gets the id value for this Ville.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Ville.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the latitude value for this Ville.
     * 
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this Ville.
     * 
     * @param latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this Ville.
     * 
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this Ville.
     * 
     * @param longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the nom value for this Ville.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Ville.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the region value for this Ville.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Ville.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ville)) return false;
        Ville other = (Ville) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codePostal==null && other.getCodePostal()==null) || 
             (this.codePostal!=null &&
              this.codePostal.equals(other.getCodePostal()))) &&
            ((this.departement==null && other.getDepartement()==null) || 
             (this.departement!=null &&
              this.departement.equals(other.getDepartement()))) &&
            this.id == other.getId() &&
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodePostal() != null) {
            _hashCode += getCodePostal().hashCode();
        }
        if (getDepartement() != null) {
            _hashCode += getDepartement().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        _hashCode += new Double(getLatitude()).hashCode();
        _hashCode += new Double(getLongitude()).hashCode();
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ville.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entities.villes", "Ville"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codePostal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entities.villes", "codePostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entities.villes", "departement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entities.villes", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entities.villes", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entities.villes", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entities.villes", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entities.villes", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
