package com.scoobydoo.scoobydooapi.repositories;

import com.scoobydoo.scoobydooapi.domain.StoryText;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StoryTextRepository extends JpaRepository<StoryText, Long> {
}
