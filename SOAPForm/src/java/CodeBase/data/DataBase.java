package CodeBase.data;

import CodeBase.models.FormObj;
import CodeBase.models.UserObj;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSE-ULLOA
 */
public class DataBase {    
    public static List<UserObj> users = new ArrayList<>();
    
    public static List<FormObj> getFormsByUsername(String username){
        List<FormObj> forms = new ArrayList<>();
        for(UserObj us : users){
            if(us.getUsername().equals(username))
                forms = us.getForms();
        }
        return forms;
    }
    
        public static UserObj getUserByUsername(String username){
        for(UserObj us : users){
            if(us.getUsername().equals(username))
                return us;
        }
        return null;
    }
}
