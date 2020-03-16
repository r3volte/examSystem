package examsystem.backend.repository;

import examsystem.backend.model.entity.Trainer;
import examsystem.backend.model.utility.Unit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TrainerRepositoryTest {

  @Autowired
  private TestEntityManager entityManager;
  @Autowired
  private TrainerRepository trainerRepository;


  @Test
  public void whenFindByName_thenReturnTrainer() {
    Trainer alex = getTrainer();

    Optional<Trainer> found = trainerRepository
            .findByLastName(alex.getLastName());

    assertEquals(found.get().getLastName(), alex.getLastName());
  }


  @Test
  public void whenFindByName_thenNotReturnTrainer() {
    Trainer alex = getTrainer();

    Optional<Trainer> found = trainerRepository
            .findByLastName(alex.getLastName());

    System.out.println(found.get());
    assertNotEquals(found.get().getLastName(), "Not Alex");
  }

  @Test
  public void findTrainerById_thenReturnTrainer() {

    Optional<Trainer> found = trainerRepository
            .findById(4L);

    assertNotNull(found);
  }

  private Trainer getTrainer() {
    Trainer alex = new Trainer();
    alex.setFirstName("Alex");
    alex.setLastName("Two");
    alex.setUnit(Unit.HULTAFORS);
    trainerRepository.save(alex);
    return alex;
  }

}
