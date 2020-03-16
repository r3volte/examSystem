package examsystem.backend.dto;

import examsystem.backend.model.utility.Level;
import examsystem.backend.model.utility.Unit;

public class QuestionsDTO {

  private String questionDescription;
  private String answerOne;
  private String answerTwo;
  private String answerThree;
  private String answerFour;
  private String correctAnswer;
  private CategoryDTO category;
  private Unit unit;
  private Level level;
  private byte[] questionPicture;

  public String getQuestionDescription() {
    return questionDescription;
  }

  public void setQuestionDescription(String questionDescription) {
    this.questionDescription = questionDescription;
  }

  public String getAnswerOne() {
    return answerOne;
  }

  public void setAnswerOne(String answerOne) {
    this.answerOne = answerOne;
  }

  public String getAnswerTwo() {
    return answerTwo;
  }

  public void setAnswerTwo(String answerTwo) {
    this.answerTwo = answerTwo;
  }

  public String getAnswerThree() {
    return answerThree;
  }

  public void setAnswerThree(String answerThree) {
    this.answerThree = answerThree;
  }

  public String getAnswerFour() {
    return answerFour;
  }

  public void setAnswerFour(String answerFour) {
    this.answerFour = answerFour;
  }

  public String getCorrectAnswer() {
    return correctAnswer;
  }

  public void setCorrectAnswer(String correctAnswer) {
    this.correctAnswer = correctAnswer;
  }

  public CategoryDTO getCategory() {
    return category;
  }

  public void setCategory(CategoryDTO category) {
    this.category = category;
  }

  public Unit getUnit() {
    return unit;
  }

  public void setUnit(Unit unit) {
    this.unit = unit;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  public byte[] getQuestionPicture() {
    return questionPicture;
  }

  public void setQuestionPicture(byte[] questionPicture) {
    this.questionPicture = questionPicture;
  }

  public static final class QuestionBuilder {
    private String questionDescription;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;
    private String correctAnswer;
    private CategoryDTO category;
    private Unit unit;
    private Level level;
    private byte[] questionPicture;

    public QuestionBuilder questionDescription(String questionDescription) {
      this.questionDescription = questionDescription;
      return this;
    }

    public QuestionBuilder answerOne(String answerOne) {
      this.answerOne = answerOne;
      return this;
    }

    public QuestionBuilder answerTwo(String answerTwo) {
      this.answerTwo = answerTwo;
      return this;
    }

    public QuestionBuilder answerThree(String answerThree) {
      this.answerThree = answerThree;
      return this;
    }

    public QuestionBuilder answerFour(String answerFour) {
      this.answerFour = answerFour;
      return this;
    }

    public QuestionBuilder correctAnswer(String correctAnswer) {
      this.correctAnswer = correctAnswer;
      return this;
    }

    public QuestionBuilder category(CategoryDTO category) {
      this.category = category;
      return this;
    }

    public QuestionBuilder unit(Unit unit) {
      this.unit = unit;
      return this;
    }

    public QuestionBuilder level(Level level) {
      this.level = level;
      return this;
    }

    public QuestionBuilder questionPicture(byte[] questionPicture) {
      this.questionPicture = questionPicture;
      return this;
    }

    public QuestionsDTO build() {
      QuestionsDTO questions = new QuestionsDTO();
      questions.questionDescription = this.questionDescription;
      questions.answerOne = this.answerOne;
      questions.answerTwo = this.answerTwo;
      questions.answerThree = this.answerThree;
      questions.answerFour = this.answerFour;
      questions.correctAnswer = this.correctAnswer;
      questions.category = this.category;
      questions.unit = this.unit;
      questions.level = this.level;
      questions.questionPicture = this.questionPicture;
      return questions;
    }

  }

  public static QuestionBuilder questionBuilder() {
    return new QuestionBuilder();
  }
}
