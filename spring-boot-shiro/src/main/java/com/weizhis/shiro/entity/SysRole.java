package com.weizhis.shiro.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by minlee on 2018/3/11.
 */
@Entity
@Table(name = "tb_sys_role")
public class SysRole {
    @Id
    @Column(name = "ID", length = 50)
    private String id;

    @Version
    @Column(name = "version", length = 5)
    private Integer version;

    @Column(name = "desc", length = 32)
    private String desc;

    @Column(name = "role_name", length = 15)
    private String roleName;

    @Column(name = "available")
    private Boolean available;

    @ManyToMany(mappedBy = "roles")
    private Set<UserInfo> userInfos = new HashSet<>();

    @ManyToMany(mappedBy = "roles")
    private Set<SysPermission> permissions = new HashSet<>();

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Set<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(Set<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    public Set<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<SysPermission> permissions) {
        this.permissions = permissions;
    }
}
