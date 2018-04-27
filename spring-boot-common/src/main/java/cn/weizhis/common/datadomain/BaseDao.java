package cn.weizhis.common.datadomain;

import cn.weizhis.common.component.Page;

import java.util.List;

public interface BaseDao<T> {

    /**
     * 查询单条信息
     * @param t
     * @return
     */
    T selectOne(T t);

    /**
     * 查询所有信息
     * @return
     */
    List<T> selectAll();

    /**
     * 分页查询信息
     * @param page
     * @return
     */
    Page<T> selectAllByPage(Page<T> page);

    /**
     * 插入
     * @param t
     */
    void insert(T t);

    /**
     * 更新
     * @param t
     */
    void update(T t);

    /**
     * 删除
     * @param t
     */
    void delete(T t);
}
