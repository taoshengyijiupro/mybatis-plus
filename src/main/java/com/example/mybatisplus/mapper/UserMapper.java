package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.service.SuperMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends SuperMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from user")
    List<User> selectListBySQL();

    List<User> selectListByWrapper(@Param("ew") Wrapper wrapper);
}
