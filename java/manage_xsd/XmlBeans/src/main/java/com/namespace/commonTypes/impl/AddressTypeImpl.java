/*
 * XML Type:  AddressType
 * Namespace: http://namespace.com/CommonTypes
 * Java type: com.namespace.commonTypes.AddressType
 *
 * Automatically generated - do not modify.
 */
package com.namespace.commonTypes.impl;
/**
 * An XML AddressType(@http://namespace.com/CommonTypes).
 *
 * This is a complex type.
 */
public class AddressTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.commonTypes.AddressType
{
    private static final long serialVersionUID = 1L;
    
    public AddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINE1$0 = 
        new javax.xml.namespace.QName("http://namespace.com/CommonTypes", "Line1");
    private static final javax.xml.namespace.QName LINE2$2 = 
        new javax.xml.namespace.QName("http://namespace.com/CommonTypes", "Line2");
    
    
    /**
     * Gets the "Line1" element
     */
    public java.lang.String getLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Line1" element
     */
    public org.apache.xmlbeans.XmlString xgetLine1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE1$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Line1" element
     */
    public void setLine1(java.lang.String line1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE1$0);
            }
            target.setStringValue(line1);
        }
    }
    
    /**
     * Sets (as xml) the "Line1" element
     */
    public void xsetLine1(org.apache.xmlbeans.XmlString line1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE1$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINE1$0);
            }
            target.set(line1);
        }
    }
    
    /**
     * Gets the "Line2" element
     */
    public java.lang.String getLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Line2" element
     */
    public org.apache.xmlbeans.XmlString xgetLine2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE2$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Line2" element
     */
    public void setLine2(java.lang.String line2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINE2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINE2$2);
            }
            target.setStringValue(line2);
        }
    }
    
    /**
     * Sets (as xml) the "Line2" element
     */
    public void xsetLine2(org.apache.xmlbeans.XmlString line2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINE2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINE2$2);
            }
            target.set(line2);
        }
    }
}
