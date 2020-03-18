package examsystem.frontend.superior.components;

import com.vaadin.flow.component.grid.Grid;
import examsystem.backend.dto.SuperiorDTO;
import examsystem.backend.service.model.superior.SuperiorServiceImpl;
import examsystem.frontend.uiutils.grid.UIGrid;
import org.springframework.stereotype.Component;

import static examsystem.frontend.uiutils.prop.UtilsView.*;
import static examsystem.frontend.uiutils.prop.WidthAndHeight.*;

@Component
public class SuperiorGrid {

  public Grid<SuperiorDTO> initGrid(SuperiorServiceImpl service) {
    Grid<SuperiorDTO> grid = UIGrid
            .createSuperiorGrid(service.findAllSuperiorsDTO());
    UIGrid.gridTheming(grid);
    setupColumns(grid);
    return grid;
  }

  private void setupColumns(Grid<SuperiorDTO> grid) {
    grid.addColumn(SuperiorDTO::getEmail)
            .setWidth(WIDTH_270)
            .setHeader(USER_EMAIL);
    grid.addColumn(SuperiorDTO::getFirstName)
            .setHeader(USER_NAME)
            .setWidth(WIDTH_200);
    grid.addColumn(SuperiorDTO::getLastName)
            .setHeader(USER_SURNAME)
            .setWidth(WIDTH_200);
    grid.addColumn(SuperiorDTO::getUnit)
            .setHeader(USER_UNIT)
            .setWidth(WIDTH_150);
  }
}
