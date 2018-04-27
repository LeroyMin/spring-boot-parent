package cn.weizhis.shiro.entity;

/**
 * Created by minlee on 2018/3/11.
 */
public class SysPermission {

    /**
     * 自增主键
     */
    private Long id;

    /**
     *
     * 权限名称
     */
    private String name;

    /**
     * 上级ID
     */
    private Long parentId;

    /**
     * 上级ID集合
     */
    private String parentIds;

    /**
     * 权限值
     */
    private String permission;

    /**
     *
     * 类型
     */
    private String resourceType;

    /**
     * 菜单地址
     */
    private String url;

    /**
     * 是否可见
     */
    private Boolean available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
