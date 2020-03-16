package examsystem.frontend.uiutils.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public abstract class AbstractView extends VerticalLayout {

  private static final String BACKGROUND_COLOR = "background-color";

  public AbstractView() {
    setMargin(false);
    setSizeFull();
    addClassNames(BACKGROUND_COLOR);
    getElement().getStyle().set("overflow", "auto");
  }
}