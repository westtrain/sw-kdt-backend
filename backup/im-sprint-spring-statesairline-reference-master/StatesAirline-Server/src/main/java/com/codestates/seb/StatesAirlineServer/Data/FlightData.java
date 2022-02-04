package com.codestates.seb.StatesAirlineServer.Data;

import java.util.ArrayList;

import com.codestates.seb.StatesAirlineServer.Domain.FlightDTO;

public class FlightData {
    private static final FlightData instacne = new FlightData();
    private ArrayList<FlightDTO.Info> FlightList = new ArrayList<>();

    public static FlightData getInstacne() {
        return instacne;
    }

    public ArrayList<FlightDTO.Info> getFlightList() {
        return FlightList;
    }

    private FlightData(){
        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40byd")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());


        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba48bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());
        
        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdbr40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());
                
        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fd7a40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40bod")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());
 
        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba44bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba42bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());
       
        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba41bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());
     
        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba99bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());
   
        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba50bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());
    }

    public void Reset(){
        FlightList.clear();
        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40byd")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());


        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba48bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdbr40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fd7a40bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba40bod")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba44bed")
                .departure("ICN")
                .destination("CJU")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba42bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba41bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba99bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-03T12:00:00")
                .arrival_times("2021-12-04T12:00:00")
                .build());

        FlightList.add(FlightDTO.Info.builder()
                .uuid("af6fa55c-da65-47dd-af23-578fdba50bed")
                .departure("CJU")
                .destination("ICN")
                .departure_times("2021-12-02T12:00:00")
                .arrival_times("2021-12-03T12:00:00")
                .build());
    }
}
