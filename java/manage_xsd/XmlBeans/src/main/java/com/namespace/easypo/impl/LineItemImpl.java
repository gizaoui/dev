/*
 * XML Type:  line-item
 * Namespace: http://namespace.com/easypo
 * Java type: com.namespace.easypo.LineItem
 *
 * Automatically generated - do not modify.
 */
package com.namespace.easypo.impl;
/**
 * An XML line-item(@http://namespace.com/easypo).
 *
 * This is a complex type.
 */
public class LineItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.easypo.LineItem
{
    private static final long serialVersionUID = 1L;
    
    public LineItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://namespace.com/easypo", "description");
    private static final javax.xml.namespace.QName PERUNITOUNCES$2 = 
        new javax.xml.namespace.QName("http://namespace.com/easypo", "per-unit-ounces");
    private static final javax.xml.namespace.QName PRICE$4 = 
        new javax.xml.namespace.QName("http://namespace.com/easypo", "price");
    private static final javax.xml.namespace.QName QUANTITY$6 = 
        new javax.xml.namespace.QName("http://namespace.com/easypo", "quantity");
    
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "per-unit-ounces" element
     */
    public java.math.BigDecimal getPerUnitOunces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERUNITOUNCES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "per-unit-ounces" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPerUnitOunces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PERUNITOUNCES$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "per-unit-ounces" element
     */
    public void setPerUnitOunces(java.math.BigDecimal perUnitOunces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERUNITOUNCES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERUNITOUNCES$2);
            }
            target.setBigDecimalValue(perUnitOunces);
        }
    }
    
    /**
     * Sets (as xml) the "per-unit-ounces" element
     */
    public void xsetPerUnitOunces(org.apache.xmlbeans.XmlDecimal perUnitOunces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PERUNITOUNCES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PERUNITOUNCES$2);
            }
            target.set(perUnitOunces);
        }
    }
    
    /**
     * Gets the "price" element
     */
    public java.math.BigDecimal getPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "price" element
     */
    public org.apache.xmlbeans.XmlDecimal xgetPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "price" element
     */
    public void setPrice(java.math.BigDecimal price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICE$4);
            }
            target.setBigDecimalValue(price);
        }
    }
    
    /**
     * Sets (as xml) the "price" element
     */
    public void xsetPrice(org.apache.xmlbeans.XmlDecimal price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_element_user(PRICE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_element_user(PRICE$4);
            }
            target.set(price);
        }
    }
    
    /**
     * Gets the "quantity" element
     */
    public java.math.BigInteger getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "quantity" element
     */
    public org.apache.xmlbeans.XmlInteger xgetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(QUANTITY$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(java.math.BigInteger quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$6);
            }
            target.setBigIntegerValue(quantity);
        }
    }
    
    /**
     * Sets (as xml) the "quantity" element
     */
    public void xsetQuantity(org.apache.xmlbeans.XmlInteger quantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(QUANTITY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(QUANTITY$6);
            }
            target.set(quantity);
        }
    }
}
