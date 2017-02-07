package cn.crap.framework.base;

import cn.crap.utils.Page;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.List;
import java.util.Map;

public interface IBaseDao<T extends BaseModel> {
    T save(T t);

    void delete(T t);

    T get(String id);

    List<T> findByExample(T t);

    List<T> loadAll(T t);

    void update(T t);

    List<T> findByMap(Map<String, Object> map,
                      Page pageBean, String order);

    int getCount(Map<String, Object> map, String conditions);

    List<?> queryByHql(String hql, Map<String, Object> map);

    int update(String hql, Map<String, Object> map);

    HibernateTemplate gethibernateTemplate();

    List<T> findByMap(String construct, Map<String, Object> map, Page pageBean, String order);

    List<T> queryByHql(String hql, Map<String, Object> map, Page pageBean);
}
