package top.newhand.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import top.newhand.bean.Account;

import java.util.List;

/**
 * @ClassName AccountDao
 * @Author hexg8
 * @Date 2024/1/11 16:02
 * @Version 1.0
 * @Description TODO
 **/
@Repository
public interface AccountDao {
    @Insert("insert into user(id, name) values (#{id}, #{name})")
    void save(Account account);
    @Delete("delete from user where id = #{id}")
    void delete(Integer id);

    @Update("update user set id = #{id}, name = #{name} where id = #{id}")
    void update(Account account);

    @Select("select * from user")
    List<Account> findAll();
    @Select("select * from user where id = #{id}")
    Account findById(Integer id);
}
