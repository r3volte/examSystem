package examsystem.backend.dto;

import examsystem.backend.model.utility.Unit;

public class CategoryDTO {

  private String name;
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
