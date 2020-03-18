package examsystem.frontend.uiutils.button;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import examsystem.frontend.uiutils.prop.ComponentsCss;

import static com.vaadin.flow.component.UI.getCurrent;
import static examsystem.frontend.uiutils.button.UIButtonProp.EXPRESION;
import static examsystem.frontend.uiutils.button.UIButtonProp.LOGOUT;
import static examsystem.frontend.uiutils.prop.UtilsView.USER_ADD;


public class UIButton {

  public static Button createLogoutButton() {
    Button button = createButton(LOGOUT,
            VaadinIcon.SIGN_OUT);
    button.setClassName(ComponentsCss.LOGOUT_BUTTON);
    button.addClickListener(buttonClickEvent -> getCurrent()
            .getPage()
            .executeJs(EXPRESION));
    return button;
  }

  public static Button submitFormButton() {
    return createButton(USER_ADD);
  }

  private static Button createButton(String text) {
    Button button = new Button(text);
    button.setClassName("submit-button");
    return button;
  }

  private static Button createButton(String text,
                                     VaadinIcon icon) {
    Icon i = new Icon(icon);
    return new Button(text, i);
  }

  private static Button createButton(
          VaadinIcon icon) {
    Icon i = new Icon(icon);
    return new Button(i);
  }

  private UIButton() {
  }
}
