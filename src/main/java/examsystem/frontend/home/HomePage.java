package examsystem.frontend.home;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import examsystem.frontend.mainlayout.MainAppLayout;

import static examsystem.frontend.uiutils.prop.PageTittle.HOME;


@Route(value = "", layout = MainAppLayout.class)
@PageTitle(HOME)
public class HomePage extends VerticalLayout {


}
