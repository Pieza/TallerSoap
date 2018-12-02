/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userAPI;

import CodeBase.data.DataBase;
import CodeBase.models.UserObj;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author JOSE-ULLOA
 */
@WebService(serviceName = "User")
public class User {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "register")
    public String hello(@WebParam(name = "name") UserObj user) {
        DataBase.users.add(user);
        return "Success";
    }
}
