package com.rainsoul.dao.impl;

import com.rainsoul.dao.AccountDao;
import com.rainsoul.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectByActno(String actno) {
        String sql = "select * from act where actno = ?";
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class), actno);
        return account;
    }

    @Override
    public int update(Account act) {
        String sql = "update act set balance = ? where actno = ?";
        return jdbcTemplate.update(sql, act.getBalance(), act.getActno());
    }
}
