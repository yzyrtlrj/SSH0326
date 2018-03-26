package com.cray.dao.impl;

import java.lang.reflect.ParameterizedType;

import com.cray.dao.BaseDao;

public abstract class BaseDaoImpl<T> implements BaseDao<T> {

protected Class<T> clazz;
/*
	public BaseDaoImpl() {
		ParameterizedType parameterizedType=(ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz=(Class<T>)parameterizedType.getActualTypeArguments()[0];
	}
	
	//DAO层根据主键查询数据
	@Override
	public T findById(Long id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(clazz, id);
	}
	
	//DAO层修改实体的方法
		@Override
		public void update(T entity) {
			// TODO Auto-generated method stub
			this.getHibernateTemplate().update(entity);
		}*/
}
