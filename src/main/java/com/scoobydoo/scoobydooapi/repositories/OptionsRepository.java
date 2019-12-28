package com.scoobydoo.scoobydooapi.repositories;

import com.scoobydoo.scoobydooapi.domain.StoryText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface OptionsRepository extends JpaRepository<StoryText, Long> {

    @Query("from StoryText a where a.text like %:term%")
    List<StoryText> searchByTitleLike(@Param("term") String term);
}