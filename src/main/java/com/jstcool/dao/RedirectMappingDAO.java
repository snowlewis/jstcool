package com.jstcool.dao;

import com.jstcool.domain.redirect.RedirectMapping;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-26
 * Time: 下午10:08
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class RedirectMappingDAO extends AbstractDAO {
    @Override
    protected String prefixName() {
        return "RedirectMapping";
    }

    public RedirectMapping findByKey(String key) {
        return queryForObject(sql("findByKey"), key);
    }

    public Long insert(RedirectMapping rm) {
        return (Long) insert(sql("insert"), rm);
    }

}
