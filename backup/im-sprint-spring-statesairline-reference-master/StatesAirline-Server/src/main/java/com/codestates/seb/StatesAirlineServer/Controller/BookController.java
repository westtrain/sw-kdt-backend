package com.codestates.seb.StatesAirlineServer.Controller;

import java.util.List;

import com.codestates.seb.StatesAirlineServer.Domain.BookDTO;

public interface BookController {
    public List<BookDTO>FindBook(String flight_uuid, String phone);
    public BookDTO CreateBook(BookDTO createData);
    public List<BookDTO> DeleteByPhone(String phone);
}
