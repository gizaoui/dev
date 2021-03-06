/*
 * XML Type:  CustomerType
 * Namespace: http://namespace.com/CustomerTypes
 * Java type: com.namespace.customerTypes.CustomerType
 *
 * Automatically generated - do not modify.
 */
package com.namespace.customerTypes;


/**
 * An XML CustomerType(@http://namespace.com/CustomerTypes).
 *
 * This is a complex type.
 */
public interface CustomerType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CustomerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3024467ACF6D5258A2FB53B9E144DDED").resolveHandle("customertype6747type");
    
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
     * Gets the "BillingAddress" element
     */
    com.namespace.commonTypes.AddressType getBillingAddress();
    
    /**
     * Sets the "BillingAddress" element
     */
    void setBillingAddress(com.namespace.commonTypes.AddressType billingAddress);
    
    /**
     * Appends and returns a new empty "BillingAddress" element
     */
    com.namespace.commonTypes.AddressType addNewBillingAddress();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.namespace.customerTypes.CustomerType newInstance() {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.namespace.customerTypes.CustomerType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.namespace.customerTypes.CustomerType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.namespace.customerTypes.CustomerType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.namespace.customerTypes.CustomerType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.namespace.customerTypes.CustomerType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.namespace.customerTypes.CustomerType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.namespace.customerTypes.CustomerType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.namespace.customerTypes.CustomerType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.namespace.customerTypes.CustomerType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.namespace.customerTypes.CustomerType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.namespace.customerTypes.CustomerType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.namespace.customerTypes.CustomerType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.namespace.customerTypes.CustomerType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.namespace.customerTypes.CustomerType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.namespace.customerTypes.CustomerType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.namespace.customerTypes.CustomerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.namespace.customerTypes.CustomerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.namespace.customerTypes.CustomerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
