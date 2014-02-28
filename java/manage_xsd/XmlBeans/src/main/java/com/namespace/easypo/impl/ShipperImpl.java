/*
 * XML Type:  shipper
 * Namespace: http://namespace.com/easypo
 * Java type: com.namespace.easypo.Shipper
 *
 * Automatically generated - do not modify.
 */
package com.namespace.easypo.impl;
/**
 * An XML shipper(@http://namespace.com/easypo).
 *
 * This is a complex type.
 */
public class ShipperImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.easypo.Shipper
{
    private static final long serialVersionUID = 1L;
    
    public ShipperImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://namespace.com/easypo", "name");
    private static final javax.xml.namespace.QName PEROUNCERATE$2 = 
        new javax.xml.namespace.QName("http://namespace.com/easypo", "per-ounce-rate");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "per-ounce-rate" element
     */
    public java.math.BigDecimal getPerOunceRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PEROUNCERATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "per-ounce-rate" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPerOunceRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PEROUNCERATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "per-ounce-rate" element
     */
    public void setPerOunceRate(java.math.BigDecimal perOunceRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PEROUNCERATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PEROUNCERATE$2);
            }
            target.setBigDecimalValue(perOunceRate);
        }
    }
    
    /**
     * Sets (as xml) the "per-ounce-rate" element
     */
    public void xsetPerOunceRate(org.apache.xmlbeans.XmlDecimal perOunceRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PEROUNCERATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PEROUNCERATE$2);
            }
            target.set(perOunceRate);
        }
    }
}
