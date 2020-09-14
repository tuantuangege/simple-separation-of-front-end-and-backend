package com.example.Mapper;

import com.example.entiry.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author LTX
 * @create 2020-09-14 17:03
 */
@Mapper
public interface TestMapper {
    @Select("SELECT * FROM users WHERE id=#{id}")
    public User findUser(Integer id);

    @Select("SELECT * FROM users")
    public List<User> findAllUser();
}
