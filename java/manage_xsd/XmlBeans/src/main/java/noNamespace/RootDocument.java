/*
 * An XML document type.
 * Localname: root
 * Namespace: 
 * Java type: noNamespace.RootDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one root(@) element.
 *
 * This is a complex type.
 */
public interface RootDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RootDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("roota4dbdoctype");
    
    /**
     * Gets the "root" element
     */
    noNamespace.RootDocument.Root getRoot();
    
    /**
     * Sets the "root" element
     */
    void setRoot(noNamespace.RootDocument.Root root);
    
    /**
     * Appends and returns a new empty "root" element
     */
    noNamespace.RootDocument.Root addNewRoot();
    
    /**
     * An XML root(@).
     *
     * This is a complex type.
     */
    public interface Root extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Root.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("root05adelemtype");
        
        /**
         * Gets the "Adresse" element
         */
        noNamespace.RootDocument.Root.Adresse getAdresse();
        
        /**
         * Sets the "Adresse" element
         */
        void setAdresse(noNamespace.RootDocument.Root.Adresse adresse);
        
        /**
         * Appends and returns a new empty "Adresse" element
         */
        noNamespace.RootDocument.Root.Adresse addNewAdresse();
        
        /**
         * Gets the "Corporation" element
         */
        noNamespace.RootDocument.Root.Corporation getCorporation();
        
        /**
         * Sets the "Corporation" element
         */
        void setCorporation(noNamespace.RootDocument.Root.Corporation corporation);
        
        /**
         * Appends and returns a new empty "Corporation" element
         */
        noNamespace.RootDocument.Root.Corporation addNewCorporation();
        
        /**
         * Gets the "People" element
         */
        noNamespace.RootDocument.Root.People getPeople();
        
        /**
         * Sets the "People" element
         */
        void setPeople(noNamespace.RootDocument.Root.People people);
        
        /**
         * Appends and returns a new empty "People" element
         */
        noNamespace.RootDocument.Root.People addNewPeople();
        
        /**
         * An XML Adresse(@).
         *
         * This is a complex type.
         */
        public interface Adresse extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Adresse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("adresse2b78elemtype");
            
            /**
             * Gets the "Name" element
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "Name" element
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * Sets the "Name" element
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "Name" element
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Gets the "DeliveryAddress" element
             */
            com.namespace.commonTypes.AddressType getDeliveryAddress();
            
            /**
             * Sets the "DeliveryAddress" element
             */
            void setDeliveryAddress(com.namespace.commonTypes.AddressType deliveryAddress);
            
            /**
             * Appends and returns a new empty "DeliveryAddress" element
             */
            com.namespace.commonTypes.AddressType addNewDeliveryAddress();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RootDocument.Root.Adresse newInstance() {
                  return (noNamespace.RootDocument.Root.Adresse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RootDocument.Root.Adresse newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RootDocument.Root.Adresse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Corporation(@).
         *
         * This is a complex type.
         */
        public interface Corporation extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Corporation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("corporation5f11elemtype");
            
            /**
             * Gets the "Name" element
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "Name" element
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * Sets the "Name" element
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "Name" element
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Gets the "Phone" element
             */
            java.lang.String getPhone();
            
            /**
             * Gets (as xml) the "Phone" element
             */
            org.apache.xmlbeans.XmlString xgetPhone();
            
            /**
             * Sets the "Phone" element
             */
            void setPhone(java.lang.String phone);
            
            /**
             * Sets (as xml) the "Phone" element
             */
            void xsetPhone(org.apache.xmlbeans.XmlString phone);
            
            /**
             * Gets the "Fax" element
             */
            java.lang.String getFax();
            
            /**
             * Gets (as xml) the "Fax" element
             */
            org.apache.xmlbeans.XmlString xgetFax();
            
            /**
             * Sets the "Fax" element
             */
            void setFax(java.lang.String fax);
            
            /**
             * Sets (as xml) the "Fax" element
             */
            void xsetFax(org.apache.xmlbeans.XmlString fax);
            
            /**
             * Gets the "Address" element
             */
            java.lang.String getAddress();
            
            /**
             * Gets (as xml) the "Address" element
             */
            org.apache.xmlbeans.XmlString xgetAddress();
            
            /**
             * Sets the "Address" element
             */
            void setAddress(java.lang.String address);
            
            /**
             * Sets (as xml) the "Address" element
             */
            void xsetAddress(org.apache.xmlbeans.XmlString address);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RootDocument.Root.Corporation newInstance() {
                  return (noNamespace.RootDocument.Root.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RootDocument.Root.Corporation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RootDocument.Root.Corporation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML People(@).
         *
         * This is a complex type.
         */
        public interface People extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(People.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("people65a8elemtype");
            
            /**
             * Gets array of all "Employee" elements
             */
            noNamespace.RootDocument.Root.People.Employee[] getEmployeeArray();
            
            /**
             * Gets ith "Employee" element
             */
            noNamespace.RootDocument.Root.People.Employee getEmployeeArray(int i);
            
            /**
             * Returns number of "Employee" element
             */
            int sizeOfEmployeeArray();
            
            /**
             * Sets array of all "Employee" element
             */
            void setEmployeeArray(noNamespace.RootDocument.Root.People.Employee[] employeeArray);
            
            /**
             * Sets ith "Employee" element
             */
            void setEmployeeArray(int i, noNamespace.RootDocument.Root.People.Employee employee);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Employee" element
             */
            noNamespace.RootDocument.Root.People.Employee insertNewEmployee(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Employee" element
             */
            noNamespace.RootDocument.Root.People.Employee addNewEmployee();
            
            /**
             * Removes the ith "Employee" element
             */
            void removeEmployee(int i);
            
            /**
             * An XML Employee(@).
             *
             * This is a complex type.
             */
            public interface Employee extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Employee.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("employeeb30eelemtype");
                
                /**
                 * Gets the "Name" element
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "Name" element
                 */
                org.apache.xmlbeans.XmlString xgetName();
                
                /**
                 * Sets the "Name" element
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "Name" element
                 */
                void xsetName(org.apache.xmlbeans.XmlString name);
                
                /**
                 * Gets the "US-W2" element
                 */
                noNamespace.RootDocument.Root.People.Employee.USW2 getUSW2();
                
                /**
                 * True if has "US-W2" element
                 */
                boolean isSetUSW2();
                
                /**
                 * Sets the "US-W2" element
                 */
                void setUSW2(noNamespace.RootDocument.Root.People.Employee.USW2 usw2);
                
                /**
                 * Appends and returns a new empty "US-W2" element
                 */
                noNamespace.RootDocument.Root.People.Employee.USW2 addNewUSW2();
                
                /**
                 * Unsets the "US-W2" element
                 */
                void unsetUSW2();
                
                /**
                 * Gets the "US-1099" element
                 */
                noNamespace.RootDocument.Root.People.Employee.US1099 getUS1099();
                
                /**
                 * True if has "US-1099" element
                 */
                boolean isSetUS1099();
                
                /**
                 * Sets the "US-1099" element
                 */
                void setUS1099(noNamespace.RootDocument.Root.People.Employee.US1099 us1099);
                
                /**
                 * Appends and returns a new empty "US-1099" element
                 */
                noNamespace.RootDocument.Root.People.Employee.US1099 addNewUS1099();
                
                /**
                 * Unsets the "US-1099" element
                 */
                void unsetUS1099();
                
                /**
                 * Gets the "Data" element
                 */
                noNamespace.RootDocument.Root.People.Employee.Data getData();
                
                /**
                 * Sets the "Data" element
                 */
                void setData(noNamespace.RootDocument.Root.People.Employee.Data data);
                
                /**
                 * Appends and returns a new empty "Data" element
                 */
                noNamespace.RootDocument.Root.People.Employee.Data addNewData();
                
                /**
                 * Gets the "TaxStatus" attribute
                 */
                noNamespace.ETaxStatus.Enum getTaxStatus();
                
                /**
                 * Gets (as xml) the "TaxStatus" attribute
                 */
                noNamespace.ETaxStatus xgetTaxStatus();
                
                /**
                 * Sets the "TaxStatus" attribute
                 */
                void setTaxStatus(noNamespace.ETaxStatus.Enum taxStatus);
                
                /**
                 * Sets (as xml) the "TaxStatus" attribute
                 */
                void xsetTaxStatus(noNamespace.ETaxStatus taxStatus);
                
                /**
                 * Gets the "Gender" attribute
                 */
                noNamespace.EGender.Enum getGender();
                
                /**
                 * Gets (as xml) the "Gender" attribute
                 */
                noNamespace.EGender xgetGender();
                
                /**
                 * Sets the "Gender" attribute
                 */
                void setGender(noNamespace.EGender.Enum gender);
                
                /**
                 * Sets (as xml) the "Gender" attribute
                 */
                void xsetGender(noNamespace.EGender gender);
                
                /**
                 * Gets the "Desc" attribute
                 */
                noNamespace.ELocation.Enum getDesc();
                
                /**
                 * Gets (as xml) the "Desc" attribute
                 */
                noNamespace.ELocation xgetDesc();
                
                /**
                 * Sets the "Desc" attribute
                 */
                void setDesc(noNamespace.ELocation.Enum desc);
                
                /**
                 * Sets (as xml) the "Desc" attribute
                 */
                void xsetDesc(noNamespace.ELocation desc);
                
                /**
                 * An XML US-W2(@).
                 *
                 * This is a complex type.
                 */
                public interface USW2 extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(USW2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("usw20854elemtype");
                    
                    /**
                     * Gets the "EmpNumber" element
                     */
                    int getEmpNumber();
                    
                    /**
                     * Gets (as xml) the "EmpNumber" element
                     */
                    org.apache.xmlbeans.XmlInt xgetEmpNumber();
                    
                    /**
                     * Sets the "EmpNumber" element
                     */
                    void setEmpNumber(int empNumber);
                    
                    /**
                     * Sets (as xml) the "EmpNumber" element
                     */
                    void xsetEmpNumber(org.apache.xmlbeans.XmlInt empNumber);
                    
                    /**
                     * Gets the "Manager" element
                     */
                    java.lang.String getManager();
                    
                    /**
                     * Gets (as xml) the "Manager" element
                     */
                    org.apache.xmlbeans.XmlString xgetManager();
                    
                    /**
                     * Sets the "Manager" element
                     */
                    void setManager(java.lang.String manager);
                    
                    /**
                     * Sets (as xml) the "Manager" element
                     */
                    void xsetManager(org.apache.xmlbeans.XmlString manager);
                    
                    /**
                     * Gets the "YearStart" element
                     */
                    java.lang.String getYearStart();
                    
                    /**
                     * Gets (as xml) the "YearStart" element
                     */
                    org.apache.xmlbeans.XmlString xgetYearStart();
                    
                    /**
                     * Sets the "YearStart" element
                     */
                    void setYearStart(java.lang.String yearStart);
                    
                    /**
                     * Sets (as xml) the "YearStart" element
                     */
                    void xsetYearStart(org.apache.xmlbeans.XmlString yearStart);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.RootDocument.Root.People.Employee.USW2 newInstance() {
                        return (noNamespace.RootDocument.Root.People.Employee.USW2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.RootDocument.Root.People.Employee.USW2 newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.RootDocument.Root.People.Employee.USW2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML US-1099(@).
                 *
                 * This is a complex type.
                 */
                public interface US1099 extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(US1099.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("us1099d858elemtype");
                    
                    /**
                     * Gets the "SsnNumber" element
                     */
                    java.lang.String getSsnNumber();
                    
                    /**
                     * Gets (as xml) the "SsnNumber" element
                     */
                    org.apache.xmlbeans.XmlString xgetSsnNumber();
                    
                    /**
                     * Sets the "SsnNumber" element
                     */
                    void setSsnNumber(java.lang.String ssnNumber);
                    
                    /**
                     * Sets (as xml) the "SsnNumber" element
                     */
                    void xsetSsnNumber(org.apache.xmlbeans.XmlString ssnNumber);
                    
                    /**
                     * Gets the "Phone" element
                     */
                    java.lang.String getPhone();
                    
                    /**
                     * Gets (as xml) the "Phone" element
                     */
                    org.apache.xmlbeans.XmlString xgetPhone();
                    
                    /**
                     * Sets the "Phone" element
                     */
                    void setPhone(java.lang.String phone);
                    
                    /**
                     * Sets (as xml) the "Phone" element
                     */
                    void xsetPhone(org.apache.xmlbeans.XmlString phone);
                    
                    /**
                     * Gets the "CorpName" element
                     */
                    java.lang.String getCorpName();
                    
                    /**
                     * Gets (as xml) the "CorpName" element
                     */
                    org.apache.xmlbeans.XmlString xgetCorpName();
                    
                    /**
                     * Sets the "CorpName" element
                     */
                    void setCorpName(java.lang.String corpName);
                    
                    /**
                     * Sets (as xml) the "CorpName" element
                     */
                    void xsetCorpName(org.apache.xmlbeans.XmlString corpName);
                    
                    /**
                     * Gets the "CorpAddress" element
                     */
                    java.lang.String getCorpAddress();
                    
                    /**
                     * Gets (as xml) the "CorpAddress" element
                     */
                    org.apache.xmlbeans.XmlString xgetCorpAddress();
                    
                    /**
                     * Sets the "CorpAddress" element
                     */
                    void setCorpAddress(java.lang.String corpAddress);
                    
                    /**
                     * Sets (as xml) the "CorpAddress" element
                     */
                    void xsetCorpAddress(org.apache.xmlbeans.XmlString corpAddress);
                    
                    /**
                     * Gets the "Relationship" element
                     */
                    noNamespace.ERelation.Enum getRelationship();
                    
                    /**
                     * Gets (as xml) the "Relationship" element
                     */
                    noNamespace.ERelation xgetRelationship();
                    
                    /**
                     * Sets the "Relationship" element
                     */
                    void setRelationship(noNamespace.ERelation.Enum relationship);
                    
                    /**
                     * Sets (as xml) the "Relationship" element
                     */
                    void xsetRelationship(noNamespace.ERelation relationship);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.RootDocument.Root.People.Employee.US1099 newInstance() {
                        return (noNamespace.RootDocument.Root.People.Employee.US1099) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.RootDocument.Root.People.Employee.US1099 newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.RootDocument.Root.People.Employee.US1099) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML Data(@).
                 *
                 * This is a complex type.
                 */
                public interface Data extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("data87e4elemtype");
                    
                    /**
                     * Gets the "WorkPhone" element
                     */
                    java.lang.String getWorkPhone();
                    
                    /**
                     * Gets (as xml) the "WorkPhone" element
                     */
                    org.apache.xmlbeans.XmlString xgetWorkPhone();
                    
                    /**
                     * Sets the "WorkPhone" element
                     */
                    void setWorkPhone(java.lang.String workPhone);
                    
                    /**
                     * Sets (as xml) the "WorkPhone" element
                     */
                    void xsetWorkPhone(org.apache.xmlbeans.XmlString workPhone);
                    
                    /**
                     * Gets the "CellPhone" element
                     */
                    java.lang.String getCellPhone();
                    
                    /**
                     * Gets (as xml) the "CellPhone" element
                     */
                    org.apache.xmlbeans.XmlString xgetCellPhone();
                    
                    /**
                     * Sets the "CellPhone" element
                     */
                    void setCellPhone(java.lang.String cellPhone);
                    
                    /**
                     * Sets (as xml) the "CellPhone" element
                     */
                    void xsetCellPhone(org.apache.xmlbeans.XmlString cellPhone);
                    
                    /**
                     * Gets the "Address" element
                     */
                    java.lang.String getAddress();
                    
                    /**
                     * Gets (as xml) the "Address" element
                     */
                    org.apache.xmlbeans.XmlString xgetAddress();
                    
                    /**
                     * Sets the "Address" element
                     */
                    void setAddress(java.lang.String address);
                    
                    /**
                     * Sets (as xml) the "Address" element
                     */
                    void xsetAddress(org.apache.xmlbeans.XmlString address);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.RootDocument.Root.People.Employee.Data newInstance() {
                        return (noNamespace.RootDocument.Root.People.Employee.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.RootDocument.Root.People.Employee.Data newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.RootDocument.Root.People.Employee.Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.RootDocument.Root.People.Employee newInstance() {
                      return (noNamespace.RootDocument.Root.People.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.RootDocument.Root.People.Employee newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.RootDocument.Root.People.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RootDocument.Root.People newInstance() {
                  return (noNamespace.RootDocument.Root.People) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RootDocument.Root.People newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RootDocument.Root.People) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.RootDocument.Root newInstance() {
              return (noNamespace.RootDocument.Root) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.RootDocument.Root newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.RootDocument.Root) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.RootDocument newInstance() {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.RootDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.RootDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.RootDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.RootDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.RootDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.RootDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.RootDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.RootDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.RootDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.RootDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.RootDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.RootDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.RootDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.RootDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.RootDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RootDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RootDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RootDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
