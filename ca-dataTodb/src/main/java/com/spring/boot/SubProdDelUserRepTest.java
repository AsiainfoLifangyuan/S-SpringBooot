package com.spring.boot;


import com.spring.boot.bean.SubProdDeluser;
import com.spring.boot.repository.SubProdDeluserRep;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class SubProdDelUserRepTest {

    @Autowired
    private SubProdDeluserRep dao;


    @Test
    public void test(){
        SubProdDeluser bean = dao.findOne(5645);

        System.out.println( "查询结果是"+bean.getId());
    }
}
