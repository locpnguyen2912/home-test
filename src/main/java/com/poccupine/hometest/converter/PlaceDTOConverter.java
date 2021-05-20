package com.poccupine.hometest.converter;



import com.poccupine.hometest.dto.PlaceDTO;
import com.poccupine.hometest.model.Place;
import org.springframework.stereotype.Service;

@Service
public class PlaceDTOConverter implements Converter<Place, PlaceDTO> {


    @Override
    public PlaceDTO convert(Place source) {

        if(source == null) {
            return null;
        }

        PlaceDTO target = new PlaceDTO();
        target.setId(source.getId());
        target.setName(source.getName());
        target.setVisited(source.getVisited());
        return target;
    }
}
