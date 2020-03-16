package examsystem.backend.repository;

import examsystem.backend.model.entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResultRepository extends JpaRepository<Results, Long> {

  Optional<Results> findById(Long id);

  @Query(value = "SELECT * FROM exam_result ORDER BY Id DESC LIMIT 1", nativeQuery = true)
  Optional<Results> findLastResultRecord();

  @Modifying
  @Query("update Results u set u.result = ?1 where u.id = ?2")
  void updateExamResult(int result, Long id);
}
