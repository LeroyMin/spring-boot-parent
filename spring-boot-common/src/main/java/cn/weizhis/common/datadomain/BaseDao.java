package cn.weizhis.common.datadomain;

import cn.weizhis.common.component.Page;

import java.util.List;

public interface BaseDao<T> {

    T selectOne(T t);

    List<T> selectAll();

    Page<T> selectAllByPage(Page<T> page);

    void insert(T t);

    void update(T t);

    void delete(T t);
}
