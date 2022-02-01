
package ec.edu.ups.pweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.pweb package. 
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

    private final static QName _GetObras_QNAME = new QName("http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", "getObras");
    private final static QName _GetObrasResponse_QNAME = new QName("http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", "getObrasResponse");
    private final static QName _InsertarObra_QNAME = new QName("http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", "insertarObra");
    private final static QName _InsertarObraResponse_QNAME = new QName("http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", "insertarObraResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.pweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetObras }
     * 
     */
    public GetObras createGetObras() {
        return new GetObras();
    }

    /**
     * Create an instance of {@link GetObrasResponse }
     * 
     */
    public GetObrasResponse createGetObrasResponse() {
        return new GetObrasResponse();
    }

    /**
     * Create an instance of {@link InsertarObra }
     * 
     */
    public InsertarObra createInsertarObra() {
        return new InsertarObra();
    }

    /**
     * Create an instance of {@link InsertarObraResponse }
     * 
     */
    public InsertarObraResponse createInsertarObraResponse() {
        return new InsertarObraResponse();
    }

    /**
     * Create an instance of {@link Obra }
     * 
     */
    public Obra createObra() {
        return new Obra();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObras }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", name = "getObras")
    public JAXBElement<GetObras> createGetObras(GetObras value) {
        return new JAXBElement<GetObras>(_GetObras_QNAME, GetObras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObrasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObrasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", name = "getObrasResponse")
    public JAXBElement<GetObrasResponse> createGetObrasResponse(GetObrasResponse value) {
        return new JAXBElement<GetObrasResponse>(_GetObrasResponse_QNAME, GetObrasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarObra }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarObra }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", name = "insertarObra")
    public JAXBElement<InsertarObra> createInsertarObra(InsertarObra value) {
        return new JAXBElement<InsertarObra>(_InsertarObra_QNAME, InsertarObra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarObraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarObraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", name = "insertarObraResponse")
    public JAXBElement<InsertarObraResponse> createInsertarObraResponse(InsertarObraResponse value) {
        return new JAXBElement<InsertarObraResponse>(_InsertarObraResponse_QNAME, InsertarObraResponse.class, null, value);
    }

}
