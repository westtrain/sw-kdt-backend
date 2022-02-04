package com.codestates.seb.StatesAirlineServer.Domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class FlightDTO {

    @Getter
    @Setter
    @Builder
    public static class Info{
        private String uuid;
        private String departure;
        private String destination;
        private String departure_times;
        private String arrival_times;
    }

    @Getter
    @Setter
    public static class Request{
        private String departure;
        private String destination;
        private String departure_times;
        private String arrival_times;
    }

    @Getter
    @Setter
    @Builder
    public static class Response{
        private String uuid;
        private String departure;
        private String destination;
        private String departure_times;
        private String arrival_times;
    }

}
