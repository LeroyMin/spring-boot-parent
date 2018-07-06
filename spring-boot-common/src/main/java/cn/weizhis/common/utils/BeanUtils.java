package cn.weizhis.common.utils;

import cn.weizhis.common.exception.BizzException;
import org.dozer.DozerBeanMapper;

/**
 * Created by minlee on 2018/4/15.
 */
public class BeanUtils {
    private static DozerBeanMapper mapper = new DozerBeanMapper();

    public static Object convertBean(Object source, Object target) throws BizzException{
        if (null == source){
            throw new BizzException("bean convert fail,the source object can not be null");
        }
        if (null == target){
            throw new BizzException("bean convert fail,the target object can not be null");
        }
        mapper.map(source, target);
        return target;
    }

    public static Object convertBean(Object source, Class targetCalss) throws BizzException{
        if (null == source){
            throw new BizzException("bean convert fail,the source object can not be null");
        }
        return mapper.map(source, targetCalss);
    }

}
