package examsystem.frontend.superior;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import examsystem.frontend.mainlayout.MainAppLayout;
import examsystem.frontend.uiutils.views.AbstractView;

import static examsystem.frontend.uiutils.prop.PageTittle.SUPERIORS;
import static examsystem.frontend.uiutils.prop.URLProp.SUPERIOR_URL;

@Route(value = SUPERIOR_URL, layout = MainAppLayout.class)
@PageTitle(SUPERIORS)
@StyleSheet("custom-styles.css")
public class SuperiorPage extends AbstractView {
}
