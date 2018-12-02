package soapuser;

import formapi.Form;
import formapi.FormObj;
import formapi.Form_Service;
import java.util.List;



/**
 *
 * @author JOSE-ULLOA
 */
public class FormFactory {
    private Form form;
    
    public FormFactory(){
        form = new Form_Service().getFormPort();
    }
    
    public List<FormObj> getSearch(String username){
        

        return form.getFormsByUsername(username);
        
    }

}
