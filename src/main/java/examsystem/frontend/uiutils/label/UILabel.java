package examsystem.frontend.uiutils.label;

import com.vaadin.flow.component.html.Label;

public class UILabel {

  public static Label createMainLayoutLabel(String name,
                                            String className) {
    return createLabel(name, className);
  }


  private static Label createLabel(String name) {
    return new Label(name);
  }

  private static Label createLabel(String name,
                                   String className) {
    Label label = new Label(name);
    label.setClassName(className);
    return label;
  }

}
