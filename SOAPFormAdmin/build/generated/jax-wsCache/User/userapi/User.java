
package userapi;

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
@WebService(name = "User", targetNamespace = "http://userAPI/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface User {


    /**
     * 
     * @param user
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://userAPI/", className = "userapi.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://userAPI/", className = "userapi.RegisterResponse")
    @Action(input = "http://userAPI/User/registerRequest", output = "http://userAPI/User/registerResponse")
    public String register(
        @WebParam(name = "user", targetNamespace = "")
        UserObj user);

    /**
     * 
     * @param username
     * @return
     *     returns userapi.UserObj
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://userAPI/", className = "userapi.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://userAPI/", className = "userapi.GetUserResponse")
    @Action(input = "http://userAPI/User/getUserRequest", output = "http://userAPI/User/getUserResponse")
    public UserObj getUser(
        @WebParam(name = "username", targetNamespace = "")
        String username);

}
