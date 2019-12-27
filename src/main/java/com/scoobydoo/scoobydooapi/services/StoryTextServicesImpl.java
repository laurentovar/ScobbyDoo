package com.scoobydoo.scoobydooapi.services;

import com.scoobydoo.scoobydooapi.domain.StoryText;
import com.scoobydoo.scoobydooapi.repositories.StoryTextRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryTextServicesImpl implements StoryTextServices {
    private final StoryTextRepository storyTextRepository;

    public StoryTextServicesImpl(StoryTextRepository storyTextRepository) {
        this.storyTextRepository = storyTextRepository;
    }

    @Override
    public StoryText findStoryTextById(Long id) {
        return storyTextRepository.findById(id).get();
    }

    @Override
    public List<StoryText> findAllStoryText() {
        return storyTextRepository.findAll();
    }

    @Override
    public StoryText saveStoryText(StoryText storyText) {
        return storyTextRepository.save(storyText);
    }
}
