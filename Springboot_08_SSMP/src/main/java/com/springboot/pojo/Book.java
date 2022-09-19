package com.springboot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
//有参构造
//@AllArgsConstructor
public class Book {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String type;
    private String name;
    private String brief;

}
