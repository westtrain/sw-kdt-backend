package com.codestates.seb.StatesAirlineServer.Domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AirportDTO {
    private String name;
    private String code;
}
