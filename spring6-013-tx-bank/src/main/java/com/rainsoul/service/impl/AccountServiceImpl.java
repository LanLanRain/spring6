package com.rainsoul.service.impl;

import com.rainsoul.dao.AccountDao;
import com.rainsoul.pojo.Account;
import com.rainsoul.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * AccountServiceImpl 类实现了 AccountService 接口，提供账户转账功能。
 */
@Service("accountService")
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    // 资源注入，指定要注入的DAO对象的名称为"accountDao"
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    /**
     * 实现账户之间的资金转账。
     *
     * @param fromActno 起始账户账号
     * @param toActno 目标账户账号
     * @param money 转账金额
     * @throws RuntimeException 当起始账户余额不足或转账操作失败时抛出异常
     */
    @Override
    public void transfer(String fromActno, String toActno, double money) {
        // 根据账号查询起始账户
        Account fromAccount = accountDao.selectByActno(fromActno);
        // 检查起始账户余额是否充足
        if (fromAccount.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }
        // 根据账号查询目标账户
        Account toAccount = accountDao.selectByActno(toActno);
        // 更新起始账户和目标账户的余额
        fromAccount.setBalance(fromAccount.getBalance() - money);
        toAccount.setBalance(toAccount.getBalance() + money);
        // 更新数据库中的账户信息
        int count = accountDao.update(fromAccount);
        // 模拟异常
        String s = null;
        s.toString();
        count += accountDao.update(toAccount);
        // 检查是否有两个账户的信息都成功更新了
        if (count != 2) {
            throw new RuntimeException("转账失败");
        }
    }
}
