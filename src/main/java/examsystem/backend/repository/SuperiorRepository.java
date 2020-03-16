package examsystem.backend.repository;

import examsystem.backend.model.entity.Superior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SuperiorRepository extends JpaRepository<Superior, Long> {

  @Modifying
  @Query("update Superior u set u.email = ?1, u.firstName = ?2, u.lastName = ?3 where u.id = ?4")
  void updateSuperior(String email, String firstName, String lastName, Long userId);

  Optional<Superior> findById(Long id);

  Optional<Superior> findByLastName(String surname);
}
