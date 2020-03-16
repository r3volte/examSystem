package examsystem.backend.dto;

import examsystem.backend.model.utility.Unit;

public class TrainerDTO {

  private String firstName;
  private String lastName;
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

  public static final class TrainerBuilder {
    private String firstName;
    private String lastName;
    private Unit unit;
    private int passedExams;
    private int completedExams;

    public TrainerBuilder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public TrainerBuilder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public TrainerBuilder unit(Unit unit) {
      this.unit = unit;
      return this;
    }

    public TrainerBuilder passedExams(int passedExams) {
      this.passedExams = passedExams;
      return this;
    }

    public TrainerBuilder completedExams(int completedExams) {
      this.completedExams = completedExams;
      return this;
    }

    public TrainerDTO build() {
      TrainerDTO trainer = new TrainerDTO();
      trainer.firstName = this.firstName;
      trainer.lastName = this.lastName;
      trainer.unit = this.unit;
      trainer.passedExams = this.passedExams;
      trainer.completedExams = this.completedExams;
      return trainer;
    }
  }

  public static TrainerBuilder trainerBuilder() {
    return new TrainerBuilder();
  }

}
