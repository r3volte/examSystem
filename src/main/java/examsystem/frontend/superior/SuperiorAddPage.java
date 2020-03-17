package examsystem.frontend.superior;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import examsystem.frontend.mainlayout.MainAppLayout;

import static examsystem.frontend.uiutils.prop.PageTittle.SUPERIOR_ADD;
import static examsystem.frontend.uiutils.prop.URLProp.SUPERIOR_ADD_URL;

@Route(value = SUPERIOR_ADD_URL,
        layout = MainAppLayout.class)
@PageTitle(SUPERIOR_ADD)
public class SuperiorAddPage {
}
