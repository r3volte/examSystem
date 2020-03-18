package examsystem.frontend.mainlayout;

import com.github.appreciated.app.layout.component.menu.left.items.LeftNavigationItem;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import examsystem.frontend.home.HomePage;
import examsystem.frontend.superior.SuperiorAddPage;
import examsystem.frontend.superior.SuperiorPage;
import examsystem.frontend.uiutils.button.UIButton;
import examsystem.frontend.uiutils.label.UILabel;
import org.springframework.stereotype.Component;

import java.io.Serializable;

import static examsystem.frontend.uiutils.label.UILabelProp.MENU_LABEL;
import static examsystem.frontend.uiutils.label.UILabelProp.VERSION_LABEL;
import static examsystem.frontend.uiutils.prop.MainLayoutProp.VERSION;
import static examsystem.frontend.uiutils.prop.PageTittle.*;
import static examsystem.frontend.uiutils.prop.WidthAndHeight.HEIGHT_100;
import static examsystem.frontend.uiutils.prop.WidthAndHeight.WIDTH_200;


@Component
public class MainViewComponents implements Serializable {

  public static final String LOGO_SCHENKER = "/frontend/images/logo.png";

  public Button getButton() {
    return UIButton.createLogoutButton();
  }

  public Image logoImage() {
    Image image = new Image();
    image.setSrc(LOGO_SCHENKER);
    image.setHeight(HEIGHT_100);
    image.setWidth(WIDTH_200);
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

  public LeftNavigationItem addSuperiorSubMenu() {
    return new LeftNavigationItem(SUPERIOR_ADD,
            VaadinIcon.PLUS.create(),
            SuperiorAddPage.class);
  }


  public LeftNavigationItem leftHomeNavigation() {
    return new LeftNavigationItem(HOME,
            VaadinIcon.HOME.create(),
            HomePage.class);
  }
}
