package com.sofun.springmvc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofun.springmvc.dao.RoleMenuMapper;
import com.sofun.springmvc.pojo.RoleMenu;

@Service
public class RoleMenuService {

	@Autowired
	private RoleMenuMapper dao;

	public RoleMenu getByMap(Map<String, Object> map) {
		return dao.getByMap(map);
	}

	public List<RoleMenu> query(Map<String, Object> map) {
		return dao.query(map);
	}

	public int delete(Integer id) {
		return dao.delete(id);
	}

	public int insert(RoleMenu t) {
		return dao.insert(t);
	}

	public RoleMenu find(Integer id) {
		return dao.find(id);
	}

	public int update(RoleMenu t) {
		return dao.update(t);
	}

}
