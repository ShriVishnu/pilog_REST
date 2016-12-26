
package com.pilogParts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pilogParts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://service.dictionary.pilog.com/", "Exception");
    private final static QName _SearchReference_QNAME = new QName("http://service.dictionary.pilog.com/", "searchReference");
    private final static QName _SearchReferenceResponse_QNAME = new QName("http://service.dictionary.pilog.com/", "searchReferenceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pilogParts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchReferenceResponse }
     * 
     */
    public SearchReferenceResponse createSearchReferenceResponse() {
        return new SearchReferenceResponse();
    }

    /**
     * Create an instance of {@link SearchReference }
     * 
     */
    public SearchReference createSearchReference() {
        return new SearchReference();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ReferenceERP }
     * 
     */
    public ReferenceERP createReferenceERP() {
        return new ReferenceERP();
    }

    /**
     * Create an instance of {@link ReferenceResponse }
     * 
     */
    public ReferenceResponse createReferenceResponse() {
        return new ReferenceResponse();
    }

    /**
     * Create an instance of {@link ReferenceRequest }
     * 
     */
    public ReferenceRequest createReferenceRequest() {
        return new ReferenceRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dictionary.pilog.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dictionary.pilog.com/", name = "searchReference")
    public JAXBElement<SearchReference> createSearchReference(SearchReference value) {
        return new JAXBElement<SearchReference>(_SearchReference_QNAME, SearchReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchReferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dictionary.pilog.com/", name = "searchReferenceResponse")
    public JAXBElement<SearchReferenceResponse> createSearchReferenceResponse(SearchReferenceResponse value) {
        return new JAXBElement<SearchReferenceResponse>(_SearchReferenceResponse_QNAME, SearchReferenceResponse.class, null, value);
    }

}
