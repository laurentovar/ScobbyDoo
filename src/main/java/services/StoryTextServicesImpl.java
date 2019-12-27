package services;

import domain.StoryText;
import repositories.StoryTextRepository;

import java.util.List;

public class StoryTextServicesImpl implements StoryTextServices {

    private final StoryTextRepository storyTextRepository;

    public StoryTextServicesImpl(StoryTextRepository storyTextRepository) {
        this.storyTextRepository = storyTextRepository;
    }

    @Override
    public StoryText findStoryTextById(Long id) {
        return storyTextRepository.getOne(id);
    }

    @Override
    public List<StoryText> findAllStoryText() {
        return storyTextRepository.findAll();
    }
}