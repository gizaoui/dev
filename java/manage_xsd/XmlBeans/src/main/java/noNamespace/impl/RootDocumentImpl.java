/*
 * An XML document type.
 * Localname: root
 * Namespace: 
 * Java type: noNamespace.RootDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one root(@) element.
 *
 * This is a complex type.
 */
public class RootDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument
{
    private static final long serialVersionUID = 1L;
    
    public RootDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("", "root");
    
    
    /**
     * Gets the "root" element
     */
    public noNamespace.RootDocument.Root getRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RootDocument.Root target = null;
            target = (noNamespace.RootDocument.Root)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "root" element
     */
    public void setRoot(noNamespace.RootDocument.Root root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RootDocument.Root target = null;
            target = (noNamespace.RootDocument.Root)get_store().find_element_user(ROOT$0, 0);
            if (target == null)
            {
                target = (noNamespace.RootDocument.Root)get_store().add_element_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Appends and returns a new empty "root" element
     */
    public noNamespace.RootDocument.Root addNewRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RootDocument.Root target = null;
            target = (noNamespace.RootDocument.Root)get_store().add_element_user(ROOT$0);
            return target;
        }
    }
    /**
     * An XML root(@).
     *
     * This is a complex type.
     */
    public static class RootImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root
    {
        private static final long serialVersionUID = 1L;
        
        public RootImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADRESSE$0 = 
            new javax.xml.namespace.QName("", "Adresse");
        private static final javax.xml.namespace.QName CORPORATION$2 = 
            new javax.xml.namespace.QName("", "Corporation");
        private static final javax.xml.namespace.QName PEOPLE$4 = 
            new javax.xml.namespace.QName("", "People");
        
        
        /**
         * Gets the "Adresse" element
         */
        public noNamespace.RootDocument.Root.Adresse getAdresse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.Adresse target = null;
                target = (noNamespace.RootDocument.Root.Adresse)get_store().find_element_user(ADRESSE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Adresse" element
         */
        public void setAdresse(noNamespace.RootDocument.Root.Adresse adresse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.Adresse target = null;
                target = (noNamespace.RootDocument.Root.Adresse)get_store().find_element_user(ADRESSE$0, 0);
                if (target == null)
                {
                    target = (noNamespace.RootDocument.Root.Adresse)get_store().add_element_user(ADRESSE$0);
                }
                target.set(adresse);
            }
        }
        
