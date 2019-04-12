/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GlobalConst
 * Author:   anywhere
 * Date:     3/23 0023 14:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.delta.common.constant;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author anywhere
 * @create 3/23 0023
 * @since 1.0.0
 */
public interface GlobalConst {
    /**
     * session user
     */
    public static final String CURRENT_USER="current_user";

    public final String DOT_XML = ".xml";

    public final String DATE_FORMAT = "yyyy-MM-dd";

    public final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public final String DATE_TIME_FORMAT_IOS = "yyyy/MM/dd HH:mm:ss";

    public final String DATE_FORMAT_CHINESE = "yyyy年M月d日";

    public final String DATE_VERSION = "yyMMddHHmm";

    public static final String TOKEN="token";

    /**
     * 數據字典類型,知識庫類
     */
    public static final String KNOWLEDGE_TYPE="ZSKL";
    /**
     * 數據字典類型,API類
     */
    public static final String API_TYPE="APIL";

    /**
     * 角色集合
     */
    public static final String ROLES = "roles";
    /**
     * 菜單樹
     */
    public static final String MENUTREE = "menuTree";
    /**
     * 菜單集合
     */
    public static final String MENUS = "menus";

    /**
     * 權限集合
     */
    public static String AUTHS = "auths";
    /**
     * 全部菜單的總權限值
     */
    public static String AUTHVALUE = "authValue";

    /**
     * 單個菜單的權限值
     */
    public static String SINGLEAUTHVALUE = "singleAuthValue";

    /**
     * 按鈕權限值
     */
    public static String INSERT = "insert";
    public static String UPDATE = "update";
    public static String DELETE = "delete";
    public static String SELECT = "select";
    public static String CHECK = "check";
    public static String SETROLES = "setroles";
    public static String SETAUTHS = "setauths";
}