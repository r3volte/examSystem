package examsystem.frontend.uiutils.button;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

import static com.vaadin.flow.component.UI.getCurrent;
import static examsystem.frontend.uiutils.button.UIButtonProp.*;

public class UIButton {

  public static Button createLogoutButton() {
    Button button = createButton(LOGOUT,
            VaadinIcon.SIGN_OUT);
    button.setClassName(LOGOUT_BUTTON);
    button.addClickListener(buttonClickEvent -> getCurrent()
            .getPage()
            .executeJs(EXPRESION));
    return button;
  }

  private static Button createButton(String text) {
    return new Button(text);
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
}
