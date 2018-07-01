
package akash;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the akash package. 
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

    private final static QName _Bmi_QNAME = new QName("http://akash/", "bmi");
    private final static QName _BmiResponse_QNAME = new QName("http://akash/", "bmiResponse");
    private final static QName _DateCheck_QNAME = new QName("http://akash/", "date_check");
    private final static QName _DateCheckResponse_QNAME = new QName("http://akash/", "date_checkResponse");
    private final static QName _Hello_QNAME = new QName("http://akash/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://akash/", "helloResponse");
    private final static QName _NameCheck_QNAME = new QName("http://akash/", "name_check");
    private final static QName _NameCheckResponse_QNAME = new QName("http://akash/", "name_checkResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: akash
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Bmi }
     * 
     */
    public Bmi createBmi() {
        return new Bmi();
    }

    /**
     * Create an instance of {@link BmiResponse }
     * 
     */
    public BmiResponse createBmiResponse() {
        return new BmiResponse();
    }

    /**
     * Create an instance of {@link DateCheck }
     * 
     */
    public DateCheck createDateCheck() {
        return new DateCheck();
    }

    /**
     * Create an instance of {@link DateCheckResponse }
     * 
     */
    public DateCheckResponse createDateCheckResponse() {
        return new DateCheckResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link NameCheck }
     * 
     */
    public NameCheck createNameCheck() {
        return new NameCheck();
    }

    /**
     * Create an instance of {@link NameCheckResponse }
     * 
     */
    public NameCheckResponse createNameCheckResponse() {
        return new NameCheckResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bmi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://akash/", name = "bmi")
    public JAXBElement<Bmi> createBmi(Bmi value) {
        return new JAXBElement<Bmi>(_Bmi_QNAME, Bmi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BmiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://akash/", name = "bmiResponse")
    public JAXBElement<BmiResponse> createBmiResponse(BmiResponse value) {
        return new JAXBElement<BmiResponse>(_BmiResponse_QNAME, BmiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://akash/", name = "date_check")
    public JAXBElement<DateCheck> createDateCheck(DateCheck value) {
        return new JAXBElement<DateCheck>(_DateCheck_QNAME, DateCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://akash/", name = "date_checkResponse")
    public JAXBElement<DateCheckResponse> createDateCheckResponse(DateCheckResponse value) {
        return new JAXBElement<DateCheckResponse>(_DateCheckResponse_QNAME, DateCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://akash/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://akash/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://akash/", name = "name_check")
    public JAXBElement<NameCheck> createNameCheck(NameCheck value) {
        return new JAXBElement<NameCheck>(_NameCheck_QNAME, NameCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://akash/", name = "name_checkResponse")
    public JAXBElement<NameCheckResponse> createNameCheckResponse(NameCheckResponse value) {
        return new JAXBElement<NameCheckResponse>(_NameCheckResponse_QNAME, NameCheckResponse.class, null, value);
    }

}
