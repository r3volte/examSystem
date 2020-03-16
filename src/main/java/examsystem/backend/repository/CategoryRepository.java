package examsystem.backend.repository;

import examsystem.backend.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

  Optional<Category> findByName(String name);

  Optional<Category> findByUnit(String unit);

  List<Category> findAllByUnit(String unit);
}
