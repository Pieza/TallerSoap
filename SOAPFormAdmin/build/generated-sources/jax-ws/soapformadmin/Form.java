
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
     * @param form
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://formAPI/", className = "soapformadmin.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://formAPI/", className = "soapformadmin.AddResponse")
    @Action(input = "http://formAPI/Form/addRequest", output = "http://formAPI/Form/addResponse")
    public String add(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "form", targetNamespace = "")
        FormObj form);

    /**
     * 
     * @param username
     * @return
     *     returns java.util.List<soapformadmin.FormObj>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFormsByUsername", targetNamespace = "http://formAPI/", className = "soapformadmin.GetFormsByUsername")
    @ResponseWrapper(localName = "getFormsByUsernameResponse", targetNamespace = "http://formAPI/", className = "soapformadmin.GetFormsByUsernameResponse")
    @Action(input = "http://formAPI/Form/getFormsByUsernameRequest", output = "http://formAPI/Form/getFormsByUsernameResponse")
    public List<FormObj> getFormsByUsername(
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param answers
     * @param id
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "answerForm", targetNamespace = "http://formAPI/", className = "soapformadmin.AnswerForm")
    @ResponseWrapper(localName = "answerFormResponse", targetNamespace = "http://formAPI/", className = "soapformadmin.AnswerFormResponse")
    @Action(input = "http://formAPI/Form/answerFormRequest", output = "http://formAPI/Form/answerFormResponse")
    public String answerForm(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "answers", targetNamespace = "")
        List<QuestionObj> answers);

}
