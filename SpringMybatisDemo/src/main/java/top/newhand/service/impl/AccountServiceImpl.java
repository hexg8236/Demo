package top.newhand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.newhand.bean.Account;
import top.newhand.dao.AccountDao;
import top.newhand.service.AccountService;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Author hexg8
 * @Date 2024/1/11 16:18
 * @Version 1.0
 * @Description TODO
 **/
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public void save(Account account) {
        accountDao.save(account);
    }
    @Override
    public void update(Account account){
        accountDao.update(account);
    }
    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }
    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
