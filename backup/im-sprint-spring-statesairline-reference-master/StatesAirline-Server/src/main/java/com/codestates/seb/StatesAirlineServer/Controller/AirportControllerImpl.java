package com.codestates.seb.StatesAirlineServer.Controller;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import com.codestates.seb.StatesAirlineServer.Data.AirportData;
import com.codestates.seb.StatesAirlineServer.Domain.AirportDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AirportControllerImpl implements AirportController{

    @Override
    @GetMapping(value = "/airport")
    public List<AirportDTO> AirportFindByKeyWord(@RequestParam(required = true) String query){
        return AirportData.getInstance().AirportList
                .stream()
                .filter(data -> data.getCode().contains(query.toUpperCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }

}
