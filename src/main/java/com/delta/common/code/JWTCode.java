package com.delta.common.code;

import lombok.Getter;

/**
 * @Classname JWTCode
 * @Date 2019/4/8 13:48
 * @Author LIZONG.WEI
 * @Since 1.8
 */
@Getter
public enum JWTCode {
    /**
     * 成功
     */
    RESCODE_SUCCESS (1000,"token sign success"),

    /**
     * 失败
     */
    RESCODE_EXCEPTION (1001,"token sign exception"),
    //未登陆状态
    RESCODE_NOLOGIN (1002,"need login"),
    //无操作权限
     RESCODE_NOAUTH (1003,"no authority"),
    //登录过期
    RESCODE_LOGINEXPIRE (1004,"login expired"),

    /**
     * token
     */
    JWT_ERRCODE_EXPIRE (1005,"token expired"),
    //验证不通过
    JWT_ERRCODE_FAIL (1006,"token no valide");

    /**
     * 编码
     */
    private final int code;

    /**
     * 描述信息
     */
    private final String desc;

    JWTCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }
}
