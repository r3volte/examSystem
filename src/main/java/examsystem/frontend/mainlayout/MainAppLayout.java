package examsystem.frontend.mainlayout;


import com.github.appreciated.app.layout.component.appbar.AppBarBuilder;
import com.github.appreciated.app.layout.component.applayout.LeftLayouts;
import com.github.appreciated.app.layout.component.builder.AppLayoutBuilder;
import com.github.appreciated.app.layout.component.menu.left.builder.LeftAppMenuBuilder;
import com.github.appreciated.app.layout.component.menu.left.builder.LeftSubMenuBuilder;
import com.github.appreciated.app.layout.component.router.AppLayoutRouterLayout;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.github.appreciated.app.layout.entity.Section.FOOTER;
import static com.github.appreciated.app.layout.entity.Section.HEADER;
import static examsystem.frontend.uiutils.prop.MainLayoutProp.*;
import static examsystem.frontend.uiutils.prop.PageTittle.SUPERIORS;

@Push
@Viewport(VIEWPORT)
@PWA(name = PWA_NAME,
        shortName = PWA_SHORT_NAME)
@Component
@UIScope
@StyleSheet(CSS_STYLESHEET)
public class MainAppLayout extends AppLayoutRouterLayout<LeftLayouts.LeftResponsive> {

  private MainViewComponents mainViewComponents;

  @Autowired
  public MainAppLayout(MainViewComponents mainViewComponents) {
    this.mainViewComponents = mainViewComponents;
    initLayout();
  }

  private void initLayout() {
    adminBuildLayout();
  }

  private void adminBuildLayout() {
    init(AppLayoutBuilder.get(LeftLayouts.LeftResponsive.class)
            .withTitle(TITTLE)

            .withAppBar(AppBarBuilder.get()
                    .add(mainViewComponents.getButton())
                    .build())

            .withAppMenu(LeftAppMenuBuilder.get()
                    .addToSection(HEADER,
                            mainViewComponents.logoImage(),
                            mainViewComponents.menuLabel()
                    )

                    .addToSection(FOOTER,
                            mainViewComponents.versionLabel()
                    )

                    .add(mainViewComponents.leftHomeNavigation(),
                            LeftSubMenuBuilder.get(SUPERIORS, VaadinIcon.SPECIALIST.create())
                                    .add(mainViewComponents.superiorSubMenu())
                                    .build())

                    .build())
            .build());
  }

}
