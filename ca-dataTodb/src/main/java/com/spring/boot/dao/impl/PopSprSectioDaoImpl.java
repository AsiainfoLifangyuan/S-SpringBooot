package com.spring.boot.dao.impl;

import com.spring.boot.dao.PopSprSectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class PopSprSectioDaoImpl  implements PopSprSectionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> getPopSprSection(Integer id) {

        String sql = " Select * from sub_prod_deluser WHERE ID = ?";

        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql,new Object[]{id});

        return list;
    }
}
