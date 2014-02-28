/*
 * XML Type:  book
 * Namespace: http://namespace.com/library.xsd
 * Java type: com.namespace.library.Book
 *
 * Automatically generated - do not modify.
 */
package com.namespace.library.impl;
/**
 * An XML book(@http://namespace.com/library.xsd).
 *
 * This is a complex type.
 */
public class BookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.namespace.library.Book
{
    private static final long serialVersionUID = 1L;
    
    public BookImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://namespace.com/library.xsd", "title");
    private static final javax.xml.namespace.QName ISBN$2 = 
        new javax.xml.namespace.QName("http://namespace.com/library.xsd", "isbn");
    private static final javax.xml.namespace.QName AUTHOR$4 = 
        new javax.xml.namespace.QName("http://namespace.com/library.xsd", "author");
    
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
            }
            target.set(title);
        }
    }
    
    /**
     * Gets the "isbn" element
     */
    public java.lang.String getIsbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isbn" element
     */
    public org.apache.xmlbeans.XmlString xgetIsbn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISBN$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isbn" element
     */
    public void setIsbn(java.lang.String isbn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISBN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISBN$2);
            }
            target.setStringValue(isbn);
        }
    }
    
    /**
     * Sets (as xml) the "isbn" element
     */
    public void xsetIsbn(org.apache.xmlbeans.XmlString isbn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISBN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISBN$2);
            }
            target.set(isbn);
        }
    }
    
    /**
     * Gets array of all "author" elements
     */
    public com.namespace.library.Author[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$4, targetList);
            com.namespace.library.Author[] result = new com.namespace.library.Author[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "author" element
     */
    public com.namespace.library.Author getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.library.Author target = null;
            target = (com.namespace.library.Author)get_store().find_element_user(AUTHOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "author" element
     */
    public int sizeOfAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$4);
        }
    }
    
    /**
     * Sets array of all "author" element
     */
    public void setAuthorArray(com.namespace.library.Author[] authorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authorArray, AUTHOR$4);
        }
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, com.namespace.library.Author author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.library.Author target = null;
            target = (com.namespace.library.Author)get_store().find_element_user(AUTHOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(author);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    public com.namespace.library.Author insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.library.Author target = null;
            target = (com.namespace.library.Author)get_store().insert_element_user(AUTHOR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    public com.namespace.library.Author addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.namespace.library.Author target = null;
            target = (com.namespace.library.Author)get_store().add_element_user(AUTHOR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "author" element
     */
    public void removeAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$4, i);
        }
    }
}
