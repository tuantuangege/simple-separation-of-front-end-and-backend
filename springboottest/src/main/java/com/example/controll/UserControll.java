package com.example.controll;

import com.example.Mapper.TestMapper;
import com.example.entiry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LTX
 * @create 2020-09-14 17:11
 */
@RestController
@RequestMapping("/user")
public class UserControll {
    @Autowired
    private TestMapper testMapper;
    @GetMapping("/findAll")
    public List<User> findAll(){
        return testMapper.findAllUser();
    }
}
