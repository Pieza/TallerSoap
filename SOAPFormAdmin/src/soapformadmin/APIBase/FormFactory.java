package soapformadmin.APIBase;

import soapformadmin.Form;
import soapformadmin.FormObj;
import soapformadmin.Form_Service;

/**
 *
 * @author JOSE-ULLOA
 */
public class FormFactory {
    private Form form;
    
    public FormFactory(){
        form = new Form_Service().getFormPort();
    }
    
    public String createForm(String username,FormObj formObj)
    {
        return form.add(username,formObj);
    }
    
}
