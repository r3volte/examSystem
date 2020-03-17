package examsystem.frontend.home;

import static examsystem.frontend.uiutils.prop.PageTittle.HOME;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import examsystem.frontend.mainlayout.MainAppLayout;

@Route(value = "", layout = MainAppLayout.class)
@PageTitle(HOME)
public class HomePage extends VerticalLayout {


}
