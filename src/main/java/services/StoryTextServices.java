package services;

import domain.StoryText;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StoryTextServices {
    //methods

    StoryText findStoryTextById (Long id);

    List<StoryText> findAllStoryText();

    StoryText saveStoryText(StoryText storyText);
}
