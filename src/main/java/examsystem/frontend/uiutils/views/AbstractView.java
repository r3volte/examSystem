package examsystem.frontend.uiutils.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import static examsystem.frontend.uiutils.prop.ComponentsCss.BACKGROUND_COLOR;

public abstract class AbstractView extends VerticalLayout {

  private static final String AUTO = "auto";
  private static final String OVERFLOW = "overflow";

  public AbstractView() {
    setMargin(false);
    setPadding(true);
    setSizeFull();
    addClassNames(BACKGROUND_COLOR);
    getElement().getStyle().set(OVERFLOW, AUTO);
  }
}