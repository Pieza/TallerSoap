
package soapformadmin;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Form", targetNamespace = "http://formAPI/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Form {


    /**
     * 
     * @param formId
     * @return
     *     returns soapformadmin.FormObj
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "get", targetNamespace = "http://formAPI/", className = "soapformadmin.Get")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "http://formAPI/", className = "soapformadmin.GetResponse")
    @Action(input = "http://formAPI/Form/getRequest", output = "http://formAPI/Form/getResponse")
    public FormObj get(
        @WebParam(name = "formId", targetNamespace = "")
        int formId);

    /**
     * 
     * @param form
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "create", targetNamespace = "http://formAPI/", className = "soapformadmin.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://formAPI/", className = "soapformadmin.CreateResponse")
    @Action(input = "http://formAPI/Form/createRequest", output = "http://formAPI/Form/createResponse")
    public String create(
        @WebParam(name = "form", targetNamespace = "")
        FormObj form);

    /**
     * 
     * @return
     *     returns java.util.List<soapformadmin.FormObj>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://formAPI/", className = "soapformadmin.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://formAPI/", className = "soapformadmin.GetAllResponse")
    @Action(input = "http://formAPI/Form/getAllRequest", output = "http://formAPI/Form/getAllResponse")
    public List<FormObj> getAll();

}
