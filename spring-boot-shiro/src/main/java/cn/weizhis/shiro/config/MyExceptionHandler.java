package cn.weizhis.shiro.config;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.apache.commons.collections.map.HashedMap;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by minlee on 2018/3/11.
 * 全局异常处理
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        FastJsonJsonView view = new FastJsonJsonView();
        Map<String, Object> attributes = new HashedMap();
        if (e instanceof UnauthenticatedException){
            attributes.put("code", "1000001");
            attributes.put("msg", "token错误");
        }else if (e instanceof UnauthorizedException) {
            attributes.put("code", "1000002");
            attributes.put("msg", "用户无权限");
        }else {
            attributes.put("code", "1000003");
            attributes.put("msg", e.getMessage());
        }
        view.setAttributesMap(attributes);
        modelAndView.setView(view);
        return modelAndView;
    }
}
