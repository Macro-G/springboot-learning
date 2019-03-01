package com.macrog.dao;

import com.macrog.entity.Account;

import java.util.List;

/**
 * @author guohong
 * @date 2019/3/1
 */
public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
