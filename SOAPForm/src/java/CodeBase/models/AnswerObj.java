package CodeBase.models;

/**
 *
 * @author JOSE-ULLOA
 */
public class AnswerObj {
    private String answer;
    private int chooseCount = 0;

    public AnswerObj() {
    }

    
    public AnswerObj(String answer, int chooseCount) {
        this.answer = answer;
        this.chooseCount = chooseCount;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getChooseCount() {
        return chooseCount;
    }

    public void setChooseCount(int chooseCount) {
        this.chooseCount = chooseCount;
    }
    

}
