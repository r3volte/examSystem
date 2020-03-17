package examsystem.backend.service.model.superior;

import examsystem.backend.exception.SuperiorException;
import examsystem.backend.model.entity.Superior;
import examsystem.backend.repository.SuperiorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SuperiorService {

  private final SuperiorRepository repository;

  @Autowired
  public SuperiorService(SuperiorRepository repository) {
    this.repository = repository;
  }

  public Superior findSuperiorByID(Long id) {
    Optional<Superior> superior = repository
            .findById(id);
    return superior
            .orElseThrow(SuperiorException::new);
  }

  public Superior findSuperiorByLastName(String surname) {
    Optional<Superior> superior = repository
            .findByLastName(surname);
    return superior
            .orElseThrow(SuperiorException::new);
  }

  public List<Superior> findAllSuperiors() {
    return repository.findAll();
  }

  public Superior addTrainer(Superior superior) {
    return repository.save(superior);
  }

  public void deleteSuperior(Superior superior) {
    repository.delete(superior);
  }

  @Transactional
  public void updateSuperior(Superior superior) {
    repository
            .updateSuperior(superior.getEmail(),
                    superior.getFirstName(),
                    superior.getLastName(),
                    superior.getId());
  }
}
