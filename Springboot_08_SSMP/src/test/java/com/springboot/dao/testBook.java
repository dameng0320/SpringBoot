package com.springboot.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testBook {

    @Autowired
    private DaoMapper daoMapper;

    @Test
    void testGetByid(){
        System.out.println(daoMapper.selectById(1));
    }

    @Test
    void testSeva(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setBrief("测试数据123");
        daoMapper.insert(book);
    }

    @Test
    void testUpdata(){
        Book book = new Book();
        book.setId(9);
        book.setType("测试数据12345");
        book.setName("测试数据123");
        book.setBrief("测试数据123");

        daoMapper.updateById(book);
    }

    @Test
    void testDatale(){
        daoMapper.deleteById(9);
    }

    @Test
//    查询所有数据
    void testSelectAll(){
        System.out.println(daoMapper.selectList(null));
    }

    @Test
//    分页操作
    void testGetPage(){
        IPage page = new Page(2,5);
        daoMapper.selectPage(page,null);
    }

    @Test
    void testGetWhere(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","spring");
      daoMapper.selectList(qw);
    }

    @Test
    void testGetWhere2(){
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();
        qw.like(Book::getName,"c");
      daoMapper.selectList(qw);
    }

}
