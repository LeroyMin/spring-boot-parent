package cn.weizhis.shiro.entity;

import javax.persistence.*;

/**
 * Created by minlee on 2018/3/11.
 */
@Entity
@Table(name = "tb_sys_user")
public class SysUser {
    @Id
    @Column(name = "ID", length = 50)
    private String id;

    @Version
    @Column(name = "version", length = 5)
    private Integer version;

    @Column(name = "user_name", length = 5)
    private String username;

    @Column(name = "password", length = 5)
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
