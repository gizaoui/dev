/*
 * XML Type:  OrderType
 * Namespace: http://namespace.com/OrderTypes
 * Java type: com.namespace.orderTypes.OrderType
 *
 * Automatically generated - do not modify.
 */
package com.namespace.orderTypes.impl;
/**
 * An XML OrderType(@http://namespace.com/OrderTypes).
 *
 * This is a complex type.
 */
public class OrderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.orderTypes.OrderType
{
    private static final long serialVersionUID = 1L;
    
    public OrderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEM$0 = 
        new javax.xml.namespace.QName("http://namespace.com/OrderTypes", "Item");
    
    
    /**
     * Gets array of all "Item" elements
     */
    public com.namespace.orderTypes.OrderType.Item[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$0, targetList);
            com.namespace.orderTypes.OrderType.Item[] result = new com.namespace.orderTypes.OrderType.Item[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Item" element
     */
    public com.namespace.orderTypes.OrderType.Item getItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.orderTypes.OrderType.Item target = null;
            target = (com.namespace.orderTypes.OrderType.Item)get_store().find_element_user(ITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Item" element
     */
    public int sizeOfItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$0);
        }
    }
    
    /**
     * Sets array of all "Item" element
     */
    public void setItemArray(com.namespace.orderTypes.OrderType.Item[] itemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(itemArray, ITEM$0);
        }
    }
    
    /**
     * Sets ith "Item" element
     */
    public void setItemArray(int i, com.namespace.orderTypes.OrderType.Item item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.orderTypes.OrderType.Item target = null;
            target = (com.namespace.orderTypes.OrderType.Item)get_store().find_element_user(ITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(item);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Item" element
     */
    public com.namespace.orderTypes.OrderType.Item insertNewItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.orderTypes.OrderType.Item target = null;
            target = (com.namespace.orderTypes.OrderType.Item)get_store().insert_element_user(ITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Item" element
     */
    public com.namespace.orderTypes.OrderType.Item addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.orderTypes.OrderType.Item target = null;
            target = (com.namespace.orderTypes.OrderType.Item)get_store().add_element_user(ITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Item" element
     */
    public void removeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$0, i);
        }
    }
    /**
     * An XML Item(@http://namespace.com/OrderTypes).
     *
     * This is a complex type.
     */
    public static class ItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.orderTypes.OrderType.Item
    {
        private static final long serialVersionUID = 1L;
        
        public ItemImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PRODUCTNAME$0 = 
            new javax.xml.namespace.QName("http://namespace.com/OrderTypes", "ProductName");
        private static final javax.xml.namespace.QName QUANTITY$2 = 
            new javax.xml.namespace.QName("http://namespace.com/OrderTypes", "Quantity");
        private static final javax.xml.namespace.QName UNITPRICE$4 = 
            new javax.xml.namespace.QName("http://namespace.com/OrderTypes", "UnitPrice");
        
        
        /**
         * Gets the "ProductName" element
         */
        public java.lang.String getProductName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ProductName" element
         */
        public org.apache.xmlbeans.XmlString xgetProductName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ProductName" element
         */
        public void setProductName(java.lang.String productName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNAME$0);
                }
                target.setStringValue(productName);
            }
        }
        
        /**
         * Sets (as xml) the "ProductName" element
         */
        public void xsetProductName(org.apache.xmlbeans.XmlString productName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTNAME$0);
                }
                target.set(productName);
            }
        }
        
        /**
         * Gets the "Quantity" element
         */
        public int getQuantity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "Quantity" element
         */
        public org.apache.xmlbeans.XmlInt xgetQuantity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Quantity" element
         */
        public void setQuantity(int quantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITY$2);
                }
                target.setIntValue(quantity);
            }
        }
        
        /**
         * Sets (as xml) the "Quantity" element
         */
        public void xsetQuantity(org.apache.xmlbeans.XmlInt quantity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(QUANTITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(QUANTITY$2);
                }
                target.set(quantity);
            }
        }
        
        /**
         * Gets the "UnitPrice" element
         */
        public java.math.BigDecimal getUnitPrice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITPRICE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigDecimalValue();
            }
        }
        
        /**
         * Gets (as xml) the "UnitPrice" element
         */
        public com.namespace.commonTypes.PriceType xgetUnitPrice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.commonTypes.PriceType target = null;
                target = (com.namespace.commonTypes.PriceType)get_store().find_element_user(UNITPRICE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "UnitPrice" element
         */
        public void setUnitPrice(java.math.BigDecimal unitPrice)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITPRICE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITPRICE$4);
                }
                target.setBigDecimalValue(unitPrice);
            }
        }
        
        /**
         * Sets (as xml) the "UnitPrice" element
         */
        public void xsetUnitPrice(com.namespace.commonTypes.PriceType unitPrice)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.commonTypes.PriceType target = null;
                target = (com.namespace.commonTypes.PriceType)get_store().find_element_user(UNITPRICE$4, 0);
                if (target == null)
                {
                    target = (com.namespace.commonTypes.PriceType)get_store().add_element_user(UNITPRICE$4);
                }
                target.set(unitPrice);
            }
        }
    }
}
