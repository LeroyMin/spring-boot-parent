package cn.weizhis.module.login.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by minlee on 2018/4/7.
 */
public class UserInfoDTO {
    @Getter @Setter private String id;
    @Getter @Setter private String userName;
    @Getter @Setter private String name;
    @Getter @Setter private String passwords;
    @Getter @Setter private Integer state;
    @Getter @Setter private List<RoleDTO> roles;

    public static class RoleDTO{
        @Getter @Setter private String roleId;
    }
}
