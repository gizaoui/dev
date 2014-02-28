/*
 * An XML document type.
 * Localname: Purchase
 * Namespace: http://namespace.com/Purchase
 * Java type: com.namespace.purchase.PurchaseDocument
 *
 * Automatically generated - do not modify.
 */
package com.namespace.purchase.impl;
/**
 * A document containing one Purchase(@http://namespace.com/Purchase) element.
 *
 * This is a complex type.
 */
public class PurchaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.purchase.PurchaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PurchaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PURCHASE$0 = 
        new javax.xml.namespace.QName("http://namespace.com/Purchase", "Purchase");
    
    
    /**
     * Gets the "Purchase" element
     */
    public com.namespace.purchase.PurchaseDocument.Purchase getPurchase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.purchase.PurchaseDocument.Purchase target = null;
            target = (com.namespace.purchase.PurchaseDocument.Purchase)get_store().find_element_user(PURCHASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Purchase" element
     */
    public void setPurchase(com.namespace.purchase.PurchaseDocument.Purchase purchase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.purchase.PurchaseDocument.Purchase target = null;
            target = (com.namespace.purchase.PurchaseDocument.Purchase)get_store().find_element_user(PURCHASE$0, 0);
            if (target == null)
            {
                target = (com.namespace.purchase.PurchaseDocument.Purchase)get_store().add_element_user(PURCHASE$0);
            }
            target.set(purchase);
        }
    }
    
    /**
     * Appends and returns a new empty "Purchase" element
     */
    public com.namespace.purchase.PurchaseDocument.Purchase addNewPurchase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.purchase.PurchaseDocument.Purchase target = null;
            target = (com.namespace.purchase.PurchaseDocument.Purchase)get_store().add_element_user(PURCHASE$0);
            return target;
        }
    }
    /**
     * An XML Purchase(@http://namespace.com/Purchase).
     *
     * This is a complex type.
     */
    public static class PurchaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.purchase.PurchaseDocument.Purchase
    {
        private static final long serialVersionUID = 1L;
        
        public PurchaseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORDERDETAIL$0 = 
            new javax.xml.namespace.QName("http://namespace.com/Purchase", "OrderDetail");
        private static final javax.xml.namespace.QName PAYMENTMETHOD$2 = 
            new javax.xml.namespace.QName("http://namespace.com/Purchase", "PaymentMethod");
        private static final javax.xml.namespace.QName CUSTOMERDETAILS$4 = 
            new javax.xml.namespace.QName("http://namespace.com/Purchase", "CustomerDetails");
        
        
        /**
         * Gets the "OrderDetail" element
         */
        public com.namespace.orderTypes.OrderType getOrderDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.orderTypes.OrderType target = null;
                target = (com.namespace.orderTypes.OrderType)get_store().find_element_user(ORDERDETAIL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OrderDetail" element
         */
        public void setOrderDetail(com.namespace.orderTypes.OrderType orderDetail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.orderTypes.OrderType target = null;
                target = (com.namespace.orderTypes.OrderType)get_store().find_element_user(ORDERDETAIL$0, 0);
                if (target == null)
                {
                    target = (com.namespace.orderTypes.OrderType)get_store().add_element_user(ORDERDETAIL$0);
                }
                target.set(orderDetail);
            }
        }
        
        /**
         * Appends and returns a new empty "OrderDetail" element
         */
        public com.namespace.orderTypes.OrderType addNewOrderDetail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.orderTypes.OrderType target = null;
                target = (com.namespace.orderTypes.OrderType)get_store().add_element_user(ORDERDETAIL$0);
                return target;
            }
        }
        
        /**
         * Gets the "PaymentMethod" element
         */
        public com.namespace.commonTypes.PaymentMethodType.Enum getPaymentMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTMETHOD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.namespace.commonTypes.PaymentMethodType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "PaymentMethod" element
         */
        public com.namespace.commonTypes.PaymentMethodType xgetPaymentMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.commonTypes.PaymentMethodType target = null;
                target = (com.namespace.commonTypes.PaymentMethodType)get_store().find_element_user(PAYMENTMETHOD$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PaymentMethod" element
         */
        public void setPaymentMethod(com.namespace.commonTypes.PaymentMethodType.Enum paymentMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAYMENTMETHOD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAYMENTMETHOD$2);
                }
                target.setEnumValue(paymentMethod);
            }
        }
        
        /**
         * Sets (as xml) the "PaymentMethod" element
         */
        public void xsetPaymentMethod(com.namespace.commonTypes.PaymentMethodType paymentMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.commonTypes.PaymentMethodType target = null;
                target = (com.namespace.commonTypes.PaymentMethodType)get_store().find_element_user(PAYMENTMETHOD$2, 0);
                if (target == null)
                {
                    target = (com.namespace.commonTypes.PaymentMethodType)get_store().add_element_user(PAYMENTMETHOD$2);
                }
                target.set(paymentMethod);
            }
        }
        
        /**
         * Gets the "CustomerDetails" element
         */
        public com.namespace.customerTypes.CustomerType getCustomerDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.customerTypes.CustomerType target = null;
                target = (com.namespace.customerTypes.CustomerType)get_store().find_element_user(CUSTOMERDETAILS$4, 0);
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
                target = (com.namespace.customerTypes.CustomerType)get_store().find_element_user(CUSTOMERDETAILS$4, 0);
                if (target == null)
                {
                    target = (com.namespace.customerTypes.CustomerType)get_store().add_element_user(CUSTOMERDETAILS$4);
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
                target = (com.namespace.customerTypes.CustomerType)get_store().add_element_user(CUSTOMERDETAILS$4);
                return target;
            }
        }
    }
}
