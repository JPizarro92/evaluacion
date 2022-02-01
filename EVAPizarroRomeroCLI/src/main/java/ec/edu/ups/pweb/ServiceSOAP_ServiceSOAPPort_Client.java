
package ec.edu.ups.pweb;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-01T12:05:06.569-05:00
 * Generated source version: 3.5.0
 *
 */
public final class ServiceSOAP_ServiceSOAPPort_Client {

    private static final QName SERVICE_NAME = new QName("http://serviceSOAP.EVAPizarroJorgeSVR.pweb.ups.edu.ec/", "ServiceSOAPService");

    private ServiceSOAP_ServiceSOAPPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ServiceSOAPService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        ServiceSOAPService ss = new ServiceSOAPService(wsdlURL, SERVICE_NAME);
        ServiceSOAP port = ss.getServiceSOAPPort();

        {
        System.out.println("Invoking getObras...");
        java.util.List<ec.edu.ups.pweb.Obra> _getObras__return = port.getObras();
        System.out.println("getObras.result=" + _getObras__return);


        }
        {
        System.out.println("Invoking insertarObra...");
        ec.edu.ups.pweb.Obra _insertarObra_arg0 = null;
        boolean _insertarObra__return = port.insertarObra(_insertarObra_arg0);
        System.out.println("insertarObra.result=" + _insertarObra__return);


        }

        System.exit(0);
    }

}
