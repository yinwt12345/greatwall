/*
 * Project Name:mall-user-web
 * File Name:MerchantInfoController.java
 * Package Name:com.mall.user.controller.MerchantInfoController
 * Date:2017-07-04 18:14:18
 * Copyright (c) 2017, ehking All Rights Reserved.
 */

package com.greatwall.controller;


import java.util.Map;
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
@RequestMapping(value = "merchantInfo")
public class MerchantInfoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MerchantInfoController.class);

	
    @RequestMapping("/detail/{id}")
    @ResponseBody
    public Map<String, Object> detail(@PathVariable String id) {
    	return null;
    	
    }

}
