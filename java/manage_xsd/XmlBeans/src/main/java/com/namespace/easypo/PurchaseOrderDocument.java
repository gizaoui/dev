/*
 * An XML document type.
 * Localname: purchase-order
 * Namespace: http://namespace.com/easypo
 * Java type: com.namespace.easypo.PurchaseOrderDocument
 *
 * Automatically generated - do not modify.
 */
package com.namespace.easypo;


/**
 * A document containing one purchase-order(@http://namespace.com/easypo) element.
 *
 * This is a complex type.
 */
public interface PurchaseOrderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PurchaseOrderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("purchaseorder92cfdoctype");
    
    /**
     * Gets the "purchase-order" element
     */
    com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder getPurchaseOrder();
    
    /**
     * Sets the "purchase-order" element
     */
    void setPurchaseOrder(com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder purchaseOrder);
    
    /**
     * Appends and returns a new empty "purchase-order" element
     */
    com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder addNewPurchaseOrder();
    
    /**
     * An XML purchase-order(@http://namespace.com/easypo).
     *
     * This is a complex type.
     */
    public interface PurchaseOrder extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PurchaseOrder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("purchaseorder3171elemtype");
        
        /**
         * Gets the "customer" element
         */
        com.namespace.easypo.Customer getCustomer();
        
        /**
         * Sets the "customer" element
         */
        void setCustomer(com.namespace.easypo.Customer customer);
        
        /**
         * Appends and returns a new empty "customer" element
         */
        com.namespace.easypo.Customer addNewCustomer();
        
        /**
         * Gets the "date" element
         */
        java.util.Calendar getDate();
        
        /**
         * Gets (as xml) the "date" element
         */
        org.apache.xmlbeans.XmlDateTime xgetDate();
        
        /**
         * Sets the "date" element
         */
        void setDate(java.util.Calendar date);
        
        /**
         * Sets (as xml) the "date" element
         */
        void xsetDate(org.apache.xmlbeans.XmlDateTime date);
        
        /**
         * Gets array of all "line-item" elements
         */
        com.namespace.easypo.LineItem[] getLineItemArray();
        
        /**
         * Gets ith "line-item" element
         */
        com.namespace.easypo.LineItem getLineItemArray(int i);
        
        /**
         * Returns number of "line-item" element
         */
        int sizeOfLineItemArray();
        
        /**
         * Sets array of all "line-item" element
         */
        void setLineItemArray(com.namespace.easypo.LineItem[] lineItemArray);
        
        /**
         * Sets ith "line-item" element
         */
        void setLineItemArray(int i, com.namespace.easypo.LineItem lineItem);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "line-item" element
         */
        com.namespace.easypo.LineItem insertNewLineItem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "line-item" element
         */
        com.namespace.easypo.LineItem addNewLineItem();
        
        /**
         * Removes the ith "line-item" element
         */
        void removeLineItem(int i);
        
        /**
         * Gets the "shipper" element
         */
        com.namespace.easypo.Shipper getShipper();
        
        /**
         * True if has "shipper" element
         */
        boolean isSetShipper();
        
        /**
         * Sets the "shipper" element
         */
        void setShipper(com.namespace.easypo.Shipper shipper);
        
        /**
         * Appends and returns a new empty "shipper" element
         */
        com.namespace.easypo.Shipper addNewShipper();
        
        /**
         * Unsets the "shipper" element
         */
        void unsetShipper();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder newInstance() {
              return (com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.namespace.easypo.PurchaseOrderDocument.PurchaseOrder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.namespace.easypo.PurchaseOrderDocument newInstance() {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.namespace.easypo.PurchaseOrderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.namespace.easypo.PurchaseOrderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.namespace.easypo.PurchaseOrderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.namespace.easypo.PurchaseOrderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
