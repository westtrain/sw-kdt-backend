package com.codestates.seb.StatesAirlineServer.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import com.codestates.seb.StatesAirlineServer.Data.BookData;
import com.codestates.seb.StatesAirlineServer.Domain.BookDTO;


@RestController
public class BookControllerImpl implements BookController{

    @Override
    @GetMapping(value = "/book")
    public List<BookDTO>FindBook(@RequestParam(required = false) String flight_uuid, 
                                 @RequestParam(required = false) String phone){
        if(flight_uuid != null){
            return BookData.getInstance().getBookList().stream()
            .filter(item -> item.getFlight_uuid().equals(flight_uuid))
            .collect(Collectors.toList());
        }

        if(phone != null){
            return BookData.getInstance().getBookList().stream()
            .filter(item -> item.getPhone().equals(phone))
            .collect(Collectors.toList());
        }

        return BookData.getInstance().getBookList();
    }

    @Override
    @PostMapping(value = "/book")
    public BookDTO CreateBook(@RequestBody(required = true) BookDTO createData) {
        try{
            BookData.getInstance().getBookList().add(createData);
            return BookData.getInstance().getBookList().get(BookData.getInstance().getBookList().size()-1);

        }catch(Exception e){
            System.out.println("error : " + e);
            return null;
        }
    }

    @Override
    @DeleteMapping(value = "/book")
    public List<BookDTO> DeleteByPhone(@RequestParam(required = true) String phone){
        try{
            return BookData.getInstance().getBookList().stream()
            .filter(item -> !item.getPhone().equals(phone))
            .collect(Collectors.toList());
    
        }catch(Exception e){
            return null;
        }
    }
}
