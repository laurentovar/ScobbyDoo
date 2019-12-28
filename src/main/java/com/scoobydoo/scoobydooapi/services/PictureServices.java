package com.scoobydoo.scoobydooapi.services;

import com.scoobydoo.scoobydooapi.domain.Pictures;

import java.util.List;


public interface PictureServices {
    Pictures findPictureUrlById (Long id);

    List<Pictures> findAllPictures();
}
