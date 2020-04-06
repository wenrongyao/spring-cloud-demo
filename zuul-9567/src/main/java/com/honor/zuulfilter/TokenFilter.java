package com.honor.zuulfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rongyaowen
 * on 2019/8/22.
 * zuul的第二个功能，统一过滤
 * 请求过来以后，首先通过tomcat的过滤器，如果是对DispatcherServletd的请求，那么会通过springmvc的拦截器
 * 如果是路由，则不会通过拦截器，会经过ZUUL的过滤器
 */
@Component
public class TokenFilter extends ZuulFilter {

    /**
     * 过滤类型
     * <p>
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤顺序
     * 多个filter时，可以通过这边来执行顺序
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否需要过滤
     *
     * @return true 需要过滤
     */
    public boolean shouldFilter() {
        return true;
    }


    /**
     * 具体的过滤逻辑
     *
     * @return
     * @throws ZuulException
     */
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println((String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString())));
        Object accessToken = request.getParameter("token");
        if (accessToken == null) {
            System.out.println(("token is empty"));
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {
            }
            return null;
        }
        return null;
    }
}
