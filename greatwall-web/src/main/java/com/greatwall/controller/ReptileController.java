/*
 */

package com.greatwall.controller;


import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.greatwall.spider.HtmlParser;
import com.greatwall.util.ConvertUtils;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * ClassName:MerchantInfoController <br/>
 * Date:     2017-07-04 18:14 <br/>
 *
 * @author yinwutuan
 * @see
 * @since JDK 1.7
 */
@Controller
@RequestMapping(value = "reptile")
public class ReptileController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReptileController.class);

	
    @RequestMapping("/detail/{id}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable String id) {
        LOGGER.info("1wqeqweqeqw");
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("111",1111);
    	return map;
    }
    
    @RequestMapping("/captureImages")
    @ResponseBody
    public void captureImagesWithUrl(@PathVariable String url) {
        LOGGER.info("ReptileController captureImagesWithUrl start url:[{}]",url);
        try{
            HttpClient httpClient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(url);
            HttpResponse response = httpClient.execute(httpget);
            InputStream in = response.getEntity().getContent();
            String content = ConvertUtils.convertStreamToString(in);
            new Thread(new HtmlParser(content, 1)).start();
        }catch(Exception e){
        
        }
        
    }
    
    public static void main(String[] args) {
        try{
            HttpClient httpClient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet("http://jandan.net/ooxx/page-" + 1);
            httpget.addHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36");
            httpget.addHeader("Cookie","_gat=1; nsfw-click-load=off; gif-click-load=on; _ga=GA1.2.1861846600.1423061484");
            HttpResponse response = httpClient.execute(httpget);
            InputStream in = response.getEntity().getContent();
            String content = ConvertUtils.convertStreamToString(in);
            new Thread(new HtmlParser(content, 1)).start();
        }catch(Exception e){
        
        }
    }

}
