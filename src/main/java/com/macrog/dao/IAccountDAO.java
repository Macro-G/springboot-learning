package com.macrog.dao;

import com.macrog.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author guohong
 * @date 2019/3/1
 */
public interface IAccountDAO extends JpaRepository<Account,Integer> {
    
}
