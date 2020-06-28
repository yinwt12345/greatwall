/*
 * Project Name:mall-user-web
 * File Name:ResponseUtils.java
 * Package Name:com.mall.user.util.ResponseUtils
 * Date:2017-07-04 10:44:26
 */

package com.greatwall.util;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * 响应工具类
 */
public class ResponseUtils {
    
//    public static String toJSONString(ValueList valueList){
//        Map<String, Object> data = new HashMap<String, Object>();
//        data.put("rows", valueList.getList());
//        data.put("results", valueList.getValueListInfo().getTotalNumberOfEntries());
//        data.put("hasError", false);
//        return JSONObject.toJSONString(data);
//    }
    
    public static String toJSONString(String errorMsg){
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("hasError", true);
        data.put("error", errorMsg);
        return JSONObject.toJSONString(data);
    }

    public static String toJSONString(){
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("hasError", false);
        return JSONObject.toJSONString(data);
    }

    public static String toJSONString(Map<String, Object> map){
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("data",map);
//        for (String key:map.keySet()){
//            data.put(key,map.get(key));
//        }
        if (map.containsKey("hasError")){
            data.put("hasError",true);
        }else{
            data.put("hasError", false);
        }
        return JSONObject.toJSONString(data);
    }
    
    public static Map<String, Object> result(String code, Object obj){
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("code", code);
        data.put("content", obj);
        return data;
    }	
    
    public static Map<String, Object> success(Object obj){
    	String code = "100";
    	return result(code, obj);
    }
    
    public static Map<String, Object> fail(Object obj){
    	String code = "101";
    	return result(code, obj);
    }
    
}
