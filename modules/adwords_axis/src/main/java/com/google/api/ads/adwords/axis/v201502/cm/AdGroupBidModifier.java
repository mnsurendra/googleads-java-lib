/**
 * AdGroupBidModifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;


/**
 * Represents an adgroup level bid modifier override for campaign
 * level criterion
 *             bid modifier values.
 */
public class AdGroupBidModifier  implements java.io.Serializable {
    /* The campaign that the criterion is in. */
    private java.lang.Long campaignId;

    /* The adgroup that the bid modifier override is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* The criterion whose bid value is being overridden.
     *                 
     *                 Currently, only the HighEndMobile platform criterion
     * (ID=30001) is
     *                 supported.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201502.cm.Criterion criterion;

    /* The modifier for bids when the criterion matches.
     *                 
     *                 Valid modifier values for the mobile platform criterion
     * range from
     *                 {@code 0.1} to {@code 4.0}, with {@code 0} reserved
     * for opting out
     *                 of mobile.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span> */
    private java.lang.Double bidModifier;

    /* Bid modifier source.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201502.cm.BidModifierSource bidModifierSource;

    public AdGroupBidModifier() {
    }

    public AdGroupBidModifier(
           java.lang.Long campaignId,
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201502.cm.Criterion criterion,
           java.lang.Double bidModifier,
           com.google.api.ads.adwords.axis.v201502.cm.BidModifierSource bidModifierSource) {
           this.campaignId = campaignId;
           this.adGroupId = adGroupId;
           this.criterion = criterion;
           this.bidModifier = bidModifier;
           this.bidModifierSource = bidModifierSource;
    }


    /**
     * Gets the campaignId value for this AdGroupBidModifier.
     * 
     * @return campaignId   * The campaign that the criterion is in.
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this AdGroupBidModifier.
     * 
     * @param campaignId   * The campaign that the criterion is in.
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the adGroupId value for this AdGroupBidModifier.
     * 
     * @return adGroupId   * The adgroup that the bid modifier override is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupBidModifier.
     * 
     * @param adGroupId   * The adgroup that the bid modifier override is in.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the criterion value for this AdGroupBidModifier.
     * 
     * @return criterion   * The criterion whose bid value is being overridden.
     *                 
     *                 Currently, only the HighEndMobile platform criterion
     * (ID=30001) is
     *                 supported.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201502.cm.Criterion getCriterion() {
        return criterion;
    }


    /**
     * Sets the criterion value for this AdGroupBidModifier.
     * 
     * @param criterion   * The criterion whose bid value is being overridden.
     *                 
     *                 Currently, only the HighEndMobile platform criterion
     * (ID=30001) is
     *                 supported.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCriterion(com.google.api.ads.adwords.axis.v201502.cm.Criterion criterion) {
        this.criterion = criterion;
    }


    /**
     * Gets the bidModifier value for this AdGroupBidModifier.
     * 
     * @return bidModifier   * The modifier for bids when the criterion matches.
     *                 
     *                 Valid modifier values for the mobile platform criterion
     * range from
     *                 {@code 0.1} to {@code 4.0}, with {@code 0} reserved
     * for opting out
     *                 of mobile.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public java.lang.Double getBidModifier() {
        return bidModifier;
    }


    /**
     * Sets the bidModifier value for this AdGroupBidModifier.
     * 
     * @param bidModifier   * The modifier for bids when the criterion matches.
     *                 
     *                 Valid modifier values for the mobile platform criterion
     * range from
     *                 {@code 0.1} to {@code 4.0}, with {@code 0} reserved
     * for opting out
     *                 of mobile.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public void setBidModifier(java.lang.Double bidModifier) {
        this.bidModifier = bidModifier;
    }


    /**
     * Gets the bidModifierSource value for this AdGroupBidModifier.
     * 
     * @return bidModifierSource   * Bid modifier source.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201502.cm.BidModifierSource getBidModifierSource() {
        return bidModifierSource;
    }


    /**
     * Sets the bidModifierSource value for this AdGroupBidModifier.
     * 
     * @param bidModifierSource   * Bid modifier source.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBidModifierSource(com.google.api.ads.adwords.axis.v201502.cm.BidModifierSource bidModifierSource) {
        this.bidModifierSource = bidModifierSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupBidModifier)) return false;
        AdGroupBidModifier other = (AdGroupBidModifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.criterion==null && other.getCriterion()==null) || 
             (this.criterion!=null &&
              this.criterion.equals(other.getCriterion()))) &&
            ((this.bidModifier==null && other.getBidModifier()==null) || 
             (this.bidModifier!=null &&
              this.bidModifier.equals(other.getBidModifier()))) &&
            ((this.bidModifierSource==null && other.getBidModifierSource()==null) || 
             (this.bidModifierSource!=null &&
              this.bidModifierSource.equals(other.getBidModifierSource())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getCriterion() != null) {
            _hashCode += getCriterion().hashCode();
        }
        if (getBidModifier() != null) {
            _hashCode += getBidModifier().hashCode();
        }
        if (getBidModifierSource() != null) {
            _hashCode += getBidModifierSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupBidModifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "AdGroupBidModifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "criterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "Criterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "bidModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidModifierSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "bidModifierSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "BidModifierSource"));
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
