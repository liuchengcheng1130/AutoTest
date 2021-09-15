package com.test.pojo;


import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Data
@Repository
public class Test {
    Integer id;
    String name;
    String sex;
    Date  createTime;
    Date  updateTime;
    Date  deleteTime;
}
