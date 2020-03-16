package examsystem.backend.model.entity;

import examsystem.backend.model.utility.BaseEntity;
import examsystem.backend.model.utility.Level;
import examsystem.backend.model.utility.Unit;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Results extends BaseEntity {

  private String firstName;
  private String lastName;
  @Enumerated(EnumType.STRING)
  private Unit unit;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "trainer_id")
  private Trainer trainer;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "superior_id")
  private Superior superior;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
  private Category category;
  @Enumerated(EnumType.STRING)
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

  public Trainer getTrainer() {
    return trainer;
  }

  public void setTrainer(Trainer trainer) {
    this.trainer = trainer;
  }

  public Superior getSuperior() {
    return superior;
  }

  public void setSuperior(Superior superior) {
    this.superior = superior;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
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

  public void setExamTime(LocalDateTime dateTime) {
    this.examTime = dateTime;
  }

}
