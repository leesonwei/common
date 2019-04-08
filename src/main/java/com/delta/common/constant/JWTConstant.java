package com.delta.common.constant;

/**
 * 全局配置常量
 * @author lizong.wei
 *
 */
public interface JWTConstant {

	/**
	 * jwt
	 */
	//jwt签发者
	public static final String JWT_ISS = "jwt-delta";
	//密匙
	public static final String JWT_SECERT = "46cc793c53dc451b8a4fe2cd0bb00847";
	//token有效时间,单位毫秒
	public static final long JWT_TTL = 2 *60*60*1000;
	//token 失效
	public static final long JWT_EXP = -2 *60*60*1000;
}