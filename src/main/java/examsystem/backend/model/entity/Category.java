package examsystem.backend.model.entity;

import examsystem.backend.model.utility.BaseEntity;
import examsystem.backend.model.utility.Unit;

import javax.persistence.*;

@Entity
public class Category extends BaseEntity {

  private String name;
  @Enumerated(EnumType.STRING)
  private Unit unit;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Unit getUnit() {
    return unit;
  }

  public void setUnit(Unit unit) {
    this.unit = unit;
  }
}
