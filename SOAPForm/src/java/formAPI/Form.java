package formAPI;

import CodeBase.data.DataBase;
import CodeBase.models.FormObj;
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

    /**
     * This is a sample web service operation
     * @param form form
     * @return status msg
     */
    @WebMethod(operationName = "create")
    public String create(@WebParam(name = "form") FormObj form) {
        DataBase.forms.add(form);
        return "Success";
    }
    
    /**
     * This is a sample web service operation
     * @param formId id
     * @return a form
     */
    @WebMethod(operationName = "get")
    public FormObj get(@WebParam(name = "formId") int formId) {     
        return DataBase.forms.get(formId);
    }
    
    @WebMethod(operationName = "getAll")
    public List<FormObj> getAll() {     
        return DataBase.forms;
    }
}
