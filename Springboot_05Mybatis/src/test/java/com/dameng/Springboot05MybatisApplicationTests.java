package com.dameng;

import com.dameng.dao.bookDao;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisApplicationTests {

    @Autowired
    private bookDao bookDao;

    @Test
    void contextLoads() {
        System.out.println(bookDao.getbyid(1));
    }

}
