package com.sofun.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.sofun.springmvc.pojo.Menu;
import com.sofun.springmvc.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService service;

	@RequestMapping(value = "/query", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public JSONObject queryPage(HttpServletRequest request) {
		JSONObject re = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		Menu m = service.find(2);
		re.put("data", m);
		return re;
	}

}
