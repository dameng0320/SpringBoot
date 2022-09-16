package com.dameng.dao;

import com.dameng.pojo.book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface bookDao {

    @Select("select * from book where id=#{id}")
    public book getbyid(Integer id);

}
