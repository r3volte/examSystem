package examsystem.frontend.uiutils.field;

import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;

import static examsystem.frontend.uiutils.prop.BinderErrors.ATTRIBUTE;
import static examsystem.frontend.uiutils.prop.BinderErrors.VALUE;
import static examsystem.frontend.uiutils.prop.UtilsView.*;

public class UIField {


  public static TextField createNameField() {
    return createField(USER_NAME);
  }

  public static TextField createSurnameField() {
    return createField(USER_SURNAME);
  }

  public static EmailField createEmailField() {
    EmailField emailField = new EmailField(USER_EMAIL);
    emailField.getElement()
            .setAttribute(ATTRIBUTE, VALUE);
    return emailField;
  }

  private static TextField createField(String name) {
    return new TextField(name);
  }
}
