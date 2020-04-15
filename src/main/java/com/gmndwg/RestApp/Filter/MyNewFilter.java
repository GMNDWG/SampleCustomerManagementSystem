package com.gmndwg.RestApp.Filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;


@Component
public class MyNewFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("The new filter is called by gmndwg");

        chain.doFilter(request,response);
    }
}
