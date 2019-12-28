package com.scoobydoo.scoobydooapi.services;

import com.scoobydoo.scoobydooapi.domain.Pictures;
import com.scoobydoo.scoobydooapi.repositories.PictureRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PictureServicesImpl implements PictureServices {
    private final PictureRepository pictureRepository;

    public PictureServicesImpl(PictureRepository PicRepository) {
        this.pictureRepository = PicRepository;
    }

    @Override
    public Pictures findPictureUrlById(Long id) {
        return pictureRepository.findById(id).get();
    }

    @Override
    public List<Pictures> findAllPictures() {
        return pictureRepository.findAll();
    }
}
