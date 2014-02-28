/*
 * XML Type:  OrderType
 * Namespace: http://namespace.com/OrderTypes
 * Java type: com.namespace.orderTypes.OrderType
 *
 * Automatically generated - do not modify.
 */
package com.namespace.orderTypes;


/**
 * An XML OrderType(@http://namespace.com/OrderTypes).
 *
 * This is a complex type.
 */
public interface OrderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("ordertype633dtype");
    
    /**
     * Gets array of all "Item" elements
     */
    com.namespace.orderTypes.OrderType.Item[] getItemArray();
    
    /**
     * Gets ith "Item" element
     */
    com.namespace.orderTypes.OrderType.Item getItemArray(int i);
    
    /**
     * Returns number of "Item" element
     */
    int sizeOfItemArray();
    
    /**
     * Sets array of all "Item" element
     */
    void setItemArray(com.namespace.orderTypes.OrderType.Item[] itemArray);
    
    /**
     * Sets ith "Item" element
     */
    void setItemArray(int i, com.namespace.orderTypes.OrderType.Item item);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Item" element
     */
    com.namespace.orderTypes.OrderType.Item insertNewItem(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Item" element
     */
    com.namespace.orderTypes.OrderType.Item addNewItem();
    
    /**
     * Removes the ith "Item" element
     */
    void removeItem(int i);
    
    /**
     * An XML Item(@http://namespace.com/OrderTypes).
     *
     * This is a complex type.
     */
    public interface Item extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("item148celemtype");
        
        /**
         * Gets the "ProductName" element
         */
        java.lang.String getProductName();
        
        /**
         * Gets (as xml) the "ProductName" element
         */
        org.apache.xmlbeans.XmlString xgetProductName();
        
        /**
         * Sets the "ProductName" element
         */
        void setProductName(java.lang.String productName);
        
        /**
         * Sets (as xml) the "ProductName" element
         */
        void xsetProductName(org.apache.xmlbeans.XmlString productName);
        
        /**
         * Gets the "Quantity" element
         */
        int getQuantity();
        
        /**
         * Gets (as xml) the "Quantity" element
         */
        org.apache.xmlbeans.XmlInt xgetQuantity();
        
        /**
         * Sets the "Quantity" element
         */
        void setQuantity(int quantity);
        
        /**
         * Sets (as xml) the "Quantity" element
         */
        void xsetQuantity(org.apache.xmlbeans.XmlInt quantity);
        
        /**
         * Gets the "UnitPrice" element
         */
        java.math.BigDecimal getUnitPrice();
        
        /**
         * Gets (as xml) the "UnitPrice" element
         */
        com.namespace.commonTypes.PriceType xgetUnitPrice();
        
        /**
         * Sets the "UnitPrice" element
         */
        void setUnitPrice(java.math.BigDecimal unitPrice);
        
        /**
         * Sets (as xml) the "UnitPrice" element
         */
        void xsetUnitPrice(com.namespace.commonTypes.PriceType unitPrice);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.namespace.orderTypes.OrderType.Item newInstance() {
              return (com.namespace.orderTypes.OrderType.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.namespace.orderTypes.OrderType.Item newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.namespace.orderTypes.OrderType.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.namespace.orderTypes.OrderType newInstance() {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.namespace.orderTypes.OrderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.namespace.orderTypes.OrderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.namespace.orderTypes.OrderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.namespace.orderTypes.OrderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.namespace.orderTypes.OrderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.namespace.orderTypes.OrderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.namespace.orderTypes.OrderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.namespace.orderTypes.OrderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.namespace.orderTypes.OrderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.namespace.orderTypes.OrderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.namespace.orderTypes.OrderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.namespace.orderTypes.OrderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.namespace.orderTypes.OrderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.namespace.orderTypes.OrderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.namespace.orderTypes.OrderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.namespace.orderTypes.OrderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.namespace.orderTypes.OrderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.namespace.orderTypes.OrderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
