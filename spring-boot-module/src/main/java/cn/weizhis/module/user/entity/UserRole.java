package cn.weizhis.module.user.entity;

public class UserRole {

    /**
     * 唯一主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long uId;

    /**
     * 角色ID
     */
    private Long rId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public Long getrId() {
        return rId;
    }

    public void setrId(Long rId) {
        this.rId = rId;
    }
}
