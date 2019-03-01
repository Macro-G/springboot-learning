package com.macrog.service.impl;

import com.macrog.dao.IAccountDAO;
import com.macrog.entity.Account;
import com.macrog.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guohong
 * @date 2019/3/1
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    IAccountDAO accountDAO;

    @Override
    public List<Account> findAll() {
        return accountDAO.findAll();
    }

    @Override
    public Account findOne(int id) {
        return accountDAO.findOne(id);
    }

    @Override
    public Account saveAndFlush(Account account) {
        return accountDAO.saveAndFlush(account);
    }

    @Override
    public Account save(Account account) {
        return accountDAO.save(account);
    }
}
