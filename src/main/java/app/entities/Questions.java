package app.entities;

public class Questions {
    private int id;
    private String question;
    private String answer;
    private int points;

    public Questions(int id, String question, String answer, int POINTS) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
