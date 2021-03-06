/**
 * SiteDirectoryDfaSiteMappingResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class SiteDirectoryDfaSiteMappingResult  implements java.io.Serializable {
    private long dfaSiteId;

    private java.lang.String errorMessage;

    private long siteDirectorySiteId;

    public SiteDirectoryDfaSiteMappingResult() {
    }

    public SiteDirectoryDfaSiteMappingResult(
           long dfaSiteId,
           java.lang.String errorMessage,
           long siteDirectorySiteId) {
           this.dfaSiteId = dfaSiteId;
           this.errorMessage = errorMessage;
           this.siteDirectorySiteId = siteDirectorySiteId;
    }


    /**
     * Gets the dfaSiteId value for this SiteDirectoryDfaSiteMappingResult.
     * 
     * @return dfaSiteId
     */
    public long getDfaSiteId() {
        return dfaSiteId;
    }


    /**
     * Sets the dfaSiteId value for this SiteDirectoryDfaSiteMappingResult.
     * 
     * @param dfaSiteId
     */
    public void setDfaSiteId(long dfaSiteId) {
        this.dfaSiteId = dfaSiteId;
    }


    /**
     * Gets the errorMessage value for this SiteDirectoryDfaSiteMappingResult.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this SiteDirectoryDfaSiteMappingResult.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the siteDirectorySiteId value for this SiteDirectoryDfaSiteMappingResult.
     * 
     * @return siteDirectorySiteId
     */
    public long getSiteDirectorySiteId() {
        return siteDirectorySiteId;
    }


    /**
     * Sets the siteDirectorySiteId value for this SiteDirectoryDfaSiteMappingResult.
     * 
     * @param siteDirectorySiteId
     */
    public void setSiteDirectorySiteId(long siteDirectorySiteId) {
        this.siteDirectorySiteId = siteDirectorySiteId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteDirectoryDfaSiteMappingResult)) return false;
        SiteDirectoryDfaSiteMappingResult other = (SiteDirectoryDfaSiteMappingResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dfaSiteId == other.getDfaSiteId() &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            this.siteDirectorySiteId == other.getSiteDirectorySiteId();
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
        _hashCode += new Long(getDfaSiteId()).hashCode();
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        _hashCode += new Long(getSiteDirectorySiteId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteDirectoryDfaSiteMappingResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SiteDirectoryDfaSiteMappingResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfaSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dfaSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteDirectorySiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteDirectorySiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
