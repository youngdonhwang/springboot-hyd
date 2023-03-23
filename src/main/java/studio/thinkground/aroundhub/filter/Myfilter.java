package studio.thinkground.aroundhub.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import studio.thinkground.aroundhub.interceptor.HttpInterceptor;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(filterName = "Myfilter")
@Component
public class Myfilter extends OncePerRequestFilter {

    private final Logger LOGGER = LoggerFactory.getLogger(HttpInterceptor.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
    throws ServletException,IOException{
        LOGGER.info("[hyd before filter]InsideOncePerRequest Filter originated by request {}",request.getRequestURI());
        filterChain.doFilter(request,response);
        LOGGER.info("[hyd after filter]InsideOncePerRequest Filter originated by request {}",request.getRequestURI());
    }

//    public void init(FilterConfig config) throws ServletException {
//    }
//
//    public void destroy() {
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
//        chain.doFilter(request, response);
//    }

}
