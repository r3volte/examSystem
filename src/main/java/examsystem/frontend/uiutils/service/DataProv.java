package examsystem.frontend.uiutils.service;

import com.vaadin.flow.component.combobox.ComboBox;
import examsystem.backend.model.utility.Unit;

import static examsystem.frontend.uiutils.prop.BinderErrors.ATTRIBUTE;
import static examsystem.frontend.uiutils.prop.BinderErrors.VALUE;
import static examsystem.frontend.uiutils.prop.UtilsView.USER_UNIT;

public class DataProv {

  public static ComboBox<Unit> createBox() {
    ComboBox<Unit> box = new ComboBox<>();
    unitBox(box);
    return box;
  }

  private static void unitBox(ComboBox<Unit> box) {
    box.setItems(Unit.values());
    box.getElement()
            .setAttribute(ATTRIBUTE, VALUE);
    box.setLabel(USER_UNIT);
  }

}
