package examsystem.backend.dto;

import examsystem.backend.model.utility.Level;
import examsystem.backend.model.utility.Unit;

import java.time.LocalDateTime;

public class ResultsDTO {

  private String firstName;
  private String lastName;
  private Unit unit;
  private TrainerDTO trainer;
  private SuperiorDTO superior;
  private CategoryDTO category;
  private Level level;
  private int result = 0;
  private LocalDateTime examTime;

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

  public TrainerDTO getTrainer() {
    return trainer;
  }

  public void setTrainer(TrainerDTO trainer) {
    this.trainer = trainer;
  }

  public SuperiorDTO getSuperior() {
    return superior;
  }

  public void setSuperior(SuperiorDTO superior) {
    this.superior = superior;
  }

  public CategoryDTO getCategory() {
    return category;
  }

  public void setCategory(CategoryDTO category) {
    this.category = category;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public LocalDateTime getExamTime() {
    return examTime;
  }

  public void setExamTime() {
    this.examTime = LocalDateTime.now();
  }

  public static final class ResultBuilder {
    private String firstName;
    private String lastName;
    private Unit unit;
    private TrainerDTO trainer;
    private SuperiorDTO superior;
    private CategoryDTO category;
    private Level level;
    private int result;
    private LocalDateTime examTime;

    public ResultBuilder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public ResultBuilder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public ResultBuilder unit(Unit unit) {
      this.unit = unit;
      return this;
    }

    public ResultBuilder trainer(TrainerDTO trainer) {
      this.trainer = trainer;
      return this;
    }

    public ResultBuilder superior(SuperiorDTO superior) {
      this.superior = superior;
      return this;
    }

    public ResultBuilder category(CategoryDTO category) {
      this.category = category;
      return this;
    }

    public ResultBuilder level(Level level) {
      this.level = level;
      return this;
    }

    public ResultBuilder result(int result) {
      this.result = result;
      return this;
    }

    public ResultBuilder examTime() {
      this.examTime = LocalDateTime.now();
      return this;
    }

    public ResultsDTO build() {
      ResultsDTO results = new ResultsDTO();
      results.firstName = this.firstName;
      results.lastName = this.lastName;
      results.unit = this.unit;
      results.category = this.category;
      results.level = this.level;
      results.result = this.result;
      results.examTime = this.examTime;
      results.trainer = this.trainer;
      results.superior = this.superior;
      return results;
    }
  }

  public static ResultBuilder resultBuilder() {
    return new ResultBuilder();
  }
}
