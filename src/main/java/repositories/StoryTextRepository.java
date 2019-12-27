package repositories;

import domain.StoryText;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryTextRepository extends JpaRepository<StoryText, Long> {
}
