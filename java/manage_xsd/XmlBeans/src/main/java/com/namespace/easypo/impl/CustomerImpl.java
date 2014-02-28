/*
 * XML Type:  customer
 * Namespace: http://namespace.com/easypo
 * Java type: com.namespace.easypo.Customer
 *
 * Automatically generated - do not modify.
 */
package com.namespace.easypo.impl;
/**
 * An XML customer(@http://namespace.com/easypo).
 *
 * This is a complex type.
 */
public class CustomerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.easypo.Customer
{
    private static final long serialVersionUID = 1L;
    
    public CustomerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://namespace.com/easypo", "name");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://namespace.com/easypo", "address");
    private static final javax.xml.namespace.QName AGE$4 = 
        new javax.xml.namespace.QName("", "age");
    private static final javax.xml.namespace.QName MOO$6 = 
        new javax.xml.namespace.QName("", "moo");
    private static final javax.xml.namespace.QName POO$8 = 
        new javax.xml.namespace.QName("", "poo");
    
    
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
     * Gets the "address" element
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$2);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "address" element
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$2);
            }
            target.set(address);
        }
    }
    
    /**
     * Gets the "age" attribute
     */
    public int getAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGE$4);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "age" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(AGE$4);
            return target;
        }
    }
    
    /**
     * True if has "age" attribute
     */
    public boolean isSetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AGE$4) != null;
        }
    }
    
    /**
     * Sets the "age" attribute
     */
    public void setAge(int age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGE$4);
            }
            target.setIntValue(age);
        }
    }
    
    /**
     * Sets (as xml) the "age" attribute
     */
    public void xsetAge(org.apache.xmlbeans.XmlInt age)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(AGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(AGE$4);
            }
            target.set(age);
        }
    }
    
    /**
     * Unsets the "age" attribute
     */
    public void unsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AGE$4);
        }
    }
    
    /**
     * Gets the "moo" attribute
     */
    public int getMoo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOO$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MOO$6);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "moo" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetMoo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MOO$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(MOO$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "moo" attribute
     */
    public boolean isSetMoo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MOO$6) != null;
        }
    }
    
    /**
     * Sets the "moo" attribute
     */
    public void setMoo(int moo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOO$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOO$6);
            }
            target.setIntValue(moo);
        }
    }
    
    /**
     * Sets (as xml) the "moo" attribute
     */
    public void xsetMoo(org.apache.xmlbeans.XmlInt moo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(MOO$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(MOO$6);
            }
            target.set(moo);
        }
    }
    
    /**
     * Unsets the "moo" attribute
     */
    public void unsetMoo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MOO$6);
        }
    }
    
    /**
     * Gets the "poo" attribute
     */
    public int getPoo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POO$8);
            }
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "poo" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPoo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(POO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_default_attribute_value(POO$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "poo" attribute
     */
    public boolean isSetPoo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POO$8) != null;
        }
    }
    
    /**
     * Sets the "poo" attribute
     */
    public void setPoo(int poo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POO$8);
            }
            target.setIntValue(poo);
        }
    }
    
    /**
     * Sets (as xml) the "poo" attribute
     */
    public void xsetPoo(org.apache.xmlbeans.XmlInt poo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(POO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(POO$8);
            }
            target.set(poo);
        }
    }
    
    /**
     * Unsets the "poo" attribute
     */
    public void unsetPoo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POO$8);
        }
    }
}
