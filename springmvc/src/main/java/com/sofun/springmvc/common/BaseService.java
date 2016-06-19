package com.sofun.springmvc.common;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<T extends Serializable> {

	T getByMap(Map<String, Object> map);

	List<T> query(Map<String, Object> map);

	int delete(Integer id);

	int insert(T t);

	T find(Integer id);

	int update(T t);

}
