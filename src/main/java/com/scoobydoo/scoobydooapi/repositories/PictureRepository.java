package com.scoobydoo.scoobydooapi.repositories;

import com.scoobydoo.scoobydooapi.domain.Pictures;
import com.scoobydoo.scoobydooapi.domain.StoryText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PictureRepository extends JpaRepository<Pictures, Long> {

    @Query("from StoryText a where a.text like %:term%")
    List<StoryText> searchByTitleLike(@Param("term") String term);
}