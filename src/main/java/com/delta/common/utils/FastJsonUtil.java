/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FastJsonUtil
 * Author:   Administrator
 * Date:     2018/12/27 20:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.delta.common.utils;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2018/12/27
 * @since 1.0.0
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;
import java.util.Map;

/**
 * fastjson工具类
 * @version:1.0.0
 */
@SuppressWarnings("unchecked")
public class FastJsonUtil {
    
    private static final SerializeConfig config;
    
    static {
        config = new SerializeConfig();
        // 使用和json-lib兼容的日期输出格式
        config.put(java.util.Date.class, new JSONLibDataFormatSerializer());
        // 使用和json-lib兼容的日期输出格式
        config.put(java.sql.Date.class, new JSONLibDataFormatSerializer());
    }
    
    private static final SerializerFeature[] features = {
            // 输出空置字段
            SerializerFeature.WriteMapNullValue,
            // list字段如果为null，输出为[]，而不是null
            SerializerFeature.WriteNullListAsEmpty,
            // 数值字段如果为null，输出为0，而不是null
            SerializerFeature.WriteNullNumberAsZero,
            // Boolean字段如果为null，输出为false，而不是null
            SerializerFeature.WriteNullBooleanAsFalse,
            // 字符类型字段如果为null，输出为""，而不是null
            SerializerFeature.WriteNullStringAsEmpty
    };
    
    
    public static String convertObjectToJSON(Object object) {
        return JSON.toJSONString(object, config, features);
    }
    
    public static String toJSONNoFeatures(Object object) {
        return JSON.toJSONString(object, config);
    }
    
    
    
    public static Object toBean(String text) {
        return JSON.parse(text);
    }
    
    public static <T> T toBean(String text, Class<T> clazz) {
        return JSON.parseObject(text, clazz);
    }
    
    /**
     *  转换为数组
     * @param text
     * @return
     */
    public static <T> Object[] toArray(String text) {
        return toArray(text, null);
    }
    
    /**
     *  转换为数组
     * @param text
     * @param clazz
     * @return
     */
    public static <T> Object[] toArray(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz).toArray();
    }
    
    /**
     * 转换为List
     * @param text
     * @param clazz
     * @return
     */
    public static <T> List<T> toList(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz);
    }
    
    /**
     * 将string转化为序列化的json字符串
     * @param text
     * @return
     */
    public static Object textToJson(String text) {
        Object objectJson  = JSON.parse(text);
        return objectJson;
    }
    
    /**
     * json字符串转化为map
     * @param s
     * @return
     */
    public static <K, V> Map<K, V>  stringToCollect(String s) {
        Map<K, V> m = (Map<K, V>) JSONObject.parseObject(s);
        return m;
    }
    
    /**
     * 转换JSON字符串为对象
     * @param jsonData
     * @param clazz
     * @return
     */
    public static Object convertJsonToObject(String jsonData, Class<?> clazz) {
        return JSONObject.parseObject(jsonData, clazz);
    }
    
    /**
     * 将map转化为string
     * @param m
     * @return
     */
    public static <K, V> String collectToString(Map<K, V> m) {
        String s = JSONObject.toJSONString(m);
        return s;
    }
}