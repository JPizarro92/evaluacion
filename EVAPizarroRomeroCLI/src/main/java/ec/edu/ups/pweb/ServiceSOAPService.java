package ec.edu.ups.pweb;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-01T12:05:06.690-05:00
 * Generated source version: 3.5.0
 *
 */
@WebServiceClient(name = "ServiceSOAPService",
                  wsdlLocation = "http://localhost:8080/EVAPizarroJorgeSVR/ServiceSOAP?wsdl",
                  targetNamespace = "http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/")
public class ServiceSOAPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", "ServiceSOAPService");
    public final static QName ServiceSOAPPort = new QName("http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", "ServiceSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/EVAPizarroJorgeSVR/ServiceSOAP?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceSOAPService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/EVAPizarroJorgeSVR/ServiceSOAP?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceSOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceSOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ServiceSOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ServiceSOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ServiceSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ServiceSOAP
     */
    @WebEndpoint(name = "ServiceSOAPPort")
    public ServiceSOAP getServiceSOAPPort() {
        return super.getPort(ServiceSOAPPort, ServiceSOAP.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceSOAP
     */
    @WebEndpoint(name = "ServiceSOAPPort")
    public ServiceSOAP getServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(ServiceSOAPPort, ServiceSOAP.class, features);
    }

}