package com.codestates.seb.StatesAirlineServer.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import com.codestates.seb.StatesAirlineServer.Data.FlightData;
import com.codestates.seb.StatesAirlineServer.Domain.FlightDTO;

@RestController
public class FlightControllerImpl implements FlightController {

    @Override
    @GetMapping(value = "/flight")
    public List<FlightDTO.Info> FilterFlightList(@RequestParam(required = false) String departure_times,
                                            @RequestParam(required = false) String arrival_times,
                                            @RequestParam(required = false) String departure,
                                            @RequestParam(required = false) String destination){

        if(departure_times != null && arrival_times != null){
            return FlightData.getInstacne().getFlightList()
                    .stream()
                    .filter(item -> item.getDeparture_times().equals(departure_times))
                    .filter(item -> item.getArrival_times().equals(arrival_times))
                    .collect(Collectors.toList());
        }
        else if(departure != null && destination != null){
            return FlightData.getInstacne().getFlightList()
                    .stream()
                    .filter(item -> item.getDeparture().equals(departure))
                    .filter(item -> item.getDestination().equals(destination))
                    .collect(Collectors.toList());
        }
        else{
            return FlightData.getInstacne().getFlightList();
        }
    }
    
    @Override
    @GetMapping(value = "/flight/{id}")
    public FlightDTO.Info FindById(@PathVariable(required = true) String id){
        return FlightData.getInstacne().getFlightList().stream()
                .filter(item -> item.getUuid().equals(id))
                .findFirst()
                .get();
    }

    @Override
    @PutMapping(value = "/flight/{id}")
    public FlightDTO.Info UpdateFlightData(@PathVariable(required = true) String id, @RequestBody(required = false) FlightDTO.Request data){
        
        try{
            FlightDTO.Info filterData = FlightData.getInstacne().getFlightList().stream()
                    .filter(item -> item.getUuid().equals(id))
                    .findAny()
                    .get();

            if(data.getDeparture() != null)filterData.setDeparture(data.getDeparture());
            if(data.getDestination() != null)filterData.setDestination(data.getDestination());
            if(data.getDeparture_times() != null)filterData.setDeparture_times(data.getDeparture_times());
            if(data.getArrival_times() != null)filterData.setArrival_times(data.getArrival_times());

            return filterData;

        }catch (Exception e){
            System.out.println("error :" + e);
            return null;
        }
    }
}
