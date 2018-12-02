package formAPI;

import CodeBase.data.DataBase;
import CodeBase.models.*;
import CodeBase.models.QuestionObj;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author JOSE-ULLOA
 */
@WebService(serviceName = "Form")
public class Form {


    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "username") String username,
            @WebParam(name = "form") FormObj form) {
        DataBase.getUserByUsername(username).addForm(form);
        return "Success";
    }
    
    @WebMethod(operationName = "getFormsByUsername")
    public List<FormObj> getFormsByUsername(@WebParam(name = "username") String username) {     
        return DataBase.getFormsByUsername(username);
    }
    
    @WebMethod(operationName = "answerForm")
    public String answerForm(@WebParam(name = "username") String username,
            @WebParam(name = "id") int id,
            @WebParam(name = "answers") List<QuestionObj> questions) {    
        DataBase.getFormsByUsername(username).get(id).setQuestions(questions);
        return "Success";
    }
}
