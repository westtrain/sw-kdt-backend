package com.codestates.seb.StatesAirlineServer.Data;

import java.util.ArrayList;

import com.codestates.seb.StatesAirlineServer.Domain.BookDTO;

public class BookData {
    private static final BookData instance = new BookData();
    private ArrayList<BookDTO> BookList = new ArrayList<>();

    public static BookData getInstance() {
        return instance;
    }

    public ArrayList<BookDTO> getBookList() {
        return BookList;
    }

    private BookData(){
        
    }
}
