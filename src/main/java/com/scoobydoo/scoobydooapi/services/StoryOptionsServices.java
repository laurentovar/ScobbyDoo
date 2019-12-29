package com.scoobydoo.scoobydooapi.services;

import com.scoobydoo.scoobydooapi.domain.StoryOptions;

import java.util.List;

public interface StoryOptionsServices {

    StoryOptions findStoryOptionById (Long id);

    Long findStepTextIDByID (Long id);

    List<StoryOptions> findOptionByID(Long id);

}
