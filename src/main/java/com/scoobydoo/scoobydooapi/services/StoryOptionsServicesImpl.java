package com.scoobydoo.scoobydooapi.services;

import com.scoobydoo.scoobydooapi.domain.StoryOptions;
import com.scoobydoo.scoobydooapi.repositories.StoryOptionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryOptionsServicesImpl implements StoryOptionsServices {
    private final StoryOptionsRepository storyOptionsRepository;

    public StoryOptionsServicesImpl(StoryOptionsRepository storyOptionsRepository) {
        this.storyOptionsRepository = storyOptionsRepository;
    }

    @Override
    public StoryOptions findStoryOptionById(Long id) {
        return storyOptionsRepository.findById(id).get();

    }

    @Override
    public Long findStepTextIDByID(Long id) {
        return storyOptionsRepository.getStepTextID(id);
    }

    @Override
    public List<StoryOptions> findOptionByID(Long id) {
        return null;
    }


}
