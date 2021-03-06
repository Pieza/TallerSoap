
package soapformadmin;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Form", targetNamespace = "http://formAPI/", wsdlLocation = "http://localhost:8084/SOAPForm/Form?wsdl")
public class Form_Service
    extends Service
{

    private final static URL FORM_WSDL_LOCATION;
    private final static WebServiceException FORM_EXCEPTION;
    private final static QName FORM_QNAME = new QName("http://formAPI/", "Form");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/SOAPForm/Form?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FORM_WSDL_LOCATION = url;
        FORM_EXCEPTION = e;
    }

    public Form_Service() {
        super(__getWsdlLocation(), FORM_QNAME);
    }

    public Form_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), FORM_QNAME, features);
    }

    public Form_Service(URL wsdlLocation) {
        super(wsdlLocation, FORM_QNAME);
    }

    public Form_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FORM_QNAME, features);
    }

    public Form_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Form_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Form
     */
    @WebEndpoint(name = "FormPort")
    public Form getFormPort() {
        return super.getPort(new QName("http://formAPI/", "FormPort"), Form.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Form
     */
    @WebEndpoint(name = "FormPort")
    public Form getFormPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://formAPI/", "FormPort"), Form.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FORM_EXCEPTION!= null) {
            throw FORM_EXCEPTION;
        }
        return FORM_WSDL_LOCATION;
    }

}
