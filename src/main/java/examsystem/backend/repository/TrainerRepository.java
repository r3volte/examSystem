package examsystem.backend.repository;

import examsystem.backend.model.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {


  @Modifying
  @Query("update Trainer u set u.firstName = ?1, u.lastName = ?2 where u.id = ?3")
  void updateTrainer(String firstName, String lastName, Long userId);

  @Modifying
  @Query("update Trainer u set u.passedExams = ?1, u.completedExams = ?2 where u.id = ?3")
  void updateTrainerByResult(int passed, int completedExams, Long userId);

  Optional<Trainer> findById(Long id);

  Optional<Trainer> findByLastName(String lastName);
}
