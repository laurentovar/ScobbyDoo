package controllers;

import domain.StoryText;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import services.StoryTextServices;

import java.util.List;

@RestController
@RequestMapping (StoryTextController.BASE_URL)
public class StoryTextController {

    public static final String BASE_URL = "/api/v1/storyText";
    private final StoryTextServices storyTextServices;

    public StoryTextController(StoryTextServices storyTextServices) {
        this.storyTextServices = storyTextServices;
    }
    @GetMapping
    List<StoryText> getAllStoryText(){
        return storyTextServices.findAllStoryText();
    }
    //find through the id
    @GetMapping("/{id}")
    public StoryText getStoryTextById(@PathVariable Long id){
        return storyTextServices.findStoryTextById(id);
    }

    //adding a new story
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StoryText saveStoryText (@RequestBody StoryText storyText){
        return storyTextServices.saveStoryText(storyText);
    }
}
