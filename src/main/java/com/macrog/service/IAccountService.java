package com.macrog.service;

import com.macrog.entity.Account;

import java.util.List;

/**
 * @author guohong
 * @date 2019/3/1
 */
public interface IAccountService {


    List<Account> findAll();

    Account findOne(int id);

    Account saveAndFlush(Account account);

    Account save(Account account);
}
