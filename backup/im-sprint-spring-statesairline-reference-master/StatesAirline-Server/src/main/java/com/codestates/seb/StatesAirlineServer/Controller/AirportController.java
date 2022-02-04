package com.codestates.seb.StatesAirlineServer.Controller;

import java.util.List;

import com.codestates.seb.StatesAirlineServer.Domain.AirportDTO;

public interface AirportController {
    public List<AirportDTO> AirportFindByKeyWord(String query);
}
