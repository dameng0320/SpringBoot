package com.dameng.imp;

import com.dameng.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoimp implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao is running");
    }
}
