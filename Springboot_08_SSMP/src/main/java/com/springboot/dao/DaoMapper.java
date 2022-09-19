package com.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springboot.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DaoMapper extends BaseMapper<Book> {

}
