/*
 * An XML document type.
 * Localname: purchase-order
 * Namespace: http://namespace.com/easypo
 * Java type: com.namespace.easypo.PurchaseOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.namespace.easypo.impl;
/**
 * A document containing one purchase-order(@http://namespace.com/easypo) element.
 *
 * This is a complex type.
 */
public class PurchaseOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.easypo.PurchaseOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public PurchaseOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PURCHASEORDER$0 = 
        new javax.xml.namespace.QName("http://namespace.com/easypo", "purchase-order");
    
    
    /**
     * Gets the "purchase-order" element
     */
    public com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder getPurchaseOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder target = null;
            target = (com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder)get_store().find_element_user(PURCHASEORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "purchase-order" element
     */
    public void setPurchaseOrder(com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder purchaseOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder target = null;
            target = (com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder)get_store().find_element_user(PURCHASEORDER$0, 0);
            if (target == null)
            {
                target = (com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder)get_store().add_element_user(PURCHASEORDER$0);
            }
            target.set(purchaseOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "purchase-order" element
     */
    public com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder addNewPurchaseOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder target = null;
            target = (com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder)get_store().add_element_user(PURCHASEORDER$0);
            return target;
        }
    }
    /**
     * An XML purchase-order(@http://namespace.com/easypo).
     *
     * This is a complex type.
     */
    public static class PurchaseOrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder
    {
        private static final long serialVersionUID = 1L;
        
        public PurchaseOrderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CUSTOMER$0 = 
            new javax.xml.namespace.QName("http://namespace.com/easypo", "customer");
        private static final javax.xml.namespace.QName DATE$2 = 
            new javax.xml.namespace.QName("http://namespace.com/easypo", "date");
        private static final javax.xml.namespace.QName LINEITEM$4 = 
            new javax.xml.namespace.QName("http://namespace.com/easypo", "line-item");
        private static final javax.xml.namespace.QName SHIPPER$6 = 
            new javax.xml.namespace.QName("http://namespace.com/easypo", "shipper");
        
        
        /**
         * Gets the "customer" element
         */
        public com.namespace.easypo.Customer getCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.Customer target = null;
                target = (com.namespace.easypo.Customer)get_store().find_element_user(CUSTOMER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "customer" element
         */
        public void setCustomer(com.namespace.easypo.Customer customer)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.Customer target = null;
                target = (com.namespace.easypo.Customer)get_store().find_element_user(CUSTOMER$0, 0);
                if (target == null)
                {
                    target = (com.namespace.easypo.Customer)get_store().add_element_user(CUSTOMER$0);
                }
                target.set(customer);
            }
        }
        
        /**
         * Appends and returns a new empty "customer" element
         */
        public com.namespace.easypo.Customer addNewCustomer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.Customer target = null;
                target = (com.namespace.easypo.Customer)get_store().add_element_user(CUSTOMER$0);
                return target;
            }
        }
        
        /**
         * Gets the "date" element
         */
        public java.util.Calendar getDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "date" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "date" element
         */
        public void setDate(java.util.Calendar date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$2);
                }
                target.setCalendarValue(date);
            }
        }
        
        /**
         * Sets (as xml) the "date" element
         */
        public void xsetDate(org.apache.xmlbeans.XmlDateTime date)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATE$2);
                }
                target.set(date);
            }
        }
        
        /**
         * Gets array of all "line-item" elements
         */
        public com.namespace.easypo.LineItem[] getLineItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINEITEM$4, targetList);
                com.namespace.easypo.LineItem[] result = new com.namespace.easypo.LineItem[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "line-item" element
         */
        public com.namespace.easypo.LineItem getLineItemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.LineItem target = null;
                target = (com.namespace.easypo.LineItem)get_store().find_element_user(LINEITEM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "line-item" element
         */
        public int sizeOfLineItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINEITEM$4);
            }
        }
        
        /**
         * Sets array of all "line-item" element
         */
        public void setLineItemArray(com.namespace.easypo.LineItem[] lineItemArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(lineItemArray, LINEITEM$4);
            }
        }
        
        /**
         * Sets ith "line-item" element
         */
        public void setLineItemArray(int i, com.namespace.easypo.LineItem lineItem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.LineItem target = null;
                target = (com.namespace.easypo.LineItem)get_store().find_element_user(LINEITEM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(lineItem);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "line-item" element
         */
        public com.namespace.easypo.LineItem insertNewLineItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.LineItem target = null;
                target = (com.namespace.easypo.LineItem)get_store().insert_element_user(LINEITEM$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "line-item" element
         */
        public com.namespace.easypo.LineItem addNewLineItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.LineItem target = null;
                target = (com.namespace.easypo.LineItem)get_store().add_element_user(LINEITEM$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "line-item" element
         */
        public void removeLineItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINEITEM$4, i);
            }
        }
        
        /**
         * Gets the "shipper" element
         */
        public com.namespace.easypo.Shipper getShipper()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.Shipper target = null;
                target = (com.namespace.easypo.Shipper)get_store().find_element_user(SHIPPER$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "shipper" element
         */
        public boolean isSetShipper()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHIPPER$6) != 0;
            }
        }
        
        /**
         * Sets the "shipper" element
         */
        public void setShipper(com.namespace.easypo.Shipper shipper)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.Shipper target = null;
                target = (com.namespace.easypo.Shipper)get_store().find_element_user(SHIPPER$6, 0);
                if (target == null)
                {
                    target = (com.namespace.easypo.Shipper)get_store().add_element_user(SHIPPER$6);
                }
                target.set(shipper);
            }
        }
        
        /**
         * Appends and returns a new empty "shipper" element
         */
        public com.namespace.easypo.Shipper addNewShipper()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.easypo.Shipper target = null;
                target = (com.namespace.easypo.Shipper)get_store().add_element_user(SHIPPER$6);
                return target;
            }
        }
        
        /**
         * Unsets the "shipper" element
         */
        public void unsetShipper()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHIPPER$6, 0);
            }
        }
    }
}
