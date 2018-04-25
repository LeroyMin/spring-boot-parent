package cn.weizhis.shiro.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by minlee on 2018/3/11.
 */
@Entity
@Table(name = "tb_user_info")
public class UserInfo {

    @Id
    @Column(name = "ID", length = 50)
    private String id;

    @Version
    @Column(name = "version", length = 5)
    private Integer version;

    @Column(name = "name", length = 32)
    private String name;

    @Column(name = "password", length = 64)
    private String password;

    @Column(name = "salt", length = 32)
    private String salt;

    @Column(name = "state", length = 3)
    private Integer state;

    @Column(name = "user_name", length = 32)
    private String userName;

    @ManyToMany
    @JoinTable(name = "t_user_role", joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<SysRole> roles = new ArrayList<>();

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

    /**
     * 密码盐.
     *
     * @return
     */
    public String getCredentialsSalt() {
        return this.userName + this.salt;
    }
}
