package examsystem.frontend.uiutils.form;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import examsystem.backend.model.utility.Unit;

import static examsystem.frontend.uiutils.prop.ComponentsCss.FORM_CLASSNAME;
import static examsystem.frontend.uiutils.prop.WidthAndHeight.WIDTH_450;

public class LayoutForms {

  public static FormLayout superiorForm(EmailField email,
                                        TextField first,
                                        TextField last,
                                        ComboBox<Unit> unit,
                                        Button button) {
    FormLayout formLayout = new FormLayout(email, first, last, unit, button);
    formOptions(formLayout);
    return formLayout;
  }


  private static void formOptions(FormLayout formLayout) {
    formLayout.setClassName(FORM_CLASSNAME);
    formLayout.setWidth(WIDTH_450);
  }
}
