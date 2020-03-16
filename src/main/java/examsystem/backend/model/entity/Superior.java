package examsystem.backend.model.entity;

import examsystem.backend.model.utility.BaseEntity;
import examsystem.backend.model.utility.Unit;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Superior extends BaseEntity {

  private String firstName;
  private String lastName;
  private String email;
  @Enumerated(EnumType.STRING)
  private Unit unit;

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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Unit getUnit() {
    return unit;
  }

  public void setUnit(Unit unit) {
    this.unit = unit;
  }
}
