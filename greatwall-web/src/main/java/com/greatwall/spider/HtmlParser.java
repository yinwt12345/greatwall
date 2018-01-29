/*
 * Project Name:greatwall-web
 * File Name:JianDanHtmlParser.java
 * Package Name:com.greatwall.spider.JianDanHtmlParser
 * Date:2018-01-29 16:12:15
 * Copyright (c) 2018, ehking All Rights Reserved.
 */

package com.greatwall.spider;

import java.util.ArrayList;
import java.util.List;

public class HtmlParser implements Runnable {
	private String html;
	private int page;
	public HtmlParser(String html, int page) {
		this.html = html;
		this.page = page;
	}
	
	public void run() {
		System.out.println("==========第"+page+"页============");
		List<String> list = new ArrayList<String>();
		html = html.substring(html.indexOf("commentlist"));
		String[] images = html.split("li>");
		for (String image : images) {
			String[] ss = image.split("br");
			for (String s : ss) {
				if (s.indexOf("<img src=") > 0) {
					try{
						int i = s.indexOf("<img src=\"") + "<img src=\"".length();
						list.add(s.substring(i, s.indexOf("\"", i + 1)));
					}catch (Exception e) {
						System.out.println(s);
					}
					
				}
			}
		}
		for(String imageUrl : list){
			if(imageUrl.indexOf("sina")>0){
				new Thread(new ImageCreator(imageUrl,page)).start();
			}
		}
	}
}
