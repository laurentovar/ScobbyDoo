package com.scoobydoo.scoobydooapi.repositories;

import com.scoobydoo.scoobydooapi.domain.StoryOptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StoryOptionsRepository extends JpaRepository<StoryOptions, Long> {

    //@Query("from StoryOptions where id /= %:id%")
    @Query("SELECT step_text_id FROM StoryOptions where id = :id")
    Long getStepTextID(@Param("id") Long id);
}