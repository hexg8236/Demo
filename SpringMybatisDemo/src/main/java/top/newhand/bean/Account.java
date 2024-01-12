package top.newhand.bean;

/**
 * @ClassName Account
 * @Author hexg8
 * @Date 2024/1/11 16:03
 * @Version 1.0
 * @Description TODO
 **/
public class Account {
    public Long id;
    public String name;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
