package soapformadmin.APIBase;

import userapi.User;
import userapi.User_Service;

/**
 *
 * @author JOSE-ULLOA
 */
public class UserFactory {
    private User user;
    
    public UserFactory(){
        user = new User_Service().getUserPort();
    }
    
    
}
