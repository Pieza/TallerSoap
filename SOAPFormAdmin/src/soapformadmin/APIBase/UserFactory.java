package soapformadmin.APIBase;

import userapi.User;
import userapi.UserObj;
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
    
    public UserObj getUser(String username){
        return user.getUser(username);
    }
    
    public String register(UserObj userObj){
        return user.register(userObj);
    }
}
