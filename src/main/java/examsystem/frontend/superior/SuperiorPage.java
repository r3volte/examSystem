package examsystem.frontend.superior;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import examsystem.backend.service.model.superior.SuperiorServiceImpl;
import examsystem.frontend.mainlayout.MainAppLayout;
import examsystem.frontend.superior.components.SuperiorGrid;
import examsystem.frontend.uiutils.views.AbstractView;
import org.springframework.beans.factory.annotation.Autowired;

import static examsystem.frontend.uiutils.prop.MainLayoutProp.CSS_STYLESHEET;
import static examsystem.frontend.uiutils.prop.PageTittle.SUPERIORS;
import static examsystem.frontend.uiutils.prop.URLProp.SUPERIOR_URL;

@Route(value = SUPERIOR_URL,
        layout = MainAppLayout.class)
@PageTitle(SUPERIORS)
@StyleSheet(CSS_STYLESHEET)
public class SuperiorPage extends AbstractView {

  private final SuperiorGrid grid;
  private final SuperiorServiceImpl service;

  @Autowired
  public SuperiorPage(SuperiorGrid grid,
                      SuperiorServiceImpl service) {
    this.grid = grid;
    this.service = service;
    add(grid.initGrid(service));
  }
}
