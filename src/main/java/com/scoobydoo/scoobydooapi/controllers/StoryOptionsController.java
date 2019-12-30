package com.scoobydoo.scoobydooapi.controllers;

import com.scoobydoo.scoobydooapi.domain.StoryOptions;
import com.scoobydoo.scoobydooapi.services.StoryOptionsServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(StoryOptionsController.BASE_URL)
public class StoryOptionsController {

    public static final String BASE_URL = "/api/v1/options";

    private final StoryOptionsServices storyOptionsServices;

    public StoryOptionsController(StoryOptionsServices storyOptionsServices) {
        this.storyOptionsServices = storyOptionsServices;
    }

    @GetMapping("/{id}")
    StoryOptions getOptionByID(@PathVariable Long id){
        return storyOptionsServices.findStoryOptionById(id);
    }
    //find through the id
    @GetMapping("/optionid={id}")
    public Long getStepTextIDByID(@PathVariable Long id){
        return storyOptionsServices.findStepTextIDByID(id);
    }



}
