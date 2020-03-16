package examsystem.frontend.mainlayout;

import com.github.appreciated.app.layout.component.menu.left.items.LeftNavigationItem;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import examsystem.frontend.home.HomePage;
import examsystem.frontend.superior.SuperiorPage;
import examsystem.frontend.uiutils.button.UIButton;
import examsystem.frontend.uiutils.label.UILabel;
import org.springframework.stereotype.Component;

import static examsystem.frontend.uiutils.label.UILabelProp.MENU_LABEL;
import static examsystem.frontend.uiutils.label.UILabelProp.VERSION_LABEL;
import static examsystem.frontend.uiutils.prop.MainLayoutProp.VERSION;
import static examsystem.frontend.uiutils.prop.PageTittle.*;


@Component
public class MainViewComponents {

  public static final String LOGO_SCHENKER = "/frontend/images/logo.png";
  private static final String WIDTH = "200px";
  private static final String HEIGHT = "100px";

  public Button getButton() {
    return UIButton.createLogoutButton();
  }

  public Image logoImage() {
    Image image = new Image();
    image.setSrc(LOGO_SCHENKER);
    image.setHeight(HEIGHT);
    image.setWidth(WIDTH);
    return image;
  }

  public Label menuLabel() {
    return UILabel
            .createMainLayoutLabel(MENU, MENU_LABEL);
  }

  public Label versionLabel() {
    return UILabel
            .createMainLayoutLabel(VERSION, VERSION_LABEL);
  }

  public LeftNavigationItem superiorSubMenu() {
    return new LeftNavigationItem(SUPERIORS,
            VaadinIcon.SPECIALIST.create(),
            SuperiorPage.class);
  }


  public LeftNavigationItem leftHomeNavigation() {
    return new LeftNavigationItem(HOME,
            VaadinIcon.HOME.create(),
            HomePage.class);
  }
}
