/*
 * XML Type:  CustomerType
 * Namespace: http://namespace.com/CustomerTypes
 * Java type: com.namespace.customerTypes.CustomerType
 *
 * Automatically generated - do not modify.
 */
package com.namespace.customerTypes.impl;
/**
 * An XML CustomerType(@http://namespace.com/CustomerTypes).
 *
 * This is a complex type.
 */
public class CustomerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.customerTypes.CustomerType
{
    private static final long serialVersionUID = 1L;
    
    public CustomerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://namespace.com/CustomerTypes", "Name");
    private static final javax.xml.namespace.QName DELIVERYADDRESS$2 = 
        new javax.xml.namespace.QName("http://namespace.com/CustomerTypes", "DeliveryAddress");
    private static final javax.xml.namespace.QName BILLINGADDRESS$4 = 
        new javax.xml.namespace.QName("http://namespace.com/CustomerTypes", "BillingAddress");
    
    
    /**
     * Gets the "Name" element
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
     * Gets (as xml) the "Name" element
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
     * Sets the "Name" element
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
     * Sets (as xml) the "Name" element
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
     * Gets the "DeliveryAddress" element
     */
    public com.namespace.commonTypes.AddressType getDeliveryAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.commonTypes.AddressType target = null;
            target = (com.namespace.commonTypes.AddressType)get_store().find_element_user(DELIVERYADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeliveryAddress" element
     */
    public void setDeliveryAddress(com.namespace.commonTypes.AddressType deliveryAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.commonTypes.AddressType target = null;
            target = (com.namespace.commonTypes.AddressType)get_store().find_element_user(DELIVERYADDRESS$2, 0);
            if (target == null)
            {
                target = (com.namespace.commonTypes.AddressType)get_store().add_element_user(DELIVERYADDRESS$2);
            }
            target.set(deliveryAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "DeliveryAddress" element
     */
    public com.namespace.commonTypes.AddressType addNewDeliveryAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.commonTypes.AddressType target = null;
            target = (com.namespace.commonTypes.AddressType)get_store().add_element_user(DELIVERYADDRESS$2);
            return target;
        }
    }
    
    /**
     * Gets the "BillingAddress" element
     */
    public com.namespace.commonTypes.AddressType getBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.commonTypes.AddressType target = null;
            target = (com.namespace.commonTypes.AddressType)get_store().find_element_user(BILLINGADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BillingAddress" element
     */
    public void setBillingAddress(com.namespace.commonTypes.AddressType billingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.commonTypes.AddressType target = null;
            target = (com.namespace.commonTypes.AddressType)get_store().find_element_user(BILLINGADDRESS$4, 0);
            if (target == null)
            {
                target = (com.namespace.commonTypes.AddressType)get_store().add_element_user(BILLINGADDRESS$4);
            }
            target.set(billingAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "BillingAddress" element
     */
    public com.namespace.commonTypes.AddressType addNewBillingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.commonTypes.AddressType target = null;
            target = (com.namespace.commonTypes.AddressType)get_store().add_element_user(BILLINGADDRESS$4);
            return target;
        }
    }
}
