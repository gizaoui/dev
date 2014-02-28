/*
 * An XML document type.
 * Localname: CustomerDetails
 * Namespace: http://namespace.com/Purchase
 * Java type: com.namespace.purchase.CustomerDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.namespace.purchase.impl;
/**
 * A document containing one CustomerDetails(@http://namespace.com/Purchase) element.
 *
 * This is a complex type.
 */
public class CustomerDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.purchase.CustomerDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CustomerDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUSTOMERDETAILS$0 = 
        new javax.xml.namespace.QName("http://namespace.com/Purchase", "CustomerDetails");
    
    
    /**
     * Gets the "CustomerDetails" element
     */
    public com.namespace.customerTypes.CustomerType getCustomerDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.customerTypes.CustomerType target = null;
            target = (com.namespace.customerTypes.CustomerType)get_store().find_element_user(CUSTOMERDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CustomerDetails" element
     */
    public void setCustomerDetails(com.namespace.customerTypes.CustomerType customerDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.customerTypes.CustomerType target = null;
            target = (com.namespace.customerTypes.CustomerType)get_store().find_element_user(CUSTOMERDETAILS$0, 0);
            if (target == null)
            {
                target = (com.namespace.customerTypes.CustomerType)get_store().add_element_user(CUSTOMERDETAILS$0);
            }
            target.set(customerDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "CustomerDetails" element
     */
    public com.namespace.customerTypes.CustomerType addNewCustomerDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.customerTypes.CustomerType target = null;
            target = (com.namespace.customerTypes.CustomerType)get_store().add_element_user(CUSTOMERDETAILS$0);
            return target;
        }
    }
}
