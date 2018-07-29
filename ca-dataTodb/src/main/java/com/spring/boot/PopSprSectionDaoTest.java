package com.spring.boot;


import com.spring.boot.dao.PopSprSectionDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PopSprSectionDaoTest {

    @Autowired
    private PopSprSectionDao dao;

    @Test
    public void test(){

        List<Map<String,Object>> list = dao.getPopSprSection(20180202);

        System.out.println(list.toString());
    }
}
