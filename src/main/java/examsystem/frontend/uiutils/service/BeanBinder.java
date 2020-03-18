package examsystem.frontend.uiutils.service;

import com.vaadin.flow.data.binder.BeanValidationBinder;
import examsystem.backend.dto.SuperiorDTO;
import org.springframework.stereotype.Component;

@Component
public class BeanBinder {

  public static BeanValidationBinder<SuperiorDTO> superiorBinder() {
    return new BeanValidationBinder<>(SuperiorDTO.class);
  }

  private BeanBinder() {
  }
}
