package com.dameng;

import com.dameng.imp.BookDaoimp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04ApplicationTests {

    @Autowired
    private BookDaoimp book;
    @Test
    void contextLoads() {
        book.save();
    }

}
