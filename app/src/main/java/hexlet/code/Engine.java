package hexlet.code;

public class Engine {
  private String answer;
  private String correctAnswer;
  private int answerOfCalc;
  private int correctAnswerOfCalc;

  public Engine (String answer, String correctAnswer) {
    this.answer = answer;
    this.correctAnswer = correctAnswer;
  }
  public Engine(int answerOfCalc, int correctAnswerOfCalc) {
    this.answerOfCalc = answerOfCalc;
    this.correctAnswerOfCalc = correctAnswerOfCalc;
  }
}
