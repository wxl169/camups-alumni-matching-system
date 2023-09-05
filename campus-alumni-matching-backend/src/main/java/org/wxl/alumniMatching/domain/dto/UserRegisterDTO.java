package org.wxl.alumniMatching.domain.dto;

import lombok.Data;

@Data
public class UserRegisterDTO {
    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 校验密码
     */
    private String checkPassword;

}
