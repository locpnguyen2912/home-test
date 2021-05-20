package com.poccupine.hometest.controller;

import com.poccupine.hometest.facade.PlaceFacade;
import com.poccupine.hometest.payload.CustomPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/place")
public class PlaceController {

    @Autowired
    PlaceFacade placeFacade;

    @GetMapping("/list")
    public CustomPayload listPlaces() {
        return new CustomPayload(placeFacade.getAllPlaces());
    }
}
