package com.scoobydoo.scoobydooapi.controllers;

import com.scoobydoo.scoobydooapi.domain.Pictures;
import com.scoobydoo.scoobydooapi.services.PictureServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(PictureController.BASE_URL)
public class PictureController {

    public static final String BASE_URL = "/api/v1/picture";

    private final PictureServices pictureServices;

    public PictureController(PictureServices picServices) {
        this.pictureServices = picServices;
    }

    @GetMapping
    List<Pictures> getAllPictures(){
        return pictureServices.findAllPictures();
    }

    @GetMapping("/{id}")
    Pictures getPictureById(@PathVariable Long id){
        return pictureServices.findPictureUrlById(id);
    }


}
