package com.codestates.seb.StatesAirlineServer.Data;

import java.util.ArrayList;

import com.codestates.seb.StatesAirlineServer.Domain.AirportDTO;

public class AirportData {
    private final static AirportData instance = new AirportData();
    public ArrayList<AirportDTO> AirportList = new ArrayList<>();

    public static AirportData getInstance() {
        return instance;
    }

    private AirportData(){
        AirportList.add(AirportDTO.builder()
                        .name("제주")
                        .code("CJU")
                        .build());

        AirportList.add(AirportDTO.builder()
                        .name("인천")
                        .code("ICN")
                        .build());

        AirportList.add(AirportDTO.builder()
                        .name("부산")
                        .code("PUS")
                        .build());

        AirportList.add(AirportDTO.builder()
                        .name("광주")
                        .code("KWJ")
                        .build());

        AirportList.add(AirportDTO.builder()
                        .name("방콕")
                        .code("BKK")
                        .build());
        
        AirportList.add(AirportDTO.builder()
                        .name("하노이")
                        .code("HAN")
                        .build());

        AirportList.add(AirportDTO.builder()
                        .name("오사카")
                        .code("KIX")
                        .build());

        AirportList.add(AirportDTO.builder()
                        .name("하얼빈")
                        .code("HRB")
                        .build());

        AirportList.add(AirportDTO.builder()
                        .name("웨이하이")
                        .code("WEH")
                        .build());

        AirportList.add(AirportDTO.builder()
                        .name("홍콩")
                        .code("HKG")
                        .build());
    }
    
}
