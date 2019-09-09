
package com.flipkart.mobile.mi;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IAtmImplService", targetNamespace = "http://mi.mobile.flipkart.com/", wsdlLocation = "http://localhost:8085/PaymentBasedProvider/getTx?wsdl")
@HandlerChain(file = "handler-chain.xml")
public class IAtmImplService
    extends Service
{

    private final static URL IATMIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException IATMIMPLSERVICE_EXCEPTION;
    private final static QName IATMIMPLSERVICE_QNAME = new QName("http://mi.mobile.flipkart.com/", "IAtmImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/PaymentBasedProvider/getTx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IATMIMPLSERVICE_WSDL_LOCATION = url;
        IATMIMPLSERVICE_EXCEPTION = e;
    }

    public IAtmImplService() {
        super(__getWsdlLocation(), IATMIMPLSERVICE_QNAME);
    }

    public IAtmImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IATMIMPLSERVICE_QNAME, features);
    }

    public IAtmImplService(URL wsdlLocation) {
        super(wsdlLocation, IATMIMPLSERVICE_QNAME);
    }

    public IAtmImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IATMIMPLSERVICE_QNAME, features);
    }

    public IAtmImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IAtmImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IAtm
     */
    @WebEndpoint(name = "IAtmImplPort")
    public IAtm getIAtmImplPort() {
        return super.getPort(new QName("http://mi.mobile.flipkart.com/", "IAtmImplPort"), IAtm.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAtm
     */
    @WebEndpoint(name = "IAtmImplPort")
    public IAtm getIAtmImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mi.mobile.flipkart.com/", "IAtmImplPort"), IAtm.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IATMIMPLSERVICE_EXCEPTION!= null) {
            throw IATMIMPLSERVICE_EXCEPTION;
        }
        return IATMIMPLSERVICE_WSDL_LOCATION;
    }

}
