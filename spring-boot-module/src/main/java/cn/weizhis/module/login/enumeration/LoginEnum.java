package cn.weizhis.module.login.enumeration;

/**
 * Created by minlee on 2018/4/7.
 */
public enum LoginEnum {
    LOGIN_SUCESS(0000, "登录成功"),
    LOGIN_NO_USER(0001, "该用户不存在"),
    LOGIN_PASSWORD_INVALID(0002, "密码错误"),
    LOGIN_STATE_INVALID(0003, "该用户已被冻结"),
    LOGIN_SERVICE_ERROR(0004, "服务器内部错误"),
    LOGIN_NOT_LOGIN(0005, "未登录");

    private LoginEnum(){}

    private LoginEnum(Integer loginCode, String msg){
        this.loginCode = loginCode;
        this.msg = msg;
    }
    private Integer loginCode;
    private String msg;

    public Integer getLoginCode() {
        return loginCode;
    }

    public String getMsg() {
        return msg;
    }
}
