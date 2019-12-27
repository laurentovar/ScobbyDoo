package services;

import domain.StoryText;

import java.util.List;

public interface StoryTextServices {
    //methods

    StoryText findStoryTextById (Long id);

    List<StoryText> findAllStoryText();
}
