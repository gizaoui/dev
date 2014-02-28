/*
 * An XML document type.
 * Localname: library
 * Namespace: http://namespace.com/library.xsd
 * Java type: com.namespace.library.LibraryDocument
 *
 * Automatically generated - do not modify.
 */
package com.namespace.library.impl;
/**
 * A document containing one library(@http://namespace.com/library.xsd) element.
 *
 * This is a complex type.
 */
public class LibraryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.library.LibraryDocument
{
    private static final long serialVersionUID = 1L;
    
    public LibraryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIBRARY$0 = 
        new javax.xml.namespace.QName("http://namespace.com/library.xsd", "library");
    
    
    /**
     * Gets the "library" element
     */
    public com.namespace.library.LibraryDocument.Library getLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.library.LibraryDocument.Library target = null;
            target = (com.namespace.library.LibraryDocument.Library)get_store().find_element_user(LIBRARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "library" element
     */
    public void setLibrary(com.namespace.library.LibraryDocument.Library library)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.library.LibraryDocument.Library target = null;
            target = (com.namespace.library.LibraryDocument.Library)get_store().find_element_user(LIBRARY$0, 0);
            if (target == null)
            {
                target = (com.namespace.library.LibraryDocument.Library)get_store().add_element_user(LIBRARY$0);
            }
            target.set(library);
        }
    }
    
    /**
     * Appends and returns a new empty "library" element
     */
    public com.namespace.library.LibraryDocument.Library addNewLibrary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.library.LibraryDocument.Library target = null;
            target = (com.namespace.library.LibraryDocument.Library)get_store().add_element_user(LIBRARY$0);
            return target;
        }
    }
    /**
     * An XML library(@http://namespace.com/library.xsd).
     *
     * This is a complex type.
     */
    public static class LibraryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.library.LibraryDocument.Library
    {
        private static final long serialVersionUID = 1L;
        
        public LibraryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BOOK$0 = 
            new javax.xml.namespace.QName("http://namespace.com/library.xsd", "book");
        
        
        /**
         * Gets array of all "book" elements
         */
        public com.namespace.library.Book[] getBookArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BOOK$0, targetList);
                com.namespace.library.Book[] result = new com.namespace.library.Book[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "book" element
         */
        public com.namespace.library.Book getBookArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.library.Book target = null;
                target = (com.namespace.library.Book)get_store().find_element_user(BOOK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "book" element
         */
        public int sizeOfBookArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOOK$0);
            }
        }
        
        /**
         * Sets array of all "book" element
         */
        public void setBookArray(com.namespace.library.Book[] bookArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bookArray, BOOK$0);
            }
        }
        
        /**
         * Sets ith "book" element
         */
        public void setBookArray(int i, com.namespace.library.Book book)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.library.Book target = null;
                target = (com.namespace.library.Book)get_store().find_element_user(BOOK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(book);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "book" element
         */
        public com.namespace.library.Book insertNewBook(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.library.Book target = null;
                target = (com.namespace.library.Book)get_store().insert_element_user(BOOK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "book" element
         */
        public com.namespace.library.Book addNewBook()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.namespace.library.Book target = null;
                target = (com.namespace.library.Book)get_store().add_element_user(BOOK$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "book" element
         */
        public void removeBook(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOOK$0, i);
            }
        }
    }
}
