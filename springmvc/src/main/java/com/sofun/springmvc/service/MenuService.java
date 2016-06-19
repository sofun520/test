package com.sofun.springmvc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofun.springmvc.dao.MenuMapper;
import com.sofun.springmvc.pojo.Menu;

@Service
public class MenuService {

	@Autowired
	private MenuMapper dao;

	public Menu getByMap(Map<String, Object> map) {
		return dao.getByMap(map);
	}

	public List<Menu> query(Map<String, Object> map) {
		return dao.query(map);
	}

	public int delete(Integer id) {
		return dao.delete(id);
	}

	public int insert(Menu t) {
		return dao.insert(t);
	}

	public Menu find(Integer id) {
		return dao.find(id);
	}

	public int update(Menu t) {
		return 0;
	}

}
