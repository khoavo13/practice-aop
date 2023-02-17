package com.likelion.practiceaop.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(1)
public class TransactionFilter implements Filter {
    private static final String USER_AGENT_HEADER = "User-Agent";
    private static final String POSTMAN_USER_AGENT = "Postman";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String userAgent = httpRequest.getHeader(USER_AGENT_HEADER);

        if (userAgent != null && userAgent.contains(POSTMAN_USER_AGENT)) {
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
            httpResponse.getWriter().write("Ban dang yeu cau tu Postman!");
        } else {
            chain.doFilter(request, response);
        }
    }
}