        /**
         * Appends and returns a new empty "Adresse" element
         */
        public noNamespace.RootDocument.Root.Adresse addNewAdresse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.Adresse target = null;
                target = (noNamespace.RootDocument.Root.Adresse)get_store().add_element_user(ADRESSE$0);
                return target;
            }
        }
        
        /**
         * Gets the "Corporation" element
         */
        public noNamespace.RootDocument.Root.Corporation getCorporation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.Corporation target = null;
                target = (noNamespace.RootDocument.Root.Corporation)get_store().find_element_user(CORPORATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Corporation" element
         */
        public void setCorporation(noNamespace.RootDocument.Root.Corporation corporation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.Corporation target = null;
                target = (noNamespace.RootDocument.Root.Corporation)get_store().find_element_user(CORPORATION$2, 0);
                if (target == null)
                {
                    target = (noNamespace.RootDocument.Root.Corporation)get_store().add_element_user(CORPORATION$2);
                }
                target.set(corporation);
            }
        }
        
        /**
         * Appends and returns a new empty "Corporation" element
         */
        public noNamespace.RootDocument.Root.Corporation addNewCorporation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.Corporation target = null;
                target = (noNamespace.RootDocument.Root.Corporation)get_store().add_element_user(CORPORATION$2);
                return target;
            }
        }
        
        /**
         * Gets the "People" element
         */
        public noNamespace.RootDocument.Root.People getPeople()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.People target = null;
                target = (noNamespace.RootDocument.Root.People)get_store().find_element_user(PEOPLE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "People" element
         */
        public void setPeople(noNamespace.RootDocument.Root.People people)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.People target = null;
                target = (noNamespace.RootDocument.Root.People)get_store().find_element_user(PEOPLE$4, 0);
                if (target == null)
                {
                    target = (noNamespace.RootDocument.Root.People)get_store().add_element_user(PEOPLE$4);
                }
                target.set(people);
            }
        }
        
        /**
         * Appends and returns a new empty "People" element
         */
        public noNamespace.RootDocument.Root.People addNewPeople()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RootDocument.Root.People target = null;
                target = (noNamespace.RootDocument.Root.People)get_store().add_element_user(PEOPLE$4);
                return target;
            }
        }
        /**
         * An XML Adresse(@).
         *
         * This is a complex type.
         */
        public static class AdresseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root.Adresse
        {
            private static final long serialVersionUID = 1L;
            
            public AdresseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("", "Name");
            private static final javax.xml.namespace.QName DELIVERYADDRESS$2 = 
                new javax.xml.namespace.QName("", "DeliveryAddress");
            
            
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
        }
        /**
         * An XML Corporation(@).
         *
         * This is a complex type.
         */
        public static class CorporationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root.Corporation
        {
            private static final long serialVersionUID = 1L;
            
            public CorporationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("", "Name");
            private static final javax.xml.namespace.QName PHONE$2 = 
                new javax.xml.namespace.QName("", "Phone");
            private static final javax.xml.namespace.QName FAX$4 = 
                new javax.xml.namespace.QName("", "Fax");
            private static final javax.xml.namespace.QName ADDRESS$6 = 
                new javax.xml.namespace.QName("", "Address");
            
            
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
             * Gets the "Phone" element
             */
            public java.lang.String getPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Phone" element
             */
            public org.apache.xmlbeans.XmlString xgetPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Phone" element
             */
            public void setPhone(java.lang.String phone)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$2);
                    }
                    target.setStringValue(phone);
                }
            }
            
            /**
             * Sets (as xml) the "Phone" element
             */
            public void xsetPhone(org.apache.xmlbeans.XmlString phone)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$2);
                    }
                    target.set(phone);
                }
            }
            
            /**
             * Gets the "Fax" element
             */
            public java.lang.String getFax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Fax" element
             */
            public org.apache.xmlbeans.XmlString xgetFax()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Fax" element
             */
            public void setFax(java.lang.String fax)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$4);
                    }
                    target.setStringValue(fax);
                }
            }
            
            /**
             * Sets (as xml) the "Fax" element
             */
            public void xsetFax(org.apache.xmlbeans.XmlString fax)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$4);
                    }
                    target.set(fax);
                }
            }
            
            /**
             * Gets the "Address" element
             */
            public java.lang.String getAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Address" element
             */
            public org.apache.xmlbeans.XmlString xgetAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Address" element
             */
            public void setAddress(java.lang.String address)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$6);
                    }
                    target.setStringValue(address);
                }
            }
            
            /**
             * Sets (as xml) the "Address" element
             */
            public void xsetAddress(org.apache.xmlbeans.XmlString address)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$6);
                    }
                    target.set(address);
                }
            }
        }
        /**
         * An XML People(@).
         *
         * This is a complex type.
         */
        public static class PeopleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root.People
        {
            private static final long serialVersionUID = 1L;
            
            public PeopleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EMPLOYEE$0 = 
                new javax.xml.namespace.QName("", "Employee");
            
            
            /**
             * Gets array of all "Employee" elements
             */
            public noNamespace.RootDocument.Root.People.Employee[] getEmployeeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(EMPLOYEE$0, targetList);
                    noNamespace.RootDocument.Root.People.Employee[] result = new noNamespace.RootDocument.Root.People.Employee[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Employee" element
             */
            public noNamespace.RootDocument.Root.People.Employee getEmployeeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RootDocument.Root.People.Employee target = null;
                    target = (noNamespace.RootDocument.Root.People.Employee)get_store().find_element_user(EMPLOYEE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Employee" element
             */
            public int sizeOfEmployeeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EMPLOYEE$0);
                }
            }
            
            /**
             * Sets array of all "Employee" element
             */
            public void setEmployeeArray(noNamespace.RootDocument.Root.People.Employee[] employeeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(employeeArray, EMPLOYEE$0);
                }
            }
            
            /**
             * Sets ith "Employee" element
             */
            public void setEmployeeArray(int i, noNamespace.RootDocument.Root.People.Employee employee)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RootDocument.Root.People.Employee target = null;
                    target = (noNamespace.RootDocument.Root.People.Employee)get_store().find_element_user(EMPLOYEE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(employee);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Employee" element
             */
            public noNamespace.RootDocument.Root.People.Employee insertNewEmployee(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RootDocument.Root.People.Employee target = null;
                    target = (noNamespace.RootDocument.Root.People.Employee)get_store().insert_element_user(EMPLOYEE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Employee" element
             */
            public noNamespace.RootDocument.Root.People.Employee addNewEmployee()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RootDocument.Root.People.Employee target = null;
                    target = (noNamespace.RootDocument.Root.People.Employee)get_store().add_element_user(EMPLOYEE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Employee" element
             */
            public void removeEmployee(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EMPLOYEE$0, i);
                }
            }
            /**
             * An XML Employee(@).
             *
             * This is a complex type.
             */
            public static class EmployeeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root.People.Employee
            {
                private static final long serialVersionUID = 1L;
                
                public EmployeeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NAME$0 = 
                    new javax.xml.namespace.QName("", "Name");
                private static final javax.xml.namespace.QName USW2$2 = 
                    new javax.xml.namespace.QName("", "US-W2");
                private static final javax.xml.namespace.QName US1099$4 = 
                    new javax.xml.namespace.QName("", "US-1099");
                private static final javax.xml.namespace.QName DATA$6 = 
                    new javax.xml.namespace.QName("", "Data");
                private static final javax.xml.namespace.QName TAXSTATUS$8 = 
                    new javax.xml.namespace.QName("", "TaxStatus");
                private static final javax.xml.namespace.QName GENDER$10 = 
                    new javax.xml.namespace.QName("", "Gender");
                private static final javax.xml.namespace.QName DESC$12 = 
                    new javax.xml.namespace.QName("", "Desc");
                
                
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
                 * Gets the "US-W2" element
                 */
                public noNamespace.RootDocument.Root.People.Employee.USW2 getUSW2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.RootDocument.Root.People.Employee.USW2 target = null;
                      target = (noNamespace.RootDocument.Root.People.Employee.USW2)get_store().find_element_user(USW2$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "US-W2" element
                 */
                public boolean isSetUSW2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(USW2$2) != 0;
                    }
                }
                
                /**
                 * Sets the "US-W2" element
                 */
                public void setUSW2(noNamespace.RootDocument.Root.People.Employee.USW2 usw2)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.RootDocument.Root.People.Employee.USW2 target = null;
                      target = (noNamespace.RootDocument.Root.People.Employee.USW2)get_store().find_element_user(USW2$2, 0);
                      if (target == null)
                      {
                        target = (noNamespace.RootDocument.Root.People.Employee.USW2)get_store().add_element_user(USW2$2);
                      }
                      target.set(usw2);
                    }
                }
                
                /**
                 * Appends and returns a new empty "US-W2" element
                 */
                public noNamespace.RootDocument.Root.People.Employee.USW2 addNewUSW2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.RootDocument.Root.People.Employee.USW2 target = null;
                      target = (noNamespace.RootDocument.Root.People.Employee.USW2)get_store().add_element_user(USW2$2);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "US-W2" element
                 */
                public void unsetUSW2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(USW2$2, 0);
                    }
                }
                
                /**
                 * Gets the "US-1099" element
                 */
                public noNamespace.RootDocument.Root.People.Employee.US1099 getUS1099()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.RootDocument.Root.People.Employee.US1099 target = null;
                      target = (noNamespace.RootDocument.Root.People.Employee.US1099)get_store().find_element_user(US1099$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "US-1099" element
                 */
                public boolean isSetUS1099()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(US1099$4) != 0;
                    }
                }
                
                /**
                 * Sets the "US-1099" element
                 */
                public void setUS1099(noNamespace.RootDocument.Root.People.Employee.US1099 us1099)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.RootDocument.Root.People.Employee.US1099 target = null;
                      target = (noNamespace.RootDocument.Root.People.Employee.US1099)get_store().find_element_user(US1099$4, 0);
                      if (target == null)
                      {
                        target = (noNamespace.RootDocument.Root.People.Employee.US1099)get_store().add_element_user(US1099$4);
                      }
                      target.set(us1099);
                    }
                }
                
                /**
                 * Appends and returns a new empty "US-1099" element
                 */
                public noNamespace.RootDocument.Root.People.Employee.US1099 addNewUS1099()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.RootDocument.Root.People.Employee.US1099 target = null;
                      target = (noNamespace.RootDocument.Root.People.Employee.US1099)get_store().add_element_user(US1099$4);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "US-1099" element
                 */
                public void unsetUS1099()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(US1099$4, 0);
                    }
                }
                
                /**
                 * Gets the "Data" element
                 */
                public noNamespace.RootDocument.Root.People.Employee.Data getData()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.RootDocument.Root.People.Employee.Data target = null;
                      target = (noNamespace.RootDocument.Root.People.Employee.Data)get_store().find_element_user(DATA$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Data" element
                 */
                public void setData(noNamespace.RootDocument.Root.People.Employee.Data data)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.RootDocument.Root.People.Employee.Data target = null;
                      target = (noNamespace.RootDocument.Root.People.Employee.Data)get_store().find_element_user(DATA$6, 0);
                      if (target == null)
                      {
                        target = (noNamespace.RootDocument.Root.People.Employee.Data)get_store().add_element_user(DATA$6);
                      }
                      target.set(data);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Data" element
                 */
                public noNamespace.RootDocument.Root.People.Employee.Data addNewData()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.RootDocument.Root.People.Employee.Data target = null;
                      target = (noNamespace.RootDocument.Root.People.Employee.Data)get_store().add_element_user(DATA$6);
                      return target;
                    }
                }
                
                /**
                 * Gets the "TaxStatus" attribute
                 */
                public noNamespace.ETaxStatus.Enum getTaxStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAXSTATUS$8);
                      if (target == null)
                      {
                        return null;
                      }
                      return (noNamespace.ETaxStatus.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TaxStatus" attribute
                 */
                public noNamespace.ETaxStatus xgetTaxStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ETaxStatus target = null;
                      target = (noNamespace.ETaxStatus)get_store().find_attribute_user(TAXSTATUS$8);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TaxStatus" attribute
                 */
                public void setTaxStatus(noNamespace.ETaxStatus.Enum taxStatus)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TAXSTATUS$8);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TAXSTATUS$8);
                      }
                      target.setEnumValue(taxStatus);
                    }
                }
                
                /**
                 * Sets (as xml) the "TaxStatus" attribute
                 */
                public void xsetTaxStatus(noNamespace.ETaxStatus taxStatus)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ETaxStatus target = null;
                      target = (noNamespace.ETaxStatus)get_store().find_attribute_user(TAXSTATUS$8);
                      if (target == null)
                      {
                        target = (noNamespace.ETaxStatus)get_store().add_attribute_user(TAXSTATUS$8);
                      }
                      target.set(taxStatus);
                    }
                }
                
                /**
                 * Gets the "Gender" attribute
                 */
                public noNamespace.EGender.Enum getGender()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENDER$10);
                      if (target == null)
                      {
                        return null;
                      }
                      return (noNamespace.EGender.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Gender" attribute
                 */
                public noNamespace.EGender xgetGender()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EGender target = null;
                      target = (noNamespace.EGender)get_store().find_attribute_user(GENDER$10);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Gender" attribute
                 */
                public void setGender(noNamespace.EGender.Enum gender)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GENDER$10);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GENDER$10);
                      }
                      target.setEnumValue(gender);
                    }
                }
                
                /**
                 * Sets (as xml) the "Gender" attribute
                 */
                public void xsetGender(noNamespace.EGender gender)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EGender target = null;
                      target = (noNamespace.EGender)get_store().find_attribute_user(GENDER$10);
                      if (target == null)
                      {
                        target = (noNamespace.EGender)get_store().add_attribute_user(GENDER$10);
                      }
                      target.set(gender);
                    }
                }
                
                /**
                 * Gets the "Desc" attribute
                 */
                public noNamespace.ELocation.Enum getDesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$12);
                      if (target == null)
                      {
                        return null;
                      }
                      return (noNamespace.ELocation.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Desc" attribute
                 */
                public noNamespace.ELocation xgetDesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ELocation target = null;
                      target = (noNamespace.ELocation)get_store().find_attribute_user(DESC$12);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Desc" attribute
                 */
                public void setDesc(noNamespace.ELocation.Enum desc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESC$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESC$12);
                      }
                      target.setEnumValue(desc);
                    }
                }
                
                /**
                 * Sets (as xml) the "Desc" attribute
                 */
                public void xsetDesc(noNamespace.ELocation desc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.ELocation target = null;
                      target = (noNamespace.ELocation)get_store().find_attribute_user(DESC$12);
                      if (target == null)
                      {
                        target = (noNamespace.ELocation)get_store().add_attribute_user(DESC$12);
                      }
                      target.set(desc);
                    }
                }
                /**
                 * An XML US-W2(@).
                 *
                 * This is a complex type.
                 */
                public static class USW2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root.People.Employee.USW2
                {
                    private static final long serialVersionUID = 1L;
                    
                    public USW2Impl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName EMPNUMBER$0 = 
                      new javax.xml.namespace.QName("", "EmpNumber");
                    private static final javax.xml.namespace.QName MANAGER$2 = 
                      new javax.xml.namespace.QName("", "Manager");
                    private static final javax.xml.namespace.QName YEARSTART$4 = 
                      new javax.xml.namespace.QName("", "YearStart");
                    
                    
                    /**
                     * Gets the "EmpNumber" element
                     */
                    public int getEmpNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPNUMBER$0, 0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "EmpNumber" element
                     */
                    public org.apache.xmlbeans.XmlInt xgetEmpNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInt target = null;
                        target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EMPNUMBER$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "EmpNumber" element
                     */
                    public void setEmpNumber(int empNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPNUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPNUMBER$0);
                        }
                        target.setIntValue(empNumber);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "EmpNumber" element
                     */
                    public void xsetEmpNumber(org.apache.xmlbeans.XmlInt empNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInt target = null;
                        target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EMPNUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EMPNUMBER$0);
                        }
                        target.set(empNumber);
                      }
                    }
                    
                    /**
                     * Gets the "Manager" element
                     */
                    public java.lang.String getManager()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Manager" element
                     */
                    public org.apache.xmlbeans.XmlString xgetManager()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGER$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Manager" element
                     */
                    public void setManager(java.lang.String manager)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANAGER$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANAGER$2);
                        }
                        target.setStringValue(manager);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Manager" element
                     */
                    public void xsetManager(org.apache.xmlbeans.XmlString manager)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANAGER$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANAGER$2);
                        }
                        target.set(manager);
                      }
                    }
                    
                    /**
                     * Gets the "YearStart" element
                     */
                    public java.lang.String getYearStart()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARSTART$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "YearStart" element
                     */
                    public org.apache.xmlbeans.XmlString xgetYearStart()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEARSTART$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "YearStart" element
                     */
                    public void setYearStart(java.lang.String yearStart)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARSTART$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEARSTART$4);
                        }
                        target.setStringValue(yearStart);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "YearStart" element
                     */
                    public void xsetYearStart(org.apache.xmlbeans.XmlString yearStart)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEARSTART$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YEARSTART$4);
                        }
                        target.set(yearStart);
                      }
                    }
                }
                /**
                 * An XML US-1099(@).
                 *
                 * This is a complex type.
                 */
                public static class US1099Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root.People.Employee.US1099
                {
                    private static final long serialVersionUID = 1L;
                    
                    public US1099Impl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName SSNNUMBER$0 = 
                      new javax.xml.namespace.QName("", "SsnNumber");
                    private static final javax.xml.namespace.QName PHONE$2 = 
                      new javax.xml.namespace.QName("", "Phone");
                    private static final javax.xml.namespace.QName CORPNAME$4 = 
                      new javax.xml.namespace.QName("", "CorpName");
                    private static final javax.xml.namespace.QName CORPADDRESS$6 = 
                      new javax.xml.namespace.QName("", "CorpAddress");
                    private static final javax.xml.namespace.QName RELATIONSHIP$8 = 
                      new javax.xml.namespace.QName("", "Relationship");
                    
                    
                    /**
                     * Gets the "SsnNumber" element
                     */
                    public java.lang.String getSsnNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SSNNUMBER$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "SsnNumber" element
                     */
                    public org.apache.xmlbeans.XmlString xgetSsnNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SSNNUMBER$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "SsnNumber" element
                     */
                    public void setSsnNumber(java.lang.String ssnNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SSNNUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SSNNUMBER$0);
                        }
                        target.setStringValue(ssnNumber);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "SsnNumber" element
                     */
                    public void xsetSsnNumber(org.apache.xmlbeans.XmlString ssnNumber)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SSNNUMBER$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SSNNUMBER$0);
                        }
                        target.set(ssnNumber);
                      }
                    }
                    
                    /**
                     * Gets the "Phone" element
                     */
                    public java.lang.String getPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Phone" element
                     */
                    public org.apache.xmlbeans.XmlString xgetPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Phone" element
                     */
                    public void setPhone(java.lang.String phone)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$2);
                        }
                        target.setStringValue(phone);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Phone" element
                     */
                    public void xsetPhone(org.apache.xmlbeans.XmlString phone)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$2);
                        }
                        target.set(phone);
                      }
                    }
                    
                    /**
                     * Gets the "CorpName" element
                     */
                    public java.lang.String getCorpName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPNAME$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "CorpName" element
                     */
                    public org.apache.xmlbeans.XmlString xgetCorpName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPNAME$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "CorpName" element
                     */
                    public void setCorpName(java.lang.String corpName)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPNAME$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORPNAME$4);
                        }
                        target.setStringValue(corpName);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CorpName" element
                     */
                    public void xsetCorpName(org.apache.xmlbeans.XmlString corpName)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPNAME$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPNAME$4);
                        }
                        target.set(corpName);
                      }
                    }
                    
                    /**
                     * Gets the "CorpAddress" element
                     */
                    public java.lang.String getCorpAddress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPADDRESS$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "CorpAddress" element
                     */
                    public org.apache.xmlbeans.XmlString xgetCorpAddress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPADDRESS$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "CorpAddress" element
                     */
                    public void setCorpAddress(java.lang.String corpAddress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORPADDRESS$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORPADDRESS$6);
                        }
                        target.setStringValue(corpAddress);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CorpAddress" element
                     */
                    public void xsetCorpAddress(org.apache.xmlbeans.XmlString corpAddress)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORPADDRESS$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORPADDRESS$6);
                        }
                        target.set(corpAddress);
                      }
                    }
                    
                    /**
                     * Gets the "Relationship" element
                     */
                    public noNamespace.ERelation.Enum getRelationship()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIP$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return (noNamespace.ERelation.Enum)target.getEnumValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Relationship" element
                     */
                    public noNamespace.ERelation xgetRelationship()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.ERelation target = null;
                        target = (noNamespace.ERelation)get_store().find_element_user(RELATIONSHIP$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Relationship" element
                     */
                    public void setRelationship(noNamespace.ERelation.Enum relationship)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATIONSHIP$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATIONSHIP$8);
                        }
                        target.setEnumValue(relationship);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Relationship" element
                     */
                    public void xsetRelationship(noNamespace.ERelation relationship)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        noNamespace.ERelation target = null;
                        target = (noNamespace.ERelation)get_store().find_element_user(RELATIONSHIP$8, 0);
                        if (target == null)
                        {
                          target = (noNamespace.ERelation)get_store().add_element_user(RELATIONSHIP$8);
                        }
                        target.set(relationship);
                      }
                    }
                }
                /**
                 * An XML Data(@).
                 *
                 * This is a complex type.
                 */
                public static class DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RootDocument.Root.People.Employee.Data
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DataImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName WORKPHONE$0 = 
                      new javax.xml.namespace.QName("", "WorkPhone");
                    private static final javax.xml.namespace.QName CELLPHONE$2 = 
                      new javax.xml.namespace.QName("", "CellPhone");
                    private static final javax.xml.namespace.QName ADDRESS$4 = 
                      new javax.xml.namespace.QName("", "Address");
                    
                    
                    /**
                     * Gets the "WorkPhone" element
                     */
                    public java.lang.String getWorkPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKPHONE$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "WorkPhone" element
                     */
                    public org.apache.xmlbeans.XmlString xgetWorkPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKPHONE$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "WorkPhone" element
                     */
                    public void setWorkPhone(java.lang.String workPhone)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WORKPHONE$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WORKPHONE$0);
                        }
                        target.setStringValue(workPhone);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "WorkPhone" element
                     */
                    public void xsetWorkPhone(org.apache.xmlbeans.XmlString workPhone)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WORKPHONE$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WORKPHONE$0);
                        }
                        target.set(workPhone);
                      }
                    }
                    
                    /**
                     * Gets the "CellPhone" element
                     */
                    public java.lang.String getCellPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLPHONE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "CellPhone" element
                     */
                    public org.apache.xmlbeans.XmlString xgetCellPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLPHONE$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "CellPhone" element
                     */
                    public void setCellPhone(java.lang.String cellPhone)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CELLPHONE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CELLPHONE$2);
                        }
                        target.setStringValue(cellPhone);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "CellPhone" element
                     */
                    public void xsetCellPhone(org.apache.xmlbeans.XmlString cellPhone)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CELLPHONE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CELLPHONE$2);
                        }
                        target.set(cellPhone);
                      }
                    }
                    
                    /**
                     * Gets the "Address" element
                     */
                    public java.lang.String getAddress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Address" element
                     */
                    public org.apache.xmlbeans.XmlString xgetAddress()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Address" element
                     */
                    public void setAddress(java.lang.String address)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$4);
                        }
                        target.setStringValue(address);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Address" element
                     */
                    public void xsetAddress(org.apache.xmlbeans.XmlString address)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$4);
                        }
                        target.set(address);
                      }
                    }
                }
            }
        }
    }
}
