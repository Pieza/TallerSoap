
package soapformadmin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapformadmin package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://formAPI/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://formAPI/", "addResponse");
    private final static QName _GetFormsByUsernameResponse_QNAME = new QName("http://formAPI/", "getFormsByUsernameResponse");
    private final static QName _GetFormsByUsername_QNAME = new QName("http://formAPI/", "getFormsByUsername");
    private final static QName _AnswerForm_QNAME = new QName("http://formAPI/", "answerForm");
    private final static QName _AnswerFormResponse_QNAME = new QName("http://formAPI/", "answerFormResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapformadmin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetFormsByUsernameResponse }
     * 
     */
    public GetFormsByUsernameResponse createGetFormsByUsernameResponse() {
        return new GetFormsByUsernameResponse();
    }

    /**
     * Create an instance of {@link GetFormsByUsername }
     * 
     */
    public GetFormsByUsername createGetFormsByUsername() {
        return new GetFormsByUsername();
    }

    /**
     * Create an instance of {@link AnswerForm }
     * 
     */
    public AnswerForm createAnswerForm() {
        return new AnswerForm();
    }

    /**
     * Create an instance of {@link AnswerFormResponse }
     * 
     */
    public AnswerFormResponse createAnswerFormResponse() {
        return new AnswerFormResponse();
    }

    /**
     * Create an instance of {@link QuestionObj }
     * 
     */
    public QuestionObj createQuestionObj() {
        return new QuestionObj();
    }

    /**
     * Create an instance of {@link AnswerObj }
     * 
     */
    public AnswerObj createAnswerObj() {
        return new AnswerObj();
    }

    /**
     * Create an instance of {@link FormObj }
     * 
     */
    public FormObj createFormObj() {
        return new FormObj();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://formAPI/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://formAPI/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormsByUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://formAPI/", name = "getFormsByUsernameResponse")
    public JAXBElement<GetFormsByUsernameResponse> createGetFormsByUsernameResponse(GetFormsByUsernameResponse value) {
        return new JAXBElement<GetFormsByUsernameResponse>(_GetFormsByUsernameResponse_QNAME, GetFormsByUsernameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormsByUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://formAPI/", name = "getFormsByUsername")
    public JAXBElement<GetFormsByUsername> createGetFormsByUsername(GetFormsByUsername value) {
        return new JAXBElement<GetFormsByUsername>(_GetFormsByUsername_QNAME, GetFormsByUsername.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://formAPI/", name = "answerForm")
    public JAXBElement<AnswerForm> createAnswerForm(AnswerForm value) {
        return new JAXBElement<AnswerForm>(_AnswerForm_QNAME, AnswerForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerFormResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://formAPI/", name = "answerFormResponse")
    public JAXBElement<AnswerFormResponse> createAnswerFormResponse(AnswerFormResponse value) {
        return new JAXBElement<AnswerFormResponse>(_AnswerFormResponse_QNAME, AnswerFormResponse.class, null, value);
    }

}
