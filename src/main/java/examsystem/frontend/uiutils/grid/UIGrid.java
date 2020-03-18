package examsystem.frontend.uiutils.grid;

import com.vaadin.flow.component.grid.Grid;
import examsystem.backend.dto.SuperiorDTO;

import java.util.List;

import static com.vaadin.flow.component.grid.GridVariant.LUMO_ROW_STRIPES;
import static examsystem.frontend.uiutils.prop.ComponentsCss.GRID_CLASSNAME;

public class UIGrid {


  public static Grid<SuperiorDTO> createSuperiorGrid(List<SuperiorDTO> items) {
    Grid<SuperiorDTO> grid = new Grid<>();
    grid.setItems(items);
    return grid;
  }

  public static void gridTheming(Grid grid) {
    gridClassName(grid);
    gridTheme(grid);
  }

  private static void gridClassName(Grid grid) {
    grid.setClassName(GRID_CLASSNAME);
  }

  private static void gridTheme(Grid grid) {
    grid.addThemeVariants(LUMO_ROW_STRIPES);
  }

  public UIGrid() {
  }
}
