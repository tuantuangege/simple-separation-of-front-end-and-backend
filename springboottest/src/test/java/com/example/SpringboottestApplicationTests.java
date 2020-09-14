package com.example;

import com.example.Mapper.TestMapper;
import com.example.entiry.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringboottestApplicationTests {

    @Autowired
    private TestMapper testMapper;
    @Test
    void contextLoads() {
        List<User> lists=testMapper.findAllUser();
        System.out.println(lists);

    }

}
