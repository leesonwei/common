package com.delta.common.code;

import com.delta.common.constant.GlobalConst;
import lombok.Getter;

/**
 * @Classname AuthrizeCode
 * @Date 2019/4/12 19:38
 * @Author LIZONG.WEI
 * @Since 1.8
 */
@Getter
public enum AuthrizeCode {

    //權限值
    INSERT(2,GlobalConst.INSERT),
    UPDATE(4,GlobalConst.UPDATE),
    DELETE(8,GlobalConst.DELETE),
    SELECT(16,GlobalConst.SELECT),
    CHECK(32,GlobalConst.CHECK),
    SETROLES(64,GlobalConst.SETROLES),
    SETAUTHS(128,GlobalConst.SETAUTHS);


    /**
     * 编码
     */
    private final int code;

    /**
     * 描述信息
     */
    private final String desc;

    AuthrizeCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }
}
