package com.poccupine.hometest.facade.impl;

import com.poccupine.hometest.converter.Converters;
import com.poccupine.hometest.converter.PlaceDTOConverter;
import com.poccupine.hometest.dto.PlaceDTO;
import com.poccupine.hometest.facade.PlaceFacade;
import com.poccupine.hometest.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlaceFacadeImpl implements PlaceFacade {

    @Autowired
    PlaceDTOConverter placeDTOConverter;

    @Autowired
    PlaceService placeService;

    @Override
    public List<PlaceDTO> getAllPlaces() {
        return Converters.convertAll(placeService.getAllPlaces(), placeDTOConverter);
    }
}
