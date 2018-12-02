package CodeBase.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSE-ULLOA
 */
public class FormObj {
    private String title;
    private List<QuestionObj> questions = new ArrayList<>();

    public FormObj(String title) {
        this.title = title;
    }

    public FormObj() {
    }
    
    public void addQuestion(QuestionObj questionObj){
        this.questions.add(questionObj);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<QuestionObj> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionObj> questions) {
        this.questions = questions;
    }
    
    
    
}
