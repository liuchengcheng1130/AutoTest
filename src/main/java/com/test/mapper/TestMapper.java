package com.test.mapper;


import com.github.pagehelper.Page;
import com.test.pojo.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;


@Mapper
public interface TestMapper {

    //定义多条件分页查询 例如按照姓名，性别和时间范围查询
    Page<Test> selectByCondition(String name, String sex, Date createTime);



}
