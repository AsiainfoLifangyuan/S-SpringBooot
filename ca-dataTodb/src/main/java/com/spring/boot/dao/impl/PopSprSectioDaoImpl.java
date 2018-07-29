package com.spring.boot.dao.impl;

import com.spring.boot.dao.PopSprSectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class PopSprSectioDaoImpl  implements PopSprSectionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Map<String, Object>> getPopSprSection(Integer id) {

        String sql = " Select * from POP_SPR_SECTION WHERE ID = ?";


        return null;
    }
}
