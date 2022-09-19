package com.springboot;

import com.springboot.dao.bookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot07DruidApplicationTests {

    @Autowired
    private bookDao bookDao;
    @Test
    void contextLoads() {
        System.out.println(bookDao.getbyid(1));
    }

}
