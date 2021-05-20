package com.poccupine.hometest.service.impl;


import com.poccupine.hometest.model.Place;
import com.poccupine.hometest.repository.PlaceRepository;
import com.poccupine.hometest.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    PlaceRepository placeRepository;

    @Override
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }
}
