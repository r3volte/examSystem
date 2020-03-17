package examsystem.backend.exception;

import com.vaadin.flow.router.NotFoundException;
import org.slf4j.LoggerFactory;

import static examsystem.backend.util.ExceptionProp.SUPERIOR_NOT_FOUND;

public class SuperiorException extends NotFoundException {

  public SuperiorException() {
    LoggerFactory.getLogger(this.getClass()).error(SUPERIOR_NOT_FOUND);
  }
}
