package com.baomidou.hibernateplus.dao;

import com.baomidou.hibernateplus.page.Page;
import com.baomidou.hibernateplus.query.Wrapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * IDao接口
 * </p>
 *
 * @author Caratacus
 * @date 2016-10-23
 */
public interface IDao<T, V> {
	/**
	 * 保存方法
	 *
	 * @param o
	 * @return T
	 */
	public T save(T o);

	/**
	 * 删除方法
	 *
	 * @param o
	 */
	public void delete(T o);

	/**
	 * 修改方法
	 *
	 * @param o
	 */
	public void update(T o);

	/**
	 * 保存/修改方法
	 *
	 * @param o
	 */
	public void saveOrUpdate(T o);

	/**
	 * 根据id获取对象
	 *
	 * @param id
	 * @return T
	 */
	public T get(Serializable id);

	/**
	 * 批量添加
	 *
	 * @param list
	 * @return
	 */
	public void insertWithBatch(List<T> list);

	/**
	 * 批量修改
	 *
	 * @param list
	 * @return
	 */
	public void updateWithBatch(List<T> list);

	/**
	 * 查询结果集
	 *
	 * @return List<T>
	 */
	public List<T> query();

	/**
	 * 查询结果集
	 *
	 * @param property
	 * @param value
	 * @return List<T>
	 */
	public List<T> query(String property, Object value);

	/**
	 * 查询结果集
	 *
	 * @param property
	 * @param value
	 * @return List<T>
	 */
	public List<T> query(String[] property, Object... value);

	/**
	 * 查询结果集
	 *
	 * @param map
	 * @return List<T>
	 */
	public List<T> query(Map<String, Object> map);

	/**
	 * 根据class生成count语句执行
	 *
	 * @return long
	 */
	public int selectCount();

	/**
	 * 根据class生成count语句执行
	 *
	 * @param property
	 * @param value
	 * @return long
	 */
	public int selectCount(String property, Object... value);

	/**
	 * 根据class生成count语句执行
	 *
	 * @param property
	 * @param value
	 * @return long
	 */
	public int selectCount(String[] property, Object... value);

	/**
	 * 根据class生成count语句执行
	 *
	 * @param map
	 * @return long
	 */
	public int selectCount(Map<String, Object> map);

	/**
	 * 查询结果集排序
	 *
	 * @param order
	 * @return List<T>
	 */
	public List<T> queryOrder(String order);

	/**
	 * 查询结果集排序
	 *
	 * @param property
	 * @param value
	 * @return List<T>
	 */
	public List<T> query(String order, String property, Object value);

	/**
	 * 查询结果集排序
	 *
	 * @param property
	 * @param value
	 * @return List<T>
	 */
	public List<T> query(String order, String[] property, Object... value);

	/**
	 * 查询结果集排序
	 *
	 * @param map
	 * @return List<T>
	 */
	public List<T> query(Map<String, Object> map, String order);

	public Page<V> selectPage(Wrapper wrapper, Page<V> page);

	public List<?> selectList(Wrapper wrapper);

	public int selectCount(Wrapper wrapper);

	/**
	 *
	 * 根据class生成Hql执行 (可强转为需要的对象)
	 *
	 * @param property
	 * @param value
	 * @return Object
	 *
	 */
	public T get(String property, Object value);

}
