package examsystem.frontend.uiutils.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public abstract class AbstractView extends VerticalLayout {

  private static final String BACKGROUND_COLOR = "background-color";
  private static final String AUTO = "auto";
  private static final String OVERFLOW = "overflow";

  public AbstractView() {
    setMargin(false);
    setSizeFull();
    addClassNames(BACKGROUND_COLOR);
    getElement().getStyle().set(OVERFLOW, AUTO);
  }
}