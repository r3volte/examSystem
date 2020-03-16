package examsystem.backend.repository;

import examsystem.backend.model.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface QuestionRepository extends JpaRepository<Questions, Long> {

  Set<Questions> findByUnit(String unit);

  Optional<Questions> findById(Long id);

  @Modifying
  @Query("update Questions u set u.questionDescription = ?1, u.answerOne = ?2, u.answerTwo = ?3," +
          " u.answerThree = ?4, u.answerFour = ?5, u.correctAnswer = ?6 where u.id = ?7")
  void setQuestion(String questionDescription, String answerOne, String answerTwo,
                   String answerThree, String answerFour, String correctAnswer, Long id);

  @Modifying
  @Query("update Questions u set u.questionPicture = ?1 where u.id = ?2")
  void updateQuestionImage(byte[] image, Long id);

  @Query(value = "SELECT * FROM Questions WHERE category = ?1" +
          " and level = '1' order by rand() limit 20",
          nativeQuery = true)
  List<Questions> findQuestionByCategoryAndLevelOne(String category);

  @Query(value = "SELECT * FROM Questions WHERE category = ?1" +
          " and level between '1' and '2' order by rand() limit 20",
          nativeQuery = true)
  List<Questions> findQuestionByCategoryAndLevelTwo(String category);

  @Query(value = "SELECT * FROM Questions WHERE category = ?1" +
          " and level between '1' and '3' order by rand() limit 20",
          nativeQuery = true)
  List<Questions> findQuestionByCategoryAndLevelThree(String category);
}
