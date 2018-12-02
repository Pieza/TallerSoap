package CodeBase.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSE-ULLOA
 */
public class UserObj {
    private String username;
    private String type;
    private List<FormObj> forms  = new ArrayList<>();
    
    public void addForm(FormObj formObj){
        this.forms.add(formObj);
    }
    public UserObj() {
    }
    
    public UserObj(String username, String type) {
        this.username = username;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<FormObj> getForms() {
        return forms;
    }

    public void setForms(List<FormObj> forms) {
        this.forms = forms;
    }
    
    
    
    
}
