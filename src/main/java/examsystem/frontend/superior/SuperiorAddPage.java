package examsystem.frontend.superior;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import examsystem.backend.model.utility.Unit;
import examsystem.backend.service.model.superior.SuperiorServiceImpl;
import examsystem.frontend.mainlayout.MainAppLayout;
import examsystem.frontend.superior.components.SuperiorBinder;
import examsystem.frontend.uiutils.button.UIButton;
import examsystem.frontend.uiutils.field.UIField;
import examsystem.frontend.uiutils.form.LayoutForms;
import examsystem.frontend.uiutils.service.DataProv;
import examsystem.frontend.uiutils.views.AbstractView;
import org.springframework.beans.factory.annotation.Autowired;

import static examsystem.frontend.uiutils.prop.MainLayoutProp.CSS_STYLESHEET;
import static examsystem.frontend.uiutils.prop.PageTittle.SUPERIOR_ADD;
import static examsystem.frontend.uiutils.prop.URLProp.SUPERIOR_ADD_URL;

@Route(value = SUPERIOR_ADD_URL,
        layout = MainAppLayout.class)
@PageTitle(SUPERIOR_ADD)
@StyleSheet(CSS_STYLESHEET)
public class SuperiorAddPage extends AbstractView {

  private final SuperiorBinder superiorBinder;
  private final SuperiorServiceImpl superiorService;

  @Autowired
  public SuperiorAddPage(SuperiorBinder superiorBinder,
                         SuperiorServiceImpl superiorService) {
    this.superiorBinder = superiorBinder;
    this.superiorService = superiorService;
    add(layout());
    layoutOptions();
  }


  private FormLayout layout() {
    EmailField email =
            UIField.createEmailField();
    TextField first =
            UIField.createNameField();
    TextField last =
            UIField.createSurnameField();

    ComboBox<Unit> unit =
            DataProv.createBox();
    Button addButton =
            UIButton.submitFormButton();

    superiorBinder.binder(email, first, last,
            addButton, unit, superiorService);
    return LayoutForms
            .superiorForm(email, first, last, unit, addButton);
  }

  private void layoutOptions() {
    setAlignItems(Alignment.CENTER);
  }
}
