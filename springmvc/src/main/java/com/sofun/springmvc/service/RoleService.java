package com.sofun.springmvc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofun.springmvc.dao.RoleMapper;
import com.sofun.springmvc.pojo.Role;

@Service
public class RoleService {

	@Autowired
	private RoleMapper dao;

	public Role getByMap(Map<String, Object> map) {
		return dao.getByMap(map);
	}

	public List<Role> query(Map<String, Object> map) {
		return dao.query(map);
	}

	public int delete(Integer id) {
		return dao.delete(id);
	}

	public int insert(Role t) {
		return dao.insert(t);
	}

	public Role find(Integer id) {
		return dao.find(id);
	}

	public int update(Role t) {
		return dao.update(t);
	}

}
