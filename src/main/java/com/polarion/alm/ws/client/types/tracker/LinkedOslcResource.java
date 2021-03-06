/**
 * LinkedOslcResource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class LinkedOslcResource  implements java.io.Serializable {
    private java.lang.String label;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId role;

    private java.lang.String uri;

    public LinkedOslcResource() {
    }

    public LinkedOslcResource(
           java.lang.String label,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId role,
           java.lang.String uri) {
           this.label = label;
           this.role = role;
           this.uri = uri;
    }


    /**
     * Gets the label value for this LinkedOslcResource.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this LinkedOslcResource.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the role value for this LinkedOslcResource.
     * 
     * @return role
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getRole() {
        return role;
    }


    /**
     * Sets the role value for this LinkedOslcResource.
     * 
     * @param role
     */
    public void setRole(com.polarion.alm.ws.client.types.tracker.EnumOptionId role) {
        this.role = role;
    }


    /**
     * Gets the uri value for this LinkedOslcResource.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this LinkedOslcResource.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkedOslcResource)) return false;
        LinkedOslcResource other = (LinkedOslcResource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinkedOslcResource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedOslcResource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "uri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
          new  com.polarion.alm.ws.client.internal.encoding.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
