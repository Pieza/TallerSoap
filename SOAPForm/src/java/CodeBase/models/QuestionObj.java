package CodeBase.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSE-ULLOA
 */
public class QuestionObj {
    private String question;
    private List<AnswerObj> posibleAnswers = new ArrayList<>();

    public QuestionObj() {
    }

    public List<AnswerObj> getPosibleAnswers() {
        return posibleAnswers;
    }

    public void setPosibleAnswers(List<AnswerObj> posibleAnswers) {
        this.posibleAnswers = posibleAnswers;
    }
    
    public void addAnswer(AnswerObj answerObj){
        this.posibleAnswers.add(answerObj);
    }
    public QuestionObj(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
    
}
