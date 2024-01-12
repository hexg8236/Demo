package top.newhand.service;

import top.newhand.bean.Account;

import java.util.List;

/**
 * @ClassName AccountService
 * @Author hexg8
 * @Date 2024/1/11 16:18
 * @Version 1.0
 * @Description TODO
 **/
public interface AccountService {
    void save(Account account);
    void delete(Integer id);
    void update(Account account);
    List<Account> findAll();
    Account findById(Integer id);
}
