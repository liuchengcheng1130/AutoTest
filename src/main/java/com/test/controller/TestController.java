package com.test.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.test.config.response.ResponseResult;
import com.test.pojo.Test;
import com.test.service.TestService;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Api 注解在controller类上
 * @ApiModel 注解在类上，一般是实体类
 * @ApiOperation 注解在方法上，表明方法级解释
 * @ApiImplicitParams 注解在方法上，一般与@ApiImplicitParam共用，多个参数逗号隔开,表请求参数
 * @ApiResponses 注解在方法上表响应，一般与@ApiResponse公用
 *
 */


@RestController
@RequestMapping("/test")
@Api(value = "/test", tags = "测试接口")
public class TestController {
    @Resource
    TestService testService;


    @ResponseResult
    @GetMapping("/select")
    public Page<Test> selectByName(@Param("pageNum")Integer pageNum,@Param("pageSize") Integer pageSize, @Param("name") String name, @Param("sex")String sex, @Param("createTime")Date createTime){
        //使用分页插件,核心代码就这一行  pageNum当前页数   pageSize 当前页最多显示多少行
        PageHelper.startPage(pageNum,pageSize);
        return testService.selectByCondition(name,sex,createTime);
    }
}
