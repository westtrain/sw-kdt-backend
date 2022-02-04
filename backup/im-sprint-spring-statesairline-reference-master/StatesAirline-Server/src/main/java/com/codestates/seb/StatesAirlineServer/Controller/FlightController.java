package com.codestates.seb.StatesAirlineServer.Controller;

import java.util.List;

import com.codestates.seb.StatesAirlineServer.Domain.FlightDTO;

public interface FlightController {
    public List<FlightDTO.Info> FilterFlightList(String departure_times,String arrival_times,String departure,String destination);
    public FlightDTO.Info FindById(String id);
    public FlightDTO.Info UpdateFlightData(String id, FlightDTO.Request data);
}
