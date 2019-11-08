package com.example.manager.base;
import java.io.Serializable;
import java.util.List;

/**
 * 类名称：IBaseDao
 * 类描述：Dao基类（声明CRUD常用接口方法）
 * 说明：所有DAO层都必须继承此类
 *
 * @author PC-666
 */
public interface IBaseDao<T> {
    /**
     * 保存
     *
     * @param entity e
     * @throws Exception e
     */
    void insert(T entity) throws Exception;

    /**
     * 批量添加
     */
    void insert(List<T> entity) throws Exception;

    /**
     * 修改
     *
     * @param entity e
     * @throws Exception e
     */
    void update(T entity) throws Exception;

    /**
     * 删除
     *
     * @param id e
     * @throws Exception e
     */
    void deleteById(Serializable id) throws Exception;

    /**
     * 查询（ID）
     *
     * @param id e
     * @return T
     * @throws Exception e
     */
    T getById(Serializable id) throws Exception;

    /**
     * 查询（where）
     *
     * @param objectQuery ObjectQuery
     * @return List<T>
     * @throws Exception e
     */
    List<T> getByWhere(ObjectQuery objectQuery) throws Exception;

    //查询（All）

    /**
     * 删除
     *
     * @return List<T>
     * @throws Exception e
     */
    List<T> getAll() throws Exception;

    /**
     * 查询（分页查询_结果集）
     *
     * @param objectQuery e
     * @return List<T>
     * @throws Exception e
     */
    List<T> findQuery(ObjectQuery objectQuery) throws Exception;

    /**
     * 查询（分页查询_数量）
     *
     * @param objectQuery e
     * @return Integer
     * @throws Exception e
     */
    Integer findCount(ObjectQuery objectQuery) throws Exception;
}
