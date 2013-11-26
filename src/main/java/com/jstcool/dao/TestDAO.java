package com.jstcool.dao;

import com.jstcool.domain.TestDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-24
 * Time: 下午9:26
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class TestDAO extends AbstractDAO {
    public TestDTO findTestDTOByName(String name) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", name);
        return super.queryForObject(sql("findTestDTOByName"), map);
    }

    @Override
    protected String prefixName() {
        return "Test";
    }
}