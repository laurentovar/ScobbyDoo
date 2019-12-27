package com.scoobydoo.scoobydooapi.services;

import com.scoobydoo.scoobydooapi.domain.StoryText;

import java.util.List;

public interface StoryTextServices {
    StoryText findStoryTextById (Long id);

    List<StoryText> findAllStoryText();

    StoryText saveStoryText(StoryText storyText);
}
