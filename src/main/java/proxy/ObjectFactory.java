
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _IsNumberCreditCardValide_QNAME = new QName("http://controller.creditcardvalidatorsoap.hergal.com/", "isNumberCreditCardValide");
    private static final QName _IsNumberCreditCardValideResponse_QNAME = new QName("http://controller.creditcardvalidatorsoap.hergal.com/", "isNumberCreditCardValideResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsNumberCreditCardValide }
     * 
     * @return
     *     the new instance of {@link IsNumberCreditCardValide }
     */
    public IsNumberCreditCardValide createIsNumberCreditCardValide() {
        return new IsNumberCreditCardValide();
    }

    /**
     * Create an instance of {@link IsNumberCreditCardValideResponse }
     * 
     * @return
     *     the new instance of {@link IsNumberCreditCardValideResponse }
     */
    public IsNumberCreditCardValideResponse createIsNumberCreditCardValideResponse() {
        return new IsNumberCreditCardValideResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsNumberCreditCardValide }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsNumberCreditCardValide }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.creditcardvalidatorsoap.hergal.com/", name = "isNumberCreditCardValide")
    public JAXBElement<IsNumberCreditCardValide> createIsNumberCreditCardValide(IsNumberCreditCardValide value) {
        return new JAXBElement<>(_IsNumberCreditCardValide_QNAME, IsNumberCreditCardValide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsNumberCreditCardValideResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsNumberCreditCardValideResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://controller.creditcardvalidatorsoap.hergal.com/", name = "isNumberCreditCardValideResponse")
    public JAXBElement<IsNumberCreditCardValideResponse> createIsNumberCreditCardValideResponse(IsNumberCreditCardValideResponse value) {
        return new JAXBElement<>(_IsNumberCreditCardValideResponse_QNAME, IsNumberCreditCardValideResponse.class, null, value);
    }

}
