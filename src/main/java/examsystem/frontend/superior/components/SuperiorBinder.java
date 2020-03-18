package examsystem.frontend.superior.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import examsystem.backend.dto.SuperiorDTO;
import examsystem.backend.model.utility.Unit;
import examsystem.backend.service.model.superior.SuperiorServiceImpl;
import examsystem.frontend.uiutils.service.BeanBinder;
import org.springframework.stereotype.Component;

import static examsystem.frontend.uiutils.prop.BinderErrors.*;
import static examsystem.frontend.uiutils.prop.URLProp.SUPERIOR_URL;


@Component
public class SuperiorBinder {


  public void binder(EmailField email,
                     TextField first,
                     TextField last,
                     Button addButton,
                     ComboBox<Unit> box,
                     SuperiorServiceImpl superiorService) {
    BeanValidationBinder<SuperiorDTO> binder = BeanBinder.superiorBinder();
    SuperiorDTO superiorAdder = new SuperiorDTO();
    fieldBinder(email, first, last, box, binder);
    submitBinder(addButton, superiorService, binder, superiorAdder);
  }

  private void submitBinder(Button addButton,
                            SuperiorServiceImpl superiorService,
                            BeanValidationBinder<SuperiorDTO> binder,
                            SuperiorDTO superiorAdder) {
    addButton.addClickListener(buttonClickEvent -> {
      if (binder.writeBeanIfValid(superiorAdder)) {
        superiorService.addSuperior(superiorAdder);
        addButton.getUI()
                .ifPresent(ui -> ui.navigate(SUPERIOR_URL));
      }
    });
  }

  private void fieldBinder(EmailField email,
                           TextField first,
                           TextField last,
                           ComboBox<Unit> box,
                           BeanValidationBinder<SuperiorDTO> binder) {
    binder.forField(first)
            .asRequired(FIRST_NAME_ERROR)
            .bind(SuperiorDTO::getFirstName, SuperiorDTO::setFirstName);
    binder.forField(last)
            .asRequired(SECOND_NAME_ERROR)
            .bind(SuperiorDTO::getLastName, SuperiorDTO::setLastName);
    binder.forField(email)
            .asRequired(UNIT_EMAIL_ERROR)
            .bind(SuperiorDTO::getEmail, SuperiorDTO::setEmail);
    binder.forField(box)
            .asRequired(UNIT_NAME_ERROR)
            .bind(SuperiorDTO::getUnit, SuperiorDTO::setUnit);
  }
}
