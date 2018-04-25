package cn.weizhis.module.user.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by minlee on 2018/3/11.
 */
@Entity
@Table(name = "tb_sys_permission")
public class SysPermission {
    @Id
    @Column(name = "ID", length = 50)
    private String id;

    @Version
    @Column(name = "version", length = 5)
    private Integer version;

    @Column(name = "name", length = 15)
    private String name;

    @Column(name = "parent_id", length = 50)
    private Long parentId;

    @Column(name = "parent_ids", length = 50)
    private String parentIds;

    @Column(name = "permission", length = 15)
    private String permission;

    @Column(name = "resource_type", length = 10)
    private String resourceType;

    @Column(name = "url", length = 50)
    private String url;

    @Column(name = "available")
    private Boolean available;

    @ManyToMany
    @JoinTable(name = "t_permission_role",joinColumns = @JoinColumn(name = "permission_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<SysRole> roles = new HashSet<>();

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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Set<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<SysRole> roles) {
        this.roles = roles;
    }
}
