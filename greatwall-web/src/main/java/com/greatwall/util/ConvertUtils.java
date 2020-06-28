/*
 * Project Name:greatwall-web
 * File Name:ConvertUtils.java
 * Package Name:com.greatwall.util.ConvertUtils
 * Date:2018-01-29 16:02:31
 */

package com.greatwall.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ClassName:ConvertUtils <br/>
 * Date:     2018-01-29 16:02 <br/>
 *
 * @author yinwutuan
 * @since JDK 1.7
 */
public class ConvertUtils {
    
    public static String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "/n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return sb.toString();
    }
    
}
