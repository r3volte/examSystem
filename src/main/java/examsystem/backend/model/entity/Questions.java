package examsystem.backend.model.entity;

import examsystem.backend.model.utility.BaseEntity;
import examsystem.backend.model.utility.Level;
import examsystem.backend.model.utility.Unit;

import javax.persistence.*;

@Entity
public class Questions extends BaseEntity {

  private String questionDescription;
  private String answerOne;
  private String answerTwo;
  private String answerThree;
  private String answerFour;
  private String correctAnswer;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
  private Category category;
  @Enumerated(EnumType.STRING)
  private Unit unit;
  @Enumerated(EnumType.STRING)
  private Level level;
  @Lob
  @Basic(fetch = FetchType.LAZY)
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

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
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

}
