package examsystem.backend.model.entity;

import examsystem.backend.model.utility.BaseEntity;
import examsystem.backend.model.utility.Unit;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Trainer extends BaseEntity {

  private String firstName;
  private String lastName;
  @Enumerated(EnumType.STRING)
  private Unit unit;
  private int passedExams;
  private int completedExams;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Unit getUnit() {
    return unit;
  }

  public void setUnit(Unit unit) {
    this.unit = unit;
  }

  public int getPassedExams() {
    return passedExams;
  }

  public void setPassedExams(int passedExams) {
    this.passedExams = passedExams;
  }

  public int getCompletedExams() {
    return completedExams;
  }

  public void setCompletedExams(int completedExams) {
    this.completedExams = completedExams;
  }

}
