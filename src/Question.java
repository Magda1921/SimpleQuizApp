public class Question {
    private int number;
    private String description;
    private String answers;
    private String correctAnswer;

    public Question(int number, String description, String answers, String correctAnswer) {
        this.number = number;
        this.description = description;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
