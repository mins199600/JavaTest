package com.ohgiraffers.test.run;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;
import com.ohgiraffers.test.view.BookMenu;

public class Application {
    public static void main(String[] args) {
        BookMenu bookmenu = new BookMenu();
        BookDTO bookdto = new BookDTO;
        BookManager bookmanager = new BookManager();
        System.out.println(bookmenu);
        System.out.println(bookdto);
        System.out.println(new BookManager());
    }

}
